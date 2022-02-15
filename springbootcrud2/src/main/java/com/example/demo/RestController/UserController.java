package com.example.demo.RestController;

import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.UserRepository;
import com.example.demo.entities.User;
@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
	private UserRepository userRepository;
	

@GetMapping("/getting")
public List<User> getallUser()
{
	return userRepository.findAll();
}
@PostMapping("/save")
public User saveUser(@RequestBody User user)
{
	return userRepository.save(user);
}
@PutMapping("/update") 
public User updateUser(@RequestBody User user) {
    return userRepository.save(user);
}

@DeleteMapping("/delete")
public String deleteUser(@RequestBody User user) {
    userRepository.delete(user);
    return "Deleted Successfully"+user;
}


}
