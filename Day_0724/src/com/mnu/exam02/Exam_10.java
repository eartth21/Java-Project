package com.mnu.exam02;
//스위치 케이스에 사용될 수 있는 것(정수,문자,문자열)
public class Exam_10 {

	public static void main(String[] args) {
		int kor =71, eng=98,mat=87; //256
		int sum=kor+eng+mat; //8
		
		switch(sum/30) {
			case 10:
			case 9: System.out.print("A");
			case 8: System.out.print("B");
			case 7: 
			case 6: System.out.print("C");
			default: System.out.print("D");
		}
		 //결과값 BCD  - break 없기 때문에 하위 case 는 무시되고 결과값 찍힘
		
		
		
		
	}

}
