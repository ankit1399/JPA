package com.example.demo.Restcontroller;
import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restcontroller {
    @Autowired
	public EndpointLogic news;
    @Autowired
    public Repo repo;
    @Autowired
    public TeacherRepo teacherRepo;
	@GetMapping("/{id}/teacher")
	public Teacher getTeacher(@PathVariable Integer id) {
		return news.getTeacher(id);
	}
	@GetMapping("/course")
	public List<Course> getAllCourse() {
		return news.getAllCourse();
	}
	@GetMapping("/teacherBackground")
	public List<TeacherBackground> getTeacherBackground() {
		return news.getTeacherBackground();
	}
	@PostMapping("/teacher")
	public void postTeacher(@Valid @RequestBody Teacher teacher) {
	    news.postTeacher(teacher);
	}
	@PostMapping("/course")
	public void postCourse(@Valid @RequestBody Course course) {
	    news.postCourse(course);
	}
	@PutMapping("/Updateteacher")
	public void updateTeacher(@RequestBody Teacher teacher) {
		news.updateTeacher(teacher);
	}
	@PutMapping
	public void updateTeacherName(@RequestParam(value="name") String name,@RequestParam(value="id") int teacherid) {
		repo.updateTeacherName(name,teacherid);
	}
	
	@DeleteMapping("/{id}/teacher")
	public void deleteTeacher(@PathVariable int id) {
	    news.deleteTeacher(id);
	}
	@PostMapping("/teacherBackground")
	public void postTeacherBckground( @RequestParam(value="id") int id,@RequestParam(value="address") String address) {
	    teacherRepo.postTeacherBackground(id,address);
	}
	@GetMapping
	public Teacher findTeacher(@RequestParam(value="name") String name) {
	    return repo.getTeacherByName(name);
	}
	
}
