package com.azuredemo.springazuredemo.service;

import com.azuredemo.springazuredemo.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUser(User user){
      return user.toString();
    }
}
