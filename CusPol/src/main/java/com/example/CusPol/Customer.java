package com.example.CusPol;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Customer {
@Id
@Column(name="id",columnDefinition = "serial")
int id;
@Column(name="fname")
String fname;
@Column(name="lname")
String lname;
@Column(name="age")
int age;
@Column(name="salary")
int salary;
@Column(name="mob")
long mob;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public long getMob() {
	return mob;
}
public void setMob(long mob) {
	this.mob = mob;
}
public Customer(int id,int age,String fname,String lname,long mob ,int salary) {
	super();
	this.id=id;
	this.age = age;
	this.fname = fname;
    this.lname = lname;
	this.mob = mob;
	this.salary = salary;
}
public Customer() {
	super();
}


}
