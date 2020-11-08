package com.thoughtworks.capacity.gtb.mvc;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    private final Map<Integer, User> userMap = new HashMap<>();

    public UserService() {
        userMap.put(1, new User(1, "yue", "1234", "yue@gmail.com"));
    }

    public User loginUser(String username, String password) {
        Integer id = getAuthenticatedId(username, password);
        return userMap.get(id);
    }

    private Integer getAuthenticatedId(String username, String password) {
        if (checkIfUsernameExists(username) && checkIfPasswordMatches(username, password)) {
            return getIdByUsername(username);
        }
        return 0;
    }

    private boolean checkIfPasswordMatches(String username, String password) {
        List<User> users = new ArrayList<>(userMap.values());
        return false;
    }

    private boolean checkIfUsernameExists(String username) {
        List<User> users = new ArrayList<>(userMap.values());
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void createUser(User user) {
        userMap.put(user.getId(), user);
    }

}
