package com.exam;

//1. �������� �޾Ƽ� ������ ���ϴ� �޼ҵ带 ������ Ŭ����
public class Score {
	public static void tot(int a, int b, int c) {
		int tot=a+b+c;
		System.out.printf("���� : %10d \n",tot);
	}
	public static void avg(int a, int b, int c) {
		double avg=(double) (a+b+c)/3;
		System.out.printf("��� : %10.2f",avg);
	}
}
