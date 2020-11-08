package com.thoughtworks.capacity.gtb.mvc;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // GET
    @RequestMapping(value = "/login?username={username}&password={password}", method = RequestMethod.GET)
    @ResponseBody
    public User loginUser(@PathVariable("username")String username, @PathVariable("password")String password) {
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

