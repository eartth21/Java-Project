package com.mnu.exam01;
class Parent{
	void show(){
	System.out.println("Parent");	
	}
	void test(){}
}
class Child extends Parent{
	void show(){//오버라이딩
		System.out.println("Child");
	}
	void test2() {}
}
public class Exam_10 {
	public static void main(String[] args) {
		Parent pa1 = new Parent();
		pa1.show();
		//pa1.test2(); 자식객체에서 생성된 메소드 호출 불가

		Parent pa = new Child();
		pa.show();//오버라이딩 된 값 호출
		
		Child ch = new Child();
		ch.show();
		ch.test();
	}

}
