package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    //userList
    List<User> users = List.of(
            new User(1L, "Virat", "1234567891"),
            new User(2L, "Sachin", "46546546554"),
            new User(3L, "Jind", "46556465454")
    );

    @Override
    public User getUser(Long id) {
        return this.users.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
