package com.dany.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by bautisj on 6/29/2018.
 */
@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static int usersCount = 4;

    static {
        users.add(new User(1, "Daniel", new Date()));
        users.add(new User(2, "Jairo", new Date()));
        users.add(new User(3, "Alonso", new Date()));
        users.add(new User(4, "Jorge", new Date()));
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
}
