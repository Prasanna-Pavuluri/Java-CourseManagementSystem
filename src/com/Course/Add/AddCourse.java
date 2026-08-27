package com.Course.Add;

import java.util.Scanner;

import com.Course.*;


public class AddCourse {
	
static Scanner sc=new Scanner(System.in) ;
	
	public static void addCourse() {
		
		if(CourseService.course_count==CourseService.courses.length) {
			System.out.println("cant add courses....limit reached...");
			return ;
		}
		System.out.println("Enter course details : ");
		
		System.out.println("course  id : ");
		int id=sc.nextInt();
		if(CourseService.course_count>0) 
		{
			for(int i=0;i<CourseService.course_count;i++)
			{
			
				if(CourseService.courses[i].getCourseId()==id) {
					System.out.println("id already there.. enter another one");
					return ;
				}
			}
		}
		
		System.out.println(" course name : ");
		String name=sc.next();
		
		System.out.println(" duration : ");
		int duration=sc.nextInt();
		
		
		Course c1=new Course(id,name,duration);
		
		CourseService.courses[CourseService.course_count]=c1;
		
		CourseService.course_count++;
		
		System.out.println("*****Added course details Succesfully *****");
		
		
	}
	
	

}
