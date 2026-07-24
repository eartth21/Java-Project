package com.mnu.exam;
//계산기 클래스
public class Cal {
	private int a;//멤버변수(cal class에 속해있는 변수(instance변수)-객체를 생성(new)해야만 사용할 수 있는 변수)
	private int b;
	//생성자(클래스이름과 동일한 메소드(){},반환타입 없음 -역할: 객체 생성 & 객체 값 초기화)
	//접근제어자: private, 기본(default), protected, public
	//생성자에 접근 제한 private 걸때 - 싱글톤
	
	public Cal(){}	//default 생성자(접근제어자 default)
	public Cal(int a) {
		this.a=a;
	}
	public Cal(int a,int b) {
		this.a=a;
		this.b=b;
	}
	//오버로딩 - 같은 이름의 다른 매개변수(개수, 타입, 순서) - 일반적인 변수도 오버로딩 가능

	//기능(메소드)추가
	public void add() {
		int result = a+b;//멤버변수 a,b
		System.out.printf("%d + %d = %d\n",a,b,a+b,result);
	}
	public void add(int a, int b) {
		int result = a+b;//매개변수(지역변수) a,b
		System.out.printf("%d + %d = %d\n",a,b,a+b,result);
	}
	public void add(double a, double b) {
		double result = a+b;//매개변수(지역변수) a,b
		System.out.printf("%f + %f = %f\n",a,b,a+b,result);
	}
	public void add(int a, double b) {
		double result = a+b;//매개변수(지역변수) a,b
		System.out.printf("%d + %f = %f\n",a,b,a+b,result);
	}
	public void add(double a, int b) {
		double result = a+b;//매개변수(지역변수) a,b
		System.out.printf("%f + %d = %f\n",a,b,a+b,result);
	}


	
	
	
}
