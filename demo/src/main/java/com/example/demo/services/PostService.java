package com.example.demo.services;

import com.example.demo.models.Post;
import com.example.demo.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
	@Autowired
	private PostRepository postRepository;
	
	public Post createNewPost(Post post) {
		return postRepository.save(post);
	}
	
	public List<Post> getAllPost() {
		return postRepository.findAll();
	}
	
	public Post findPostById(Long id) {
		return postRepository.getById(id);
	}

	
	public void deletePost(Long id) {
	    // Retrieve the post from the database using the provided ID
	    Post post = postRepository.findById(id)
	            .orElseThrow(() -> new IllegalArgumentException("Invalid post ID: " + id));

	    // Delete the post
	    postRepository.delete(post);
	}
	

}
