package com.example.demo.Restcontroller;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Parent {
	@Column(name="parent")
	public String parent;
public Parent() {
		
	}
    public Parent(String parent) {
		this.parent=parent;
	}
}
