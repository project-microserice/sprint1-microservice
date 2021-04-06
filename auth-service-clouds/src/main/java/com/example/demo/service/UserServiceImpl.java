package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private final PasswordEncoder passwordEncoder;
    @Autowired
    private final UserRepository userRepository;

    public UserServiceImpl(PasswordEncoder passwordEncoder, UserRepository userRepository) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        throwIfUsernameExists(user.getUsername());

        String hash = passwordEncoder.encode(user.getPassword());
        user.setPassword(hash);
        user.setActivated(Boolean.TRUE); // TODO send sms or email with code for activation
//        user.setAuthorities(new HashSet<>(Collections.singletonList(Au)));

        // TODO other routines on account creation

        return userRepository.save(user);
    }

    private void throwIfUsernameExists(String username) {
        Optional<User> existingUser = userRepository.findByUsername(username);
        existingUser.ifPresent((user) -> {
            throw new IllegalArgumentException("User not available");
        });
    }

}