package com.Course;

import java.util.*;


import com.Course.*;
import com.Course.ListofCourses.*;
import com.Course.Add.*;
import com.Course.Update.*;
import com.Course.Delete.*;
import com.Course.View.*;
import com.Student.*;
import com.Student.Add.*;
import com.Student.ListofStudents.*;
import com.Student.Delete.*;
import com.Student.Update.*;
import com.Student.View.ViewStudent;


public class Main {
		
			public static void welcomeMessage() {
				System.err.println("*********----Course Management System----************");
				System.out.println(" ");
			}
			
			public static void options() {
				System.out.println("Select any Option");
				System.out.println(" ");
				System.out.println("1. Course details");
				System.out.println("2. Student details");
				System.out.println("3. Exit");
				
			}
			
			
				
				
			
			
			public static void selectOption(Scanner sc)
			{
				
				boolean isExit=false;
				while(!isExit) {
					
					int selectedOption=sc.nextInt();
					
					switch(selectedOption)
					{
						case 1->
						{
							System.out.println("courses details");
							System.out.println("Select any Option");
							System.out.println(" ");
							System.out.println("1. List of courses");
							System.out.println("2. Add courses");
							System.out.println("3. Update courses");
							System.out.println("4. Delete courses ");
							System.out.println("5. View courses");
							System.out.println("6. exit");
							
							
							boolean exit1=false;
							while(!exit1) {
							int option=sc.nextInt();
							switch(option) 
							{
								
								case 1->{
									System.out.println("1. List of courses");
									ListOfCourses.listCourses();
								}
								case 2->{
									System.out.println("2. Add courses");
									AddCourse.addCourse();
								}
								case 3->{
									System.out.println("3. Update courses");
									UpdateCourse.updateCourse();
								}
								case 4->{
									System.out.println("4. Delete courses");
									DeleteCourse.deleteCourse();
								}
								case 5->{
									System.out.println("5. View courses");
									ViewCourse.viewCourse();
								}
								case 6->{
									System.out.println("Back to Main menu");
									exit1=true;
								}
								
								default->{
									System.out.println("Invalid Option");
								}
							}
							}
						}
						
						case 2->{
							System.out.println("Student details");
							System.out.println("Select any Option");
							System.out.println(" ");
							System.out.println("1. List of students");
							System.out.println("2. Add students");
							System.out.println("3. Update students");
							System.out.println("4. Delete students ");
							System.out.println("5. View students");
							System.out.println("6. exit");
							
							boolean exit2=false;
							while(!exit2) {
								int option=sc.nextInt();
							switch(option) 
							{
							
								case 1->{
								System.out.println("1. List of students");
								ListofStudents.listStudents();
								}
								case 2->{
								System.out.println("2. Add students");
								AddStudent.addStudent();
								}
								case 3->{
								System.out.println("3. Update students");
								UpdateStudent.updateStudent();
								}
								case 4->{
								System.out.println("4. Delete students");
								DeleteStudent.deleteStudent();
								}
								case 5->{
								System.out.println("5. View students");
								ViewStudent.viewStudent();
								}
								case 6->
								{
								
									System.out.println("exited");
									exit2=true;
								
								}
								default->{
								System.out.println("Invalid Option");
								}
						}
						}
						}
						case 3->{
							//exit
								isExit=true;
						}
						default ->{
							System.out.println("Invalid input");
						}
					}
				}
			}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				
				
				Scanner sc=new Scanner(System.in);
				welcomeMessage();
				options();
				//student_options();
				selectOption(sc);
				
				
			}

		


	}


