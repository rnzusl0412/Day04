package com.test02;
//자바의 메소드 선언시 문법

//1. 메소드 파라미터 변수에 초기값을 짖정할 수 없다.   public static void Mtest(int a=0) < 안된다.
//2. 리터럴은 묵시형 형변환이 일어난다. 단 boolean은 제외된다.
//3. 메소드 오버로드(overload)를 할 수 있다. 
//	=>단일 클래스에서 동일한 이름의 메소드를 매개인자의 타입이나 갯수를 다르게 선언하는 것 
//	=>메소드의 네임밸류


public class MTest03 {

	public static void Mtest(int a) {// 4byte 이하는 자동으로 올 수 있다.
		System.out.println(a + " => int");
	}

	public static void Mtest(char a) {// a = 'A'
		System.out.println(a + " => char");
	}

	public static void Mtest(char a, char b) {// a = 'A'
		System.out.println(a+","+b+ " => char");
	}


	public static void main(String[] args) {
		Mtest('A');
		Mtest(100);
		Mtest('A','B');
	}
}
