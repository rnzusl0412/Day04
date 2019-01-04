package com.test02;

public class MTest01 { // 멤버 메소드

	public static void Prn_Name(String name) {
		System.out.println(name + "님 안녕하세요.");
	}

	public static void main(String[] args) {
		Prn_Name("홍길동");
		
		//메소드를 호출할 때 full_name 이 없으면 같은 class 의 static 메소드를 찾는다.
		Prn_Name("정길동");
		
		//ex02) int a=100; int b=a; 변수에 값을 저장한 다음 메소드를 호출한다.
		String name = "이길동";
		Prn_Name(name);// Prn_Name("이길동")
		Prn_Name("90.8");
	}

}
