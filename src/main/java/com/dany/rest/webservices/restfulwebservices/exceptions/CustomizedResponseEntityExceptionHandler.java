package com.dany.rest.webservices.restfulwebservices.exceptions;

import com.dany.rest.webservices.restfulwebservices.user.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

/**
 * Created by bautisj on 6/29/2018.
 */
@RestControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler
        extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception exception, WebRequest webRequest){
       ExceptionResponse exceptionResponse =
               new ExceptionResponse(new Date(), exception.getMessage(), webRequest.getDescription(false));
        return new ResponseEntity(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
/*
    @ExceptionHandler(UserNotFoundException.class)
    public final ResponseEntity<Object> handleUserNotFoundException
        ExceptionResponse exceptionResponse =
                new ExceptionResponse(new Date(), exception.getMessage(), webRequest.getDescription(false));
        return new ResponseEntity(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
*/
}
