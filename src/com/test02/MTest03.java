package com.test02;
//�ڹ��� �޼ҵ� ����� ����

//1. �޼ҵ� �Ķ���� ������ �ʱⰪ�� ¢���� �� ����.   public static void Mtest(int a=0) < �ȵȴ�.
//2. ���ͷ��� ������ ����ȯ�� �Ͼ��. �� boolean�� ���ܵȴ�.
//3. �޼ҵ� �����ε�(overload)�� �� �� �ִ�. 
//	=>���� Ŭ�������� ������ �̸��� �޼ҵ带 �Ű������� Ÿ���̳� ������ �ٸ��� �����ϴ� �� 
//	=>�޼ҵ��� ���ӹ��


public class MTest03 {

	public static void Mtest(int a) {// 4byte ���ϴ� �ڵ����� �� �� �ִ�.
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
