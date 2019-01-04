package com.exam;

public class Exam02 {
	public static void fa(int a) {
		System.out.println("fa : "+a);
	}

	public static void fb(double a) {
		System.out.println("fb : "+a);
	}

	public static void fc(char a) {
		System.out.println("fc : "+a);
	}

	public static void fd(String a) {
		System.out.println("fd : "+a);
	}

	public static void fe(char a, String b) {
		System.out.println("fe : "+a + "," + b);
	}

	public static void ff(boolean a, boolean b) {
		System.out.println("ff :"+a + "," + b);
	}

	public static void main(String[] args) {
		fa(100);
		fb(90.9);
		fc('A');
		fd("ABC");
		fe('b', "abc");

	}

}
