package com.dany.rest.webservices.restfulwebservices.versioning;

/**
 * Created by bautisj on 7/26/2018.
 */
public class PersonV1 {
    private String name;

    public PersonV1() {
       super();
    }

    public PersonV1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
