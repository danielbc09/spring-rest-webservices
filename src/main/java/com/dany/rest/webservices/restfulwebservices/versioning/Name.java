package com.dany.rest.webservices.restfulwebservices.versioning;

/**
 * Created by bautisj on 7/26/2018.
 */
public class Name {
    private String firstName;
    private String lattName;

    public Name() {
        super();
    }

    public Name(String firstName, String lattName) {
        super();
        this.firstName = firstName;
        this.lattName = lattName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLattName() {
        return lattName;
    }

    public void setLattName(String lattName) {
        this.lattName = lattName;
    }
}
