package com.mnu.exam02;
//연산자 우선순위 java 1권 35p
public class Exam_09 {

	public static void main(String[] args) {
		int w=3, x=4, y=3, z=6;
		if((w==2 |w==y)&!(y>z)&(1==x^y !=z)) {
			w = x+y;
		}else {
			w= y+z;
		}
		System.out.println(w);
		
		
	}

}
