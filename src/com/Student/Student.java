package com.Student;

public class Student {
	
	
	private int stu_id;
	private String stu_name;
	private int stu_age;
	private String stu_course;
	private String stu_dept;
	
	public Student(int stu_id,String stu_name,int stu_age,String stu_course,String stu_dept)
	{
		this.stu_id=stu_id;
		this.stu_name=stu_name;
		this.stu_age=stu_age;
		this.stu_course=stu_course;
		this.stu_dept=stu_dept;
	}
	
	public int getStudentId()
	{
		return this.stu_id;
	}
	public String getStudentName()
	{
		return this.stu_name;
	}
	public int getStudentAge()
	{
		return this.stu_age;
	}
	public String getStudentCourse()
	{
		return this.stu_course;
	}
	public String getStudentDept()
	{
		return this.stu_dept;
	}
	
	
	public void setStudentId(int stu_id)
	{
		this.stu_id=stu_id;
	}
	public void setStudentName(String stu_name)
	{
		this.stu_name=stu_name;
		
	}
	public void setStudentAge(int stu_age)
	{
		this.stu_age=stu_age;
		
	}
	public void setStudentCourse(String stu_course)
	{
		this.stu_course=stu_course;
		
	}
	public void setStudentDept(String stu_dept)
	{
		this.stu_dept=stu_dept;
	}
	
	
	public void displayDetails()
	{
		System.out.println("*****Student Details*****");
		System.out.println(this.stu_id);
		System.out.println(this.stu_name);
		System.out.println(this.stu_age);
		System.out.println(this.stu_course);
		System.out.println(this.stu_dept);
		System.out.println("*****-----------*****");
	
	}
	
	

}
