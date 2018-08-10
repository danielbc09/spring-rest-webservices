package com.dany.rest.webservices.restfulwebservices.repositories;

import com.dany.rest.webservices.restfulwebservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bautisj on 8/10/2018.
 */
public interface UserRepository  extends JpaRepository<User, Integer>{
}
