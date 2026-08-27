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
			System.out.println((i+1)+"."+s);
		}
		int option = sc.nextInt();

		int index = option - 1;

		if (index < 0 || index >= CourseService.course_count) {
		    System.out.println("No course found");
		    return;
		}
		
		String course=CourseService.courses[index].getCourseName();
		
		
		
		
		
		System.out.println(" Dept : ");
		String dept=sc.next();
		
		Student s1=new Student(id,name,age,course,dept);
		
		Service.students[Service.count]=s1;
		
		Service.count++;
		
		System.out.println("*****Added Students details Succesfully *****");
		
		
	}
	
	
			
	


}
