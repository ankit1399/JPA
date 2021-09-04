package com.example.demo.Restcontroller;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface Repo extends CrudRepository<Teacher, Integer> {

	@Query(
			value="select * from ankittable a where a.name in (?1)",
			nativeQuery=true 
			)
	public Teacher getTeacherByName(String name);
}
