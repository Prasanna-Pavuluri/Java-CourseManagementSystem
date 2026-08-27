package com.Course;

public class Course {
	
	private int course_id;
	private String course_name;
	private int course_duration;
	
	
	public Course(int course_id,String course_name,int course_duration)
	{
		this.course_id=course_id;
		this.course_name=course_name;
		this.course_duration=course_duration;
		
	}
	
	public int getCourseId()
	{
		return this.course_id;
	}
	public String getCourseName()
	{
		return this.course_name;
	}
	public int getCourseDuration()
	{
		return this.course_duration;
	}
	
	
	
	public void setCourseId(int course_id)
	{
		this.course_id=course_id;
	}
	public void setCourseName(String course_name)
	{
		this.course_name=course_name;
		
	}
	public void setCourseDuration(int course_duration)
	{
		this.course_duration=course_duration;
		
	}
	
	
	
	public void displayDetails()
	{
		System.out.println("*****Student Details*****");
		System.out.println(this.course_id);
		System.out.println(this.course_name);
		System.out.println(this.course_duration);
		System.out.println("*****-----------*****");
	
	}
	
	
	
	

}
