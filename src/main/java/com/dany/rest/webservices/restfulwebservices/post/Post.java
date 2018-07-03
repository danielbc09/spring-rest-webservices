package com.dany.rest.webservices.restfulwebservices.post;

import java.util.Date;

/**
 * Created by bautisj on 7/3/2018.
 */
public class Post {

    private int postId;
    private String titlePost;
    private Date datePost;

    public Post(int postId, String titlePost, Date datePost) {
        this.postId = postId;
        this.titlePost = titlePost;
        this.datePost = datePost;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getTitlePost() {
        return titlePost;
    }

    public void setTitlePost(String titlePost) {
        this.titlePost = titlePost;
    }

    public Date getDatePost() {
        return datePost;
    }

    public void setDatePost(Date datePost) {
        this.datePost = datePost;
    }
}
