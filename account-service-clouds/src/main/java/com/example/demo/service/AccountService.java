package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserRegistrationDto;

public interface AccountService {

    /**
     * Invokes Auth Service user creation
     *
     * @param user
     * @return created account
     */
    UserDto create(UserRegistrationDto user);
}
