package com.example.demo.Restcontroller;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface TeacherRepo extends JpaRepository<TeacherBackground,Integer>{

	@Query(
			value="insert into TEACHER_BACKGROUND(TEACHER_BACKGROUND_ID,TEACHER_ADDRESS) values (?1, ?2)",
			nativeQuery= true
			)
	@Modifying
	@Transactional
	public void postTeacherBackground(int id, String address);


}
