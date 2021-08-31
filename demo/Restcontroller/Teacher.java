package com.example.demo.Restcontroller;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;
import lombok.Data;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher{
	public String schoolName;
	@NotBlank
	public String name;
	@Id
	public int id;
	@Range(min = 1)
	public int age;
	}