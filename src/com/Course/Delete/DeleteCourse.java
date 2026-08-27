package com.Course.Delete;

import java.util.Scanner;

import com.Course.CourseService;
import com.Course.CourseService;

public class DeleteCourse {
	
public static void deleteCourse() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("****Enter course id to delete****");
		int id=sc.nextInt();
		
		int index=-1;
		
		for(int i=0;i<CourseService.course_count;i++)
		{
			if(id==CourseService.courses[i].getCourseId())
			{
				index=i;
				break;
				
			}
		}
		
		if(index==-1)
		{
			System.out.println("No record found");
			return ;
		}
		
		for(int i=index;i<CourseService.course_count-1;i++)
		{
			CourseService.courses[i]=CourseService.courses[i+1];
		}
		
		CourseService.courses[CourseService.course_count-1]=null;			
		System.out.println("*****Course Deleted Suceesfully*****");
	}

}



