package com.acharya.classes;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentObject students[] = new StudentObject[4];

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			System.out.println("Enter the details of " + (i + 1) + " student");
			System.out.println("Enter student" + (i + 1) + " id");
			int id = scan.nextInt();
			System.out.println("Enter student" + (i + 1) + " name");
			String name = scan.next();
			System.out.println("Enter student" + (i + 1) + " marks");
			double marks = scan.nextDouble();

			students[i] = new StudentObject(id, name, marks);
		}
//		System.out.println(studOne.id);
//		System.out.println(studOne.name);
//		System.out.println(studOne.salary);

		for (int i = 0; i < students.length; i++) {
			System.out.println("The id is " + students[i].id);
			System.out.println("The name is " + students[i].name);

			System.out.println("The id is " + students[i].marks);

		}
	}

}
