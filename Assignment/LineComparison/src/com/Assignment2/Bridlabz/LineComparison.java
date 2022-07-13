package com.Assignment2.Bridlabz;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Line Computation Program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first co-ordinate of x");
		int x1 = sc.nextInt();
		System.out.println("Enter the first co-ordinate of y");
		int y1 = sc.nextInt();
		System.out.println("Enter the second co-ordinate of x");
		int x2 = sc.nextInt();
		System.out.println("Enter the second co-ordinate of y");
		int y2 = sc.nextInt();
		double line_length = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
		System.out.println("The length of line is" + line_length);
	}

}
