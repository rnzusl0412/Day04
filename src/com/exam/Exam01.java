package com.exam;

/*
 * �̸� : ȫ�浿
 * ���� : 100
 * ���� : 78
 * ���� : 81
 * ���� : 
 * ��� : 
 * 
 */
public class Exam01 {

	public static void main(String[] args) {
		// 1. ������ Ÿ�� ���� (�ʱⰪ), ������
		String name = "ȫ�浿";
		int a = 100, b = 78, c = 82;
		// 2. ���� (����, ���)
		double tot = a + b + c, avg = tot / 3;
		// 3. ��� System.out.printf()

		System.out.printf("�̸� : %9s\n", name);
		System.out.printf("���� : %10d \n���� : %10d \n" + "���� : %10d \n", a, b, c);
		System.out.printf("���� : %10.2f \n", tot);
		System.out.printf("��� : %10.2f \n", avg);
		
	}

}
