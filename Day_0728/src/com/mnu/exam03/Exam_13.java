package com.mnu.exam03;

public class Exam_13 {

	public static void main(String[] args) {
		String s1 = "Korea";
		String s2 = "Korea";
		String s3 = new String("Korea");
		String s4 = new String("Korea");
		
		System.out.println("s1 ==s2: "+(s1==s2));//같은 주소
		System.out.println("s1.equals(s2): "+(s1.equals(s2)));//같은 객체
		System.out.println("s1==s3: "+(s1==s3));
		System.out.println("s1.equals(s3): "+(s1.equals(s3)));		
		System.out.println("s3==s3: "+(s3==s4));
		System.out.println("s3.equals(s4): "+(s3.equals(s4)));
	
	}

}
