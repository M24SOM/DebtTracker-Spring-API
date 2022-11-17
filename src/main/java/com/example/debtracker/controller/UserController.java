package com.example.debtracker.controller;

import com.example.debtracker.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    com.example.debtracker.service.UserService userService;

    @GetMapping("/")
    public List<User> allUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){
           return userService.getUserById(id);
    }

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable Long id){
        User deleteUser = userService.getUserById(id);
            userService.deleteUser(id);
            return deleteUser;
    }

}
