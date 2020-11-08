package com.thoughtworks.capacity.gtb.mvc;

import com.thoughtworks.capacity.gtb.User;
import com.thoughtworks.capacity.gtb.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // GET
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public User getUserById(Integer id) {
        return userService.getUserById(id);
    }

    // POST
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }
}

