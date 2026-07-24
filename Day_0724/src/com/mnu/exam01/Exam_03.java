package com.mnu.exam01;

public class Exam_03 {

	public static void main(String[] args) {
		int a=3, b=4, c=2;
		boolean r1,r2,r3;
		
		r1 = b<4||c==2;//관상논
		//    F    T
		// =     T
		r2 = a>0 && b<5;
		//    T      T
		// =     T
		r3 = !r1;
		// =  F
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		
	}

}
