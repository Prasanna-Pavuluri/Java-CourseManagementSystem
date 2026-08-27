package com.Course.ListofCourses;

import com.Course.*;


public class ListOfCourses {
	
	public static void listCourses() 
	{
		if(CourseService.course_count == 0) 
		{
			System.out.println("No  Courses to display please add Courses");
			return ;
		}
		
		for(int i=0;i<CourseService.course_count;i++)
		{
			Course c=CourseService.courses[i];
			c.displayDetails();
			
		}
	}

}
