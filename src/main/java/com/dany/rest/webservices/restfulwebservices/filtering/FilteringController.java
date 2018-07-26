package com.dany.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
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
    public MappingJacksonValue retriveSomeBean(){

        SomeBean somebean = new SomeBean("value1" , "Value2", "Value3");

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("value1", "value3");
        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(somebean);
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }

    @GetMapping("/filtering-list")
    public MappingJacksonValue retriveSomeBeans(){

        List<SomeBean> beanList =  Arrays.asList(  new SomeBean("value1" , "Value2", "Value3"),
                                new SomeBean("Value11", "value22", "value33"));

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("value3");
        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(beanList);
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }
}
