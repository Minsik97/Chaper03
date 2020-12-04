package com.javaex.ex05;

public class RactangleApp {

	public static void main(String[] args) {
		
		Ractangle a = new Ractangle(6,4);
		Ractangle b = new Ractangle(6,4);
		Ractangle c = new Ractangle(12,2);
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));

	}

}
