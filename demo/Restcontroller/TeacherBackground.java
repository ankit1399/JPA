package com.example.demo.Restcontroller;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="TEACHER_BACKGROUND")
@Entity
public class TeacherBackground {
	@Id
	public int teacherBackgroundId;
	public String teacherAddress;
    public TeacherBackground(int teacherBackgroundId,String teacherAddress) {
    	this.teacherAddress=teacherAddress;
    	this.teacherBackgroundId=teacherBackgroundId;
    }
    public TeacherBackground() {
    }
    @JsonBackReference
    @OneToOne(
			cascade= CascadeType.ALL,
			fetch= FetchType.LAZY
			)
	@JoinColumn(
			name="teacherBackgroundId",
			referencedColumnName="id"
			)
	public Teacher teacher;
}
