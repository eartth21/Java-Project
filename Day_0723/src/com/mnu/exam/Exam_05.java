package com.mnu.exam;
class DD{
	int a=10;
	void exam() {
		System.out.println("a="+a);
	}
}
class ChDD extends DD{
	int b=20;
	void exam() {//오버라이딩
		System.out.println("a="+a);		
		System.out.println("b="+b);
	}
	void test() {
		super.exam();
		System.out.println();
		
	}
}

public class Exam_05 {
	public static void main(String[] args) {
		DD d = new ChDD();//업캐스팅 - 내가 물려준 것만 접근 가능
		System.out.println("a= "+d.a);
		//System.out.println("b= "+d.b);'b'는 자식클래스에서 만든 변수, 접근 불가
		
		d.exam();//오버라이딩 된 자식객체의 메소드 호출됨

		
	}

}
