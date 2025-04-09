package com.example.chat.controller;

import com.example.chat.domain.User;
import com.example.chat.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    // Registers User
    @PostMapping("")
    public User registerUser(@RequestBody User body){
        return registerService.registerUser(body);
    }

}
