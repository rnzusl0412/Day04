package com.test;

public class MTest01 {

	public static void main(String[] args) {
		com.test.MTest01.Prn(); // "�ȳ��ϼ���"
		Prn();

	}
	
	public static void Prn() {
		System.out.println("�ȳ��ϼ���");
		Disp();
	}

	public static void Disp() {
		System.out.println("�ݰ��� MTest01.Disp()");
	}
		
}
