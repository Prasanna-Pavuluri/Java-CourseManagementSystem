package com.Student.Delete;

import java.util.Scanner;

import com.Student.Service;

public class DeleteStudent {
	
public static void deleteStudent() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("****Enter Student id to delete****");
		int id=sc.nextInt();
		
		int index=-1;
		
		for(int i=0;i<Service.count;i++)
		{
			if(id==Service.students[i].getStudentId())
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
		
		for(int i=index;i<Service.count-1;i++)
		{
			Service.students[i]=Service.students[i+1];
		}
		
		Service.students[Service.count-1]=null;			
		System.out.println("*****Stduent Deleted Suceesfully*****");
	}

}



