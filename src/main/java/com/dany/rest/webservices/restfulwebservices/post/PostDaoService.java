package com.dany.rest.webservices.restfulwebservices.post;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by bautisj on 7/3/2018.
 */
public class PostDaoService {

    public static List<Post> post = new ArrayList<>();

    static {
        post.add(new Post(1, "Post One", new Date()));
        post.add(new Post(2, "Post Two", new Date()));
        post.add(new Post(3, "Post Three", new Date()));
    }

}
