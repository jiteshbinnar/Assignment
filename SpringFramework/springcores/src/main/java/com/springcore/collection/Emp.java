package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Emp {
	private List<Integer>Marks;
	private Map<Integer,String>Id;
	private Properties props;
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public Emp(Properties props) {
		super();
		this.props = props;
	}
	public List<Integer> getMarks() {
		return Marks;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setMarks(List<Integer> marks) {
		Marks = marks;
	}
	public Map<Integer, String> getId() {
		return Id;
	}
	public void setId(Map<Integer, String> id) {
		Id = id;
	}
	public Emp(List<Integer> marks, Map<Integer, String> id) {
		super();
		Marks = marks;
		Id = id;
	}
	@Override
	public String toString() {
		return "Emp [Marks=" + Marks + ", Id=" + Id + ", props=" + props + "]";
	}
	

}
