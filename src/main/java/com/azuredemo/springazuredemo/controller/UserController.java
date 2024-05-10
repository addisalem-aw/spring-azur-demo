package com.azuredemo.springazuredemo.controller;

import com.azuredemo.springazuredemo.entity.User;
import com.azuredemo.springazuredemo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;
    @GetMapping
    public String getUser(@RequestBody User user){
        String u=userService.getUser(user);
        return u;
    }
}
