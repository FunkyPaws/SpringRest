package com.genise.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long PostID;
    private String Text;
    private Date DateTime;
    private User User;

    public Post(Long postID, String text, Date dateTime, User user) {
        PostID = postID;
        Text = text;
        DateTime = dateTime;
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

    public Date getDateTime() {
        return DateTime;
    }

    public void setDateTime(Date dateTime) {
        DateTime = dateTime;
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
                ", DateTime=" + DateTime +
                ", User=" + User +
                '}';
    }
}