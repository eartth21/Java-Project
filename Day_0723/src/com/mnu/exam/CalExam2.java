package com.mnu.exam;

public class CalExam2 {

	public static void main(String[] args) {//객체 생성하지 않아도 사용할 수 있음-클래스에 속함, 여러개의 객체에서 공유 가능

		Cal2.add(10,20);
		
		Cal2 c1 = new Cal2();
		c1.add(10,20);
	}

}
