package com.exam;

public class Exam03 {

	public static void main(String[] args) {
		// 1. ������ Ÿ�� ���� (�ʱⰪ), ������
		String name = "ȫ�浿";
		int a = 100, b = 78, c = 82;
		// 2. ���� (����, ���)
		// 3. ��� System.out.printf()
		System.out.printf("�̸� : %9s\n", name);
		System.out.printf("���� : %10d \n���� : %10d \n" + "���� : %10d \n", a, b, c);
		Score.tot(a, b, c);
		Score.avg(a, b, c);

	}

}
