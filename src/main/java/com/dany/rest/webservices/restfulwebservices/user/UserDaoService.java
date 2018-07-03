package com.dany.rest.webservices.restfulwebservices.user;

import com.dany.rest.webservices.restfulwebservices.post.Post;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by bautisj on 6/29/2018.
 */
@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static int usersCount = 4;
    private static ArrayList<Post> posts = new ArrayList<>();

    static {
        posts.add(new Post(1, "Post One", new Date()));
        posts.add(new Post(2, "Post Two", new Date()));
        posts.add(new Post(3, "Post Three", new Date()));
    }

    static {
        users.add(new User(1, "Daniel", new Date()));
        users.add(new User(2, "Jairo", new Date()));
        users.add(new User(3, "Alonso", new Date()));
        users.add(new User(4, "Jorge", new Date()));
        users.add(new User(5, "User with 1 Post", new Date(), posts));
    }


    public List<User> findAll(){
        return users;
    }

    public User findUser(int id) {
        for (User user:users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    public User saveUser(User user) {
        if(user.getId() == null) {
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User deleteUserById(int id) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()){
            User user = iterator.next();
            if(user.getId() == id ){
                iterator.remove();
                return user;
            }
        }
        return null;
    }


}
