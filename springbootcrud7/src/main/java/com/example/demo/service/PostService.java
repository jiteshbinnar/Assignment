package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Post;
import com.example.demo.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
	public Post savePost(Post post) {
		
		return postRepository.save(post);
	}
	
	public List<Post> getAllPost(){
		return postRepository.findAll();
	}
	public String deletePost(Post post) 
	{
		postRepository.delete(post);
		return "Post Deleted....!"+post;
		
	}
	public Post updatePost(Post post)
	{
		return postRepository.save(post);
	}
}
