package com.program2;

public class Employee 
{
	private  int employeeId;
	private String employeeName;
	private String emloyeeAddress;
	
	public Employee() {
		super();
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setEmloyeeAddress(String emloyeeAddress) {
		this.emloyeeAddress = emloyeeAddress;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", emloyeeAddress="
				+ emloyeeAddress + "]";
	}
	

}
