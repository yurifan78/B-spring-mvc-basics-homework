package com.thoughtworks.capacity.gtb.mvc;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private final Map<Integer, User> userMap = new HashMap<>();

    public UserService() {
        userMap.put(1, new User(1, "yue", "1234", "yue@gmail.com"));
    }

    public User getUserById(Integer id) {
        return userMap.get(id);
    }

    public void createUser(User user) {
        userMap.put(user.getId(), user);
    }

}
