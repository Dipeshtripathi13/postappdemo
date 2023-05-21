package com.example.demo.controllers;

import com.example.demo.models.Post;
import com.example.demo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class PostController {

	@Autowired
	private PostService postService;
	@GetMapping("/")
	public ResponseEntity<List<Post>> getAllPosts() {
		return ResponseEntity.ok(postService.getAllPost());
	}
	
	
	@PostMapping("/")
	public ResponseEntity<Post> createPost(@RequestBody Post post) {
		return ResponseEntity.ok(postService.createNewPost(post));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deletePost(@PathVariable Long id) {
	    postService.deletePost(id);
	    return ResponseEntity.ok(true);
	}
}
