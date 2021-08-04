package com.example.demo.Restcontroller;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Teacher{
	
	public String schoolname;
	public String name;
	@Id
	public int id;
	public int age;
	public Teacher(int id, int age,String name,String schoolname) {
		this.schoolname=schoolname;
		this.age=age;
		this.id=id;
		this.name=name;
		
	}
	public Teacher() {
		
	}
	
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public int  getId() {
		return id;
	}
	public int  getAge() {
		return age;
	}
	public String  getName() {
		return name;
	}
	
}