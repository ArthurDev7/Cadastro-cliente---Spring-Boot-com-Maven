package com.security.arthur.spring.boot.jwt.controller;

import com.security.arthur.spring.boot.jwt.service.UserDetailsServiceImpl;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserDetailsServiceImpl userDetailsService;

    public UserController(UserDetailsServiceImpl userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    /*@RequestMapping("/all-users")
    public List<UserData> listAllUsers() {
        return UserDetailsService.listUsers();
    }*/
}
