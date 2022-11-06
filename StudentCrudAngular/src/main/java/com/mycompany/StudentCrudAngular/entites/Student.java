package com.mycompany.StudentCrudAngular.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
private String name;
private String address;
private  Double percentage;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Double getPercentage() {
	return percentage;
}
public void setPercentage(Double percentage) {
	this.percentage = percentage;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", address=" + address + ", percentage=" + percentage + "]";
}


}
