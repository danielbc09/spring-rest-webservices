package com.dany.rest.webservices.restfulwebservices.user;

import com.dany.rest.webservices.restfulwebservices.post.Post;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by bautisj on 6/29/2018.
 */
public class User {

    private Integer id;
    private String name;
    private Date birthDate;
    private ArrayList<Post> userPosts;

    protected User(){

    }

    public User(Integer id, String name, Date birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }


    public User(Integer id, String name, Date birthDate, ArrayList<Post> posts) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.userPosts = posts;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public ArrayList<Post> getUserPosts() {
        return userPosts;
    }

    public void setUserPosts(ArrayList<Post> userPosts) {
        this.userPosts = userPosts;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }


}
