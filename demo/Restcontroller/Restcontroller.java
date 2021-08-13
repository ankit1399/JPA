package com.example.demo.Restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restcontroller {

	@Autowired
	public EndpointLogic news;
	
	
	@GetMapping("/{id}/teacher")
	public Teacher getTeacher(@PathVariable int id) {
		return news.getTeacher(id);
	}
	
	@PostMapping("/teacher")
	public void postTeacher(@RequestBody Teacher teacher) {
	    news.postTeacher(teacher);
	}
}
