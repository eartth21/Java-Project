package AAA;

import java.util.*;//java 폴더 안 util 폴더 안 모든 패키지 import

import BBB.Car;//BBB.* - BBB패키지 안에 있는 Car import


public class Exam_07 {

	public static void main(String[] args) {
		Test t1 = new Test();//같은 패키에 있는 클래스 끌어올 수 있음  
		
		BBB.Car c1 = new BBB.Car();//다른 클래스
		
		Car c2 = new Car();//import(cmd + shift + o)다른패키지에 있는클래스 끌어오기
		
		Scanner scn = new Scanner(System.in);
	}

}
