package com.tnsif.daytwo;

public class SwitchDemo {
	public static void main (String[] args) {
		char x = '1';
		switch (x)
		{
		case'l':
		case'L':
			System.out.println(x+" is a  Letter");
			break;
		case's':
		case'S':
			System.out.println(x+"is a Digit");
			break;
		case'w':
		case'W':
			System.out.println(x+"is White Space");
			break;
		case'v':
		case'V':
			System.out.println(x+"is Special Symbol");
			default:
			System.out.println(x+"is other than letter,space or Special Symbol");
			break;
			}
		
	}

}
