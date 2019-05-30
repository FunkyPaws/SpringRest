package com.genise.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PostID;
    private String Text;

    @ManyToOne
    @JoinColumn(name = "UserID")
    private User User;

    public Post(Long postID, String text, User user) {
        PostID = postID;
        Text = text;
        User = user;
    }

    public Post() {
    }

    public Long getPostID() {
        return PostID;
    }

    public void setPostID(Long postID) {
        PostID = postID;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public User getUser() {
        return User;
    }

    public void setUser(User user) {
        User = user;
    }

    @Override
    public String toString() {
        return "Post{" +
                "PostID=" + PostID +
                ", Text='" + Text + '\'' +
                ", User=" + User +
                '}';
    }
}
