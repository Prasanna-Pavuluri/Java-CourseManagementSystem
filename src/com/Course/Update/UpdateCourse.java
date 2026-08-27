package com.Course.Update;

import java.util.Scanner;
import com.Course.*;

public class UpdateCourse {
	
	
public static void updateCourse() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("****Enter course id to update****");
		int id=sc.nextInt();
		
		for(int i=0;i<CourseService.course_count;i++)
		{
			if(id==CourseService.courses[i].getCourseId())
			{
				Course stu=CourseService.courses[i];
				System.out.println("Enter new id : ");
				int new_id=sc.nextInt();
				
				System.out.println("Enter new name : ");
				String new_name=sc.next();
				
				System.out.println("Enter new duration : ");
				int new_duration=sc.nextInt();
				
				
				
				stu.setCourseId(new_id);
				stu.setCourseName(new_name);
				stu.setCourseDuration(new_duration);
				
				
				System.out.println("****course updated succesfully****");
				
				
			}
			else
				System.out.println("****No stduent record****");
		}
}
}
		


