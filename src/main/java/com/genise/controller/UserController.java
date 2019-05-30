package com.genise.controller;

import com.genise.model.User;
import com.genise.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    IUserRepository userRepository;

    @GetMapping("/user")
    public List<User> index() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public User show(@PathVariable Long id) {
        return userRepository.findById(id).get();
    }

    @PostMapping("/user")
    public User create(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping("/user/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) {
        return userRepository.save(user);
    }

    @DeleteMapping("/user/{id}")
    public boolean delete(@PathVariable Long id) {
        userRepository.deleteById(id);
        return true;
    }
}
