package com.mnu.exam01;

public class Exam_04 {
//스테틱을 사용하지 않을 경우 객체를 생성해야함
	public static void main(String[] args) {
		Exam_04 ex4 = new Exam_04();
		System.out.print(ex4.check(1));
	}
	 String check(int num){
		return(num>=0)? "POSITIVE" :"NEGATIVE";
	}

}

