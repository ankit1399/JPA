package com.example.demo.Restcontroller;
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
	@GetMapping("/{id}/teacher")
	public Teacher getTeacher(@PathVariable Integer id) {
		return news.getTeacher(id);
	}
	@PostMapping("/teacher")
	public void postTeacher(@Valid @RequestBody Teacher teacher) {
	    news.postTeacher(teacher);
	}
	@PutMapping("/Updateteacher")
	public void updateTeacher(@RequestBody Teacher teacher) {
		news.updateTeacher(teacher);
	}
	@DeleteMapping("/{id}/teacher")
	public void deleteTeacher(@PathVariable int id) {
	    news.deleteTeacher(id);
	}
	@GetMapping
	public Teacher findTeacher(@RequestParam(value="name") String name) {
	    return repo.getTeacherByName(name);
	}
	
}
