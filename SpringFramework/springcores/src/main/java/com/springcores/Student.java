package com.springcores;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean {
private int studentId;
private String studentName;
private String studentAddress;
public void afterPropertiesSet() throws Exception {
	System.out.println("Object is Created");
} 
public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	System.out.println("set Name ");
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentAddress() {
	return studentAddress;
}
public void setStudentAddress(String studentAddress) {
	this.studentAddress = studentAddress;
}
public Student(int studentId, String studentName, String studentAddress) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentAddress = studentAddress;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
			+ "]";
}

public void destroy() throws Exception {
	System.out.println("object is Destroyed");
	
}

	
	
}
