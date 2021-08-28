package com.example.demo.Restcontroller;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Teacher{
	
	public String schoolName;
	public String name;
	@Id
	public int id;
	public int age;
	public Teacher(int id, int age,String name,String schoolName) {
		this.schoolName=schoolName;
		this.age=age;
		this.id=id;
		this.name=name;
		}
	public Teacher() {
		}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolname(String schoolname) {
		this.schoolName = schoolName;
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