package com.example.springjooq.controller;

import com.example.springjooq.entity.UserEntity;
import com.example.springjooq.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping()
    public List<UserEntity> getUsers() {
        return userRepository.getUsers();
    }

}
