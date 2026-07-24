package com.mnu.exam02;


public class Exam_12 {

	public static void main(String[] args) throws Exception {
		
		System.out.print("1문자 입력: ");
		char ch = (char)System.in.read();
		//system.in.read(); 1문자 입력받아서 정수로 반환하는 메소드
		switch(ch) {
		case 'a':
			System.out.print("one");
		case 'b':
			System.out.print("two");
		case 'c':
			System.out.print("three");
			break;
		case 'd':
			System.out.print("four");
			break;
		
		}
		
		
		
	}

}
