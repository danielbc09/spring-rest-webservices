package com.dany.rest.webservices.restfulwebservices;

import com.dany.rest.webservices.restfulwebservices.helloworld.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bautisj on 6/26/2018.
 */
@RestController
public class HelloWorldController {

    @GetMapping(path ="/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(path ="/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello Bean World");
    }

    @GetMapping(path="/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }

}
