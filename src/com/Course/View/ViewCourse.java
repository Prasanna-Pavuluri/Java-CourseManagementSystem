package com.Course.View;

import java.util.Scanner;

import com.Course.*;

public class ViewCourse {
	
	
public static void viewCourse() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("****Enter Course id to show****");
		int id=sc.nextInt();
		
		for(int i=0;i<CourseService.course_count;i++)
		{
			if(id==CourseService.courses[i].getCourseId())
			{
				 Course c=CourseService.courses[i];
				 c.displayDetails();
			}
			
			else
				System.out.println("****No course record****");
		}
		
		System.out.println("****course details displayed succesfully****");
		
	}

}
