package com.springcore.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Student {

	private List<String>name;
    private Map<String, Integer>coursesFees;
    private Properties properties;
    
	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<String, Integer> getCoursesFees() {
		return coursesFees;
	}

	public void setCoursesFees(Map<String, Integer> coursesFees) {
		this.coursesFees = coursesFees;
	}

	public List<String> getName() {
		return name;
	} 

	public void setName(List<String> name) {
		this.name = name;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}


	
}
