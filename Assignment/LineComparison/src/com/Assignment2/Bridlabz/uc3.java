package com.Assignment2.Bridlabz;

import java.util.Scanner;

public class uc3 {
	int x1, x2, y1, y2, a1, a2, b1, b2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uc3 firstobject = new uc3();
		firstobject.compare();

	}

	public void compare() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first co-ordinate of x1");
		int x1 = sc.nextInt();
		System.out.println("Enter the first co-ordinate of y1");
		int y1 = sc.nextInt();
		System.out.println("Enter the second co-ordinate of x2");
		int x2 = sc.nextInt();
		System.out.println("Enter the second co-ordinate of y2");
		int y2 = sc.nextInt();
		System.out.println("Enter the first co-ordinate of a1");
		int a1 = sc.nextInt();
		System.out.println("Enter the first co-ordinate of b1");
		int b1 = sc.nextInt();
		System.out.println("Enter the second co-ordinate of a2");
		int a2 = sc.nextInt();
		System.out.println("Enter the second co-ordinate of yb2");
		int b2 = sc.nextInt();
		double length1 = Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2)));
		double length2 = Math.sqrt(Math.pow((a2 - a1), 2) + (Math.pow((b2 - b1), 2)));
		if (length1 == length2) {
			System.out.println("Lines are equal");
		} else if (length1 > length2) {
			System.out.println("Length1 is greater");
		} else {
			System.out.println("Length2 is greater");
		}
	}
}
