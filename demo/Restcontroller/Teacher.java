package com.example.demo.Restcontroller;
import lombok.*;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ankittable")
public class Teacher{
	@Embedded
	@AttributeOverrides({
		  @AttributeOverride( name = "parent", column = @Column(name = "parent"))})
	public Parent parent;
	public String schoolName;
	@NotBlank
	public String name;
	@Id
	/*@SequenceGenerator(
			name="student_sequence",
			sequenceName="student_sequence",
			allocationSize=1
			)
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator="student_sequence"
			)*/
	public int id;
	@Range(min = 1)
	public int age;
	@JsonManagedReference
	@OneToOne(mappedBy="teacher")
	public TeacherBackground teacherback;
	@OneToMany(cascade=CascadeType.ALL,
			fetch=FetchType.EAGER
			)
	@JoinColumn(
			name="id",
			referencedColumnName="id"
			
			)
	public List<Course> courses; 
	}