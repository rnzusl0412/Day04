package com.exam;

public class Exam03 {

	public static void main(String[] args) {
		// 1. 데이터 타입 선언 (초기값), 값대입
		String name = "홍길동";
		int a = 100, b = 78, c = 82;
		// 2. 연산 (총점, 평균)
		// 3. 출력 System.out.printf()
		System.out.printf("이름 : %9s\n", name);
		System.out.printf("국어 : %10d \n수학 : %10d \n" + "영어 : %10d \n", a, b, c);
		Score.tot(a, b, c);
		Score.avg(a, b, c);

	}

}
