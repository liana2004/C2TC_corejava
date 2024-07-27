package com.tnsif.dayone;

public class TypeCastingDemo {
	public static void main (String[]args) {
		byte b=10;
		int i=b;
		System.out.println(i);
		float f=0.25f;
		double d=f;
		System.out.println(d);
		char ch = 'A';
		int i4 = ch;
		System.out.println(i4);
		char var2='\u00A7';
		int i3 = var2;
		System.out.println(i3);
		double f1 =  10.24f;
		long l = (long)f1;
		System.out.println(l);
		long ll= 15929022010280187L;
		int i2 = (int)ll;
		System.out.println(i2);
		float f2=26.87f;
		int i1=(int)f2;
		System.out.println(i1);
		byte b1=99;
		char ch1 =(char) b1;
		System.out.println(ch1);
		
		
		
	}
	

}
