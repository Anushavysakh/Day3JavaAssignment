package com.Assignment2.Bridlabz;

import java.util.Scanner;

public class LineComparison {

	public int comparison() {
		double x1,x2,y1,y2;
		Sysytem.out.println("Welcome to Line Comparison Method");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first co-ordinate of x");
		 x1 = sc.nextInt();
		System.out.println("Enter the first co-ordinate of y");
		 y1 = sc.nextInt();
		System.out.println("Enter the second co-ordinate of x");
		 x2 = sc.nextInt();
		System.out.println("Enter the second co-ordinate of y");
		 y2 = sc.nextInt();
		double line_length = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
		System.out.println("The length of line is" + line_length);
	}
}
