package com.Student.Update;

import java.util.Scanner;

import com.Student.Service;
import com.Student.Student;

public class UpdateStudent {
	
public static void updateStudent() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("****Enter student id to update****");
		int id=sc.nextInt();
		
		for(int i=0;i<Service.count;i++)
		{
			if(id==Service.students[i].getStudentId())
			{
				Student stu=Service.students[i];
				System.out.println("Enter new id : ");
				int new_id=sc.nextInt();
				
				System.out.println("Enter new name : ");
				String new_name=sc.next();
				
				System.out.println("Enter new age : ");
				int new_age=sc.nextInt();
				
				System.out.println("Enter new course : ");
				String new_course=sc.next();
				
				System.out.println("Enter new dept : ");
				String new_dept=sc.next();
				
				
				stu.setStudentId(new_id);
				stu.setStudentName(new_name);
				stu.setStudentAge(new_age);
				stu.setStudentCourse(new_course);
				stu.setStudentDept(new_dept);
				
				System.out.println("****student updated succesfully****");
				
				
			}
			else
				System.out.println("****No stduent record****");
		}
		
				
	}
				 

}
