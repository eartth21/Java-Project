package com.mnu.test;

import com.mnu.exam.Cal;

public class CalExam {

	public static void main(String[] args) {
		Cal c1 = new Cal();//패키지가 다른 클래스 불러올 때 import
		com.mnu.exam.Cal c2= new com.mnu.exam.Cal();
		
		
	}

}
