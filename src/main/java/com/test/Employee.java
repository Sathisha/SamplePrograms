package com.test;

public class Employee {
	private String name;
	private Integer ssoID;
	private String dept;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSsoID() {
		return ssoID;
	}
	public void setSsoID(Integer ssoID) {
		this.ssoID = ssoID;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	/**
	 * @param name
	 * @param ssoID
	 * @param dept
	 */
	public Employee(String name, Integer ssoID, String dept) {
		this.name = name;
		this.ssoID = ssoID;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", ssoID=" + ssoID + ", dept=" + dept + "]";
	}
	
	
	
}
