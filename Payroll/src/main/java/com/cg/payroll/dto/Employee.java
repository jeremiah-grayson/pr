package com.cg.payroll.dto;

public class Employee 
{
    int employeeID,yearlyInvestmentUnder80C,salary;
    String firstName,lastName,department,designation, panCard,emailId;
    public Employee(int id, int yearlyInvestmentUnder80C,int salary,String firstName,String lastName, String department, String designation,String panCard, String emailId) 
    {
        
        this.employeeID = employeeID;
        this.yearlyInvestmentUnder80C = yearlyInvestmentUnder80C;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.designation = designation;
        this.panCard = panCard;
        this.emailId = emailId;
    }
    Employee()
    {
        System.out.println("This is a default constructor");    
    }
    public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public int getYearlyInvestmentUnder80C() {
		return yearlyInvestmentUnder80C;
	}
	public void setYearlyInvestmentUnder80C(int yearlyInvestmentUnder80C) {
		this.yearlyInvestmentUnder80C = yearlyInvestmentUnder80C;
	}
	public int getSalary() {
		return salary;
	}
	public void setsalary(int salary) {
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}
    