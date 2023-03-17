package com.natixis.std.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	private int id;
	private String name;
	private float fees;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, float fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}
	
	
	
	
	
}
