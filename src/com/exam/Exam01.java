package com.exam;

/*
 * 이름 : 홍길동
 * 국어 : 100
 * 수학 : 78
 * 영어 : 81
 * 총점 : 
 * 평균 : 
 * 
 */
public class Exam01 {

	public static void main(String[] args) {
		// 1. 데이터 타입 선언 (초기값), 값대입
		String name = "홍길동";
		int a = 100, b = 78, c = 82;
		// 2. 연산 (총점, 평균)
		double tot = a + b + c, avg = tot / 3;
		// 3. 출력 System.out.printf()

		System.out.printf("이름 : %9s\n", name);
		System.out.printf("국어 : %10d \n수학 : %10d \n" + "영어 : %10d \n", a, b, c);
		System.out.printf("총점 : %10.2f \n", tot);
		System.out.printf("평균 : %10.2f \n", avg);
		
	}

}
