package com.thoughtworks.capacity.gtb.mvc;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // GET
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public User loginUser(@RequestParam String username, @RequestParam String password) {
        return userService.loginUser(username, password);
    }

    // POST
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }
}

