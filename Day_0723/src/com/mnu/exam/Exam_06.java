package com.mnu.exam;
class SuperA{
	
}
class ChildA extends SuperA{
	
}
public class Exam_06 {
	public static void main(String[] args) {

		//조상은 자식 객체 생성 가능
		SuperA a = new SuperA();
		SuperA b = new ChildA();//업캐스팅(형변환)
		
		//자식은 부모 객체 생성 불가
		//ChildA c = new SuperA();
		
		//ChildA d = (ChildA)a;//Super객체인 'a'를 Child객체 'd'로 다운캐스팅(강제형변환)불가 (runtime 오류발생)
		  ChildA e = (ChildA)b;//다운캐스팅(강제형변환)'b'는 Super객체지만 Child 클래스로 만들어졌기 때문에 형변환 가능(원상복구)
		
	}	

}
