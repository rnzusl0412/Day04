package com.test02;

public class MTest01 { // ��� �޼ҵ�

	public static void Prn_Name(String name) {
		System.out.println(name + "�� �ȳ��ϼ���.");
	}

	public static void main(String[] args) {
		Prn_Name("ȫ�浿");
		
		//�޼ҵ带 ȣ���� �� full_name �� ������ ���� class �� static �޼ҵ带 ã�´�.
		Prn_Name("���浿");
		
		//ex02) int a=100; int b=a; ������ ���� ������ ���� �޼ҵ带 ȣ���Ѵ�.
		String name = "�̱浿";
		Prn_Name(name);// Prn_Name("�̱浿")
		Prn_Name("90.8");
	}

}
