package com.example.demo.Restcontroller;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EndpointLogic {
	@Autowired
	private Repo repo;
	public Teacher getTeacher(int id) {
		return repo.findById(id).get();
	}
       public void postTeacher(Teacher teacher) {
		repo.save(teacher);
		}
       public void updateTeacher(Teacher teacher) {
		repo.save(teacher);
	}
       public void deleteTeacher( int id) {
				repo.deleteById(id);
			}
}
