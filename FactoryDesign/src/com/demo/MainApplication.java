package com.demo;

import java.util.Scanner;

public class MainApplication {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Please enter objectname : ");
		String Object = scr.nextLine();
		FactoryClass obj = new FactoryClass();
		obj.getInstance(Object).spec();
	}
}
