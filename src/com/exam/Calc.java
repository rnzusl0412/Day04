package com.exam;

public class Calc {
	public static void Hap(int a,int b) {
		int Hap=a+b;
		System.out.printf("%5d + %5d = %5d\n",a,b,Hap);
		}
	
	public static void Sup(int a,int b) {
		int Sup=b-a;
		System.out.printf("%5d - %5d = %5d\n",b,a,Sup);
	}
	
	public static void Mul(int a,int b) {
		int Mul=a*b;
		System.out.printf("%5d + %5d = %5d\n",a,b,Mul);
	}
	
	public static void Div(int a,int b) {
		double Div=(double) a/b;
		System.out.printf("%5d / %5d = %5.2f \n",a,b,Div);
	}
	
}
