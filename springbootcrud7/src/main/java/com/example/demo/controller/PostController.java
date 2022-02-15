package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Post;
import com.example.demo.service.PostService;
@RestController
@RequestMapping("/post")
public class PostController {

	@Autowired
	private PostService postService;
	
	@PostMapping("/save")
	public Post savePost(@RequestBody Post post) {
		
		return postService.savePost(post);
	}
	@GetMapping("/get")
	public List<Post> getAllPost(){
		return postService.getAllPost();
	}
	
	@DeleteMapping("/delete")
	public String deletePost(@RequestBody Post post) 
	{
		postService.deletePost(post);
		return "Post Deleted....!"+post;
		
	}
	@PutMapping("/update")
	public Post updatePost(@RequestBody Post post)
	{
		return postService.updatePost(post);
	}
}
