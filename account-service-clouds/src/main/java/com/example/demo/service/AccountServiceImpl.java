package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.client.AuthServiceFeignClient;
import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserRegistrationDto;

@Service
public class AccountServiceImpl implements AccountService {

    private final AuthServiceFeignClient authServiceFeignClient;

    public AccountServiceImpl(AuthServiceFeignClient authServiceFeignClient) {
        this.authServiceFeignClient = authServiceFeignClient;
    }

    @Override
    public UserDto create(UserRegistrationDto user) {
        return authServiceFeignClient.createUser(user);
    }
}