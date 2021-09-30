package com.example.demo.Restcontroller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public class EndpointLogic {
	@Autowired
	private Repo repo;
	@Autowired
	private TeacherRepo teacherRepo;
	@Autowired
	private CourseRepo courseRepo;
	public Teacher getTeacher(int id) {
		return repo.findById(id).get();
	}
	public List<TeacherBackground> getTeacherBackground() {
		return teacherRepo.findAll();
	}
	public List<Course> getAllCourse() {
		return courseRepo.findAll();
	}
    public void postTeacher(Teacher teacher) {
		repo.save(teacher);
		}
    public void postCourse(Course course) {
    	courseRepo.save(course);
		}
    public void updateTeacher(Teacher teacher) {
		repo.save(teacher);
	}
	public void deleteTeacher( int id) {
				repo.deleteById(id);
			}
}