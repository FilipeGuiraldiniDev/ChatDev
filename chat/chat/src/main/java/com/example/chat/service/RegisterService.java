package com.example.chat.service;

import com.example.chat.Repository.RegisterRepository;
import com.example.chat.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class RegisterService {

    @Autowired
    private RegisterRepository registerRepository;

    public User registerUser(@RequestBody User body){
       return registerRepository.save(body);
    }
}
