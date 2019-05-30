package com.genise.mock;

import com.genise.model.Post;
import com.genise.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

//@RestController
public class MockPostController {
//    MockData mockData = MockData.getInstance();
//
////    @RequestMapping("/post")
////    public String index() {
////        return "Congratulations from PostController.java";
////    }
//
//    @GetMapping("/post")
//    public List<Post> index() {
//        return mockData.fetchPosts();
//    }
//
//    @GetMapping("/post/{id}")
//    public Post show(@PathVariable Long id) {
//        return mockData.getPostById(id);
//    }
//
//    @PostMapping("/post")
//    public Post create(@RequestBody Post post) {
//
//        Long ID = post.getPostID();
//        String text = post.getText();
//        Date date = post.getDateTime();
//        User user = post.getUser();
//
//        return mockData.createPost(ID, text, date, user);
//    }
//
//    @PutMapping("/post/{id}")
//    public Post update(@PathVariable Long id, @RequestBody Post post) {
//
//        Long ID = post.getPostID();
//        String text = post.getText();
//        Date date = post.getDateTime();
//        User user = post.getUser();
//
//        return mockData.updatePost(ID, text, date, user);
//    }
//
//    @DeleteMapping("post/{id}")
//    public boolean delete(@PathVariable Long id){
//
//        return mockData.delete(id);
//    }
}
