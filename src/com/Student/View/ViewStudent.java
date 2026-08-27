package com.Student.View;

import java.util.Scanner;

import com.Student.Service;
import com.Student.Student;

public class ViewStudent {
	
public static void viewStudent() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("****Enter student id to show****");
		int id=sc.nextInt();
		
		for(int i=0;i<Service.count;i++)
		{
			if(id==Service.students[i].getStudentId())
			{
				 Student stu=Service.students[i];
				 stu.displayDetails();
			}
			
			else
				System.out.println("****No stduent record****");
		}
		
		System.out.println("****student displayed succesfully****");
		
	}
	


}
