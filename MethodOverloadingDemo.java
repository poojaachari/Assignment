package com.acharya.classes;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingDemo obj = new MethodOverloadingDemo();
		obj.display(10);
		obj.display('A');
		obj.display("Hello Java");

	}

	void display(int num) {
		System.out.println("Integer Value: " + num);
	}

	void display(char ch) {
		System.out.println("Character Value: " + ch);
	}

	void display(String str) {
		System.out.println("String Value: " + str);
	}

}
