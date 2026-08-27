package com.Student.ListofStudents;

import com.Student.Service;
import com.Student.Student;

public class ListofStudents {
	
	public static void listStudents() 
	{
		if(Service.count == 0) 
		{
			System.out.println("No  Stduent to display please add studnets");
			return ;
		}
		
		for(int i=0;i<Service.count;i++)
		{
			Student stu=Service.students[i];
			stu.displayDetails();
			
		}
	}

}
