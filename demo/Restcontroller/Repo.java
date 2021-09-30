package com.example.demo.Restcontroller;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface Repo extends CrudRepository<Teacher, Integer> {

	@Query(
			value="select * from ankittable a where a.name in (?1)",
			nativeQuery=true 
			)
	public Teacher getTeacherByName(String name);
	@Modifying
	@Transactional
	@Query(
			value="update ankittable a set a.name=?1 where a.id=?2",
			nativeQuery=true
			)
	public void updateTeacherName(String name,int teacherid);
}
