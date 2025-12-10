package com.acharya.classes;

public class Student {
	int id;
	String firstName;
	String lastName;
	double fees;

	Student(int id, String firstName, String lastName, double fees) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.fees = fees;
	}

	String getName() {
		return firstName + " " + lastName;
	}

	double getFees() {
		return fees;
	}

	public static void main(String args[]) {
		Student s1 = new Student(1, "Pooja", "Achari", 150000.0);
		Student s2 = new Student(1, "Manasa", "Achari", 153000.0);
		Student s3 = new Student(1, "Asha", "Achari", 151000.0);

		System.out.println("Student 1:  " + s1.getName());
		System.out.println("            Fees   "+s1.getFees());
		System.out.println("Student 2:  " + s2.getName());
		System.out.println("            Fees   "+s2.getFees());
		System.out.println("Student 3:  " + s3.getName());
		System.out.println("            Fees   "+s3.getFees());

	}
}
