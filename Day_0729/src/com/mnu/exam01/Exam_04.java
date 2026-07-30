package com.mnu.exam01;

public class Exam_04 {
	public static void main(String[] args) {

		double r = (int)Math.random();
		System.out.println(r);
		
		//1 ~ 45 사이의 난수 5개 발생
		for(int i=1;i<=6;i++) {
			int rr=(int)(Math.random()*45)+1;
			System.out.print(rr+" ");

		}
	}

}
