package com.dany.rest.webservices.restfulwebservices.helloworld;

/**
 * Created by bautisj on 6/26/2018.
 */
public class HelloWorldBean {

    public String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }

    public String setMessage (String message){
        return this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
