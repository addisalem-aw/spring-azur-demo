package com.azuredemo.springazuredemo.controller;

import com.azuredemo.springazuredemo.entity.User;
import com.azuredemo.springazuredemo.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class UserController {
    private UserService userService;

    @GetMapping("/user")
    public ResponseEntity<String> getUser(){
        User user=new User(1,"Jone");
        String u=userService.getUser(user);
        return ResponseEntity.ok(u);
    }
}
