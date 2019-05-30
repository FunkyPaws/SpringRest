package com.genise.mock;

import com.genise.model.Post;
import com.genise.model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MockData {

//    private List<Post> posts;
//
//    private static MockData instance = null;
//    public static MockData getInstance(){
//        if(instance == null){
//            instance = new MockData();
//        }
//        return instance;
//    }
//
//    public MockData(){
//        posts = new ArrayList<>();
//
//        posts.add(new Post(1L, "test post 1", new Date(),
//                new User(1L, "username", "password", "bio","location")));
//        posts.add(new Post(2L, "test post 2", new Date(),
//                new User(2L, "username2", "password2", "bio2","location2")));
//        posts.add(new Post(3L, "test post 3", new Date(),
//                new User(3L, "username3", "password3", "bio3","location3")));
//        posts.add(new Post(4L, "test post 4", new Date(),
//                new User(4L, "username4", "password4", "bio4","location4")));
//    }
//
//    // return all posts
//    public List<Post> fetchPosts() {
//        return posts;
//    }
//
//    // return post by id
//    public Post getPostById(Long id) {
//        for(Post p: posts) {
//            if(p.getPostID() == id) {
//                return p;
//            }
//        }
//        return null;
//    }
//
//    // create post
//    public Post createPost(Long id, String text, Date datetime, User user) {
//        Post newPost = new Post(id, text, datetime, user);
//        posts.add(newPost);
//        return newPost;
//    }
//
//    // update post
//    public Post updatePost(Long id, String text, Date datetime, User user) {
//        for(Post p: posts) {
//            if(p.getPostID() == id) {
//                int postIndex = posts.indexOf(p);
//                p.setText(text);
//                p.setDateTime(datetime);
//                p.setUser(user);
//                posts.set(postIndex, p);
//                return p;
//            }
//        }
//        return null;
//    }
//
//    // delete post by id
//    public boolean delete(Long id){
//        int postIndex = -1;
//        for(Post p: posts) {
//            if(p.getPostID() == id) {
//                postIndex = posts.indexOf(p);
//            }
//        }
//        if(postIndex > -1){
//            posts.remove(postIndex);
//        }
//        return true;
//    }

}
