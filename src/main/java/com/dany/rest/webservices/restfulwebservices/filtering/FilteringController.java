package com.dany.rest.webservices.restfulwebservices.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by bautisj on 7/26/2018.
 */
@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public SomeBean retriveSomeBean(){
        return new SomeBean("value1" , "Value2", "Value3");
    }

    @GetMapping("/filtering-list")
    public List<SomeBean> retriveSomeBeans(){
        return  Arrays.asList(  new SomeBean("value1" , "Value2", "Value3"),
                                new SomeBean("Value11", "value22", "value33"));
    }
}
