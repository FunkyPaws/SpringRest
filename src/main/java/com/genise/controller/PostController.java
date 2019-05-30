package com.genise.controller;

import com.genise.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.genise.repository.IPostRepository;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    IPostRepository postRepository;

    @GetMapping("/post")
    public List<Post> index() {
        return postRepository.findAll();
    }

    @GetMapping("/post/{id}")
    public Post show(@PathVariable Long id) {
        return postRepository.findById(id).get();
    }

    @PostMapping("/post")
    public Post create(@RequestBody Post post) {
        return postRepository.save(post);
    }

    @PutMapping("/post/{id}")
    public Post update(@PathVariable Long id, @RequestBody Post post) {
        return postRepository.save(post);
    }

    @DeleteMapping("post/{id}")
    public boolean delete(@PathVariable Long id) {
        postRepository.deleteById(id);
        return true;
    }
}
