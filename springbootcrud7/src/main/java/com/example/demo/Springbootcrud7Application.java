package com.example.demo;

//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import com.example.demo.entities.Comments;
//import com.example.demo.entities.Post;
//import com.example.demo.repository.PostRepository;

@SpringBootApplication
public class Springbootcrud7Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootcrud7Application.class, args);
	}
//	@Autowired
// private PostRepository postRepository;
//	
//	@Override
//	public void run(String... args) throws Exception {
//
//		Post post = new Post();
//		post.setDiscription("Java Introduction");
//
//		Comments comments = new Comments();
//		comments.setCmt("Nice Post");
//
//		Comments comments1 = new Comments();
//		comments1.setCmt("Great Post");
//
//		Comments comments2 = new Comments();
//		comments2.setCmt("Intresting Post");
//		
//		post.getComments().add(comments);
//		post.getComments().add(comments1);
//		post.getComments().add(comments2);
//		
//		postRepository.save(post);
//		
//	}

}
