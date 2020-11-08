package com.thoughtworks.capacity.gtb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

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
