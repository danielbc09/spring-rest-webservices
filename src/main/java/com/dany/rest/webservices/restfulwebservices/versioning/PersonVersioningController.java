package com.dany.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bautisj on 7/26/2018.
 */
@RestController
public class PersonVersioningController {

    @GetMapping("v1/person")
    public PersonV1 personV1() {
        return new PersonV1("dany B");
    }
    @GetMapping("v2/person")
    public PersonV2 personV2() {
        return new PersonV2(new Name("First Name", "Second Name"));
    }
}
