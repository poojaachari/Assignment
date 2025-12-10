package com.acharya.classes;

import java.util.Scanner;

public class StudentObject {
	int id;
	String name;
	double marks;

	StudentObject(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	String getName() {
		return name;
	}

	double getMarks() {
		return marks;
	}

}
