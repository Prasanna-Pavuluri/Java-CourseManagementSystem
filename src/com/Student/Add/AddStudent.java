package com.Student.Add;

import java.util.Scanner;

import com.Student.*;

import com.Course.*;
import com.Course.Course;
public class AddStudent {
	
	
static Scanner sc=new Scanner(System.in) ;
	
	public static void addStudent() {
		
		if(Service.count==Service.students.length) {
			System.out.println("cant ad dstudents....limit reached...");
			return ;
		}
		System.out.println("Enter Students details : ");
		
		System.out.println(" id : ");
		int id=sc.nextInt();
		if(Service.count>0) 
		{
			for(int i=0;i<Service.count;i++)
			{
			
				if(Service.students[i].getStudentId()==id) {
					System.out.println("id already there.. enter another one");
					return ;
				}
			}
		}
		
		System.out.println(" name : ");
		String name=sc.next();
		
		System.out.println(" age : ");
		int age=sc.nextInt();
		
		System.out.println("choose one course from below lsit: ");
		for(int i=0;i<CourseService.course_count;i++)
		{
			String s=CourseService.courses[i].getCourseName();
			System.out.println(s);
		}
		
		String select_course=sc.next();
		int index=-1;
		for(int i=0;i<CourseService.course_count;i++) {
			
			if(select_course.equals(CourseService.courses[i].getCourseName())) {
				index=i;
				break;
			}
			
		}
		
		if(index==-1) {
			System.out.println("Invalid course");
			return ;
		}
		
		
		
		
		
		
		System.out.println(" Dept : ");
		String dept=sc.next();
		
		Student s1=new Student(id,name,age,select_course,dept);
		
		Service.students[Service.count]=s1;
		
		Service.count++;
		
		System.out.println("*****Added Students details Succesfully *****");
		
		
	}
	
	
			
	


}
