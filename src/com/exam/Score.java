package com.exam;

//1. 세과목을 받아서 총점을 구하는 메소드를 가지는 클래스
public class Score {
	public static void tot(int a, int b, int c) {
		int tot=a+b+c;
		System.out.printf("총점 : %10d \n",tot);
	}
	public static void avg(int a, int b, int c) {
		double avg=(double) (a+b+c)/3;
		System.out.printf("평균 : %10.2f",avg);
	}
}
