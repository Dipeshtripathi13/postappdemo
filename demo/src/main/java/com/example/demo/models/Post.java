package com.example.demo.models;

import java.sql.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Post {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String postCreatedBy;
    private String postContent;
    private Date createdAt;
    
    public Post() {
        // Default constructor
    }

    public Post(String postContent, String postCreatedBy, Date createdAt) {
        this.postContent = postContent;
        this.postCreatedBy = postCreatedBy;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return postCreatedBy;
    }

    public void setCreatedBy(String postCreatedBy) {
        this.postCreatedBy = postCreatedBy;
    }
    
    public String getContent() {
        return postCreatedBy;
    }

    public void setContent(String postContent) {
        this.postContent = postContent;
    }
    public Date createTime() {
        return createdAt;
    }

    public void setCompleted(Date createdAt) {
        this.createdAt = createdAt;
    }

    // Override toString() method for better debugging
    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", postCreatedBy='" + postCreatedBy + '\'' +
                ", postContent=" + postContent +
                ", createdAt='" + createdAt +
                '}';
    }

}
