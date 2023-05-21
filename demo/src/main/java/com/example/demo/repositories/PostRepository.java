package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Post;

	@Repository
	public interface PostRepository extends JpaRepository<Post, Long> {
		public Post findByPost(String post);
		public List<Post> findAll();
		public Post getById(Long id);

}

