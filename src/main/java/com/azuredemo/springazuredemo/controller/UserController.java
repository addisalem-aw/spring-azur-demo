package com.azuredemo.springazuredemo.controller;

import com.azuredemo.springazuredemo.entity.User;
import com.azuredemo.springazuredemo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;
    @GetMapping
    public ResponseEntity<String> getUser(@RequestBody User user){
        String u=userService.getUser(user);
        return ResponseEntity.ok(u);
    }
}
