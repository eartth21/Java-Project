package com.mnu.exam;
//계산기 클래스
public class Cal2 {
	private int a;
	private int b;
	
	public Cal2(){}		
	public Cal2(int a) {
		this.a=a;
	}
	public Cal2(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	
	public void add() {
		int result = a+b;
		System.out.printf("%d + %d = %d\n",a,b,a+b,result);
	}
	public static void add(int a, int b) { //static(변수,메소드) - new를 쓰지 않아도 객체 메소드영역에 생성됨
		int result = a+b;
		System.out.printf("%d + %d = %d\n",a,b,a+b,result);
	}



	
	
	
}
