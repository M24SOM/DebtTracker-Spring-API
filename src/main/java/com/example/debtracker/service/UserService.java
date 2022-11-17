package com.example.debtracker.service;

import com.example.debtracker.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    com.example.debtracker.repository.UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }


    public User getUserById(Long id){
        return userRepository.findById(id).get();
    }

    public User getUSerByEmail(String email){
        return userRepository.findByEmailAddress(email);
    }

    public User saveUser(User user){
        user = userRepository.findByEmailAddress(user.getEmail());
        System.out.println(user);
        if(user != null){
            return user;
        }
        return userRepository.save(user);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

}
