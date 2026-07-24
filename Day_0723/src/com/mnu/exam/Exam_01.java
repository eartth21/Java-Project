package com.mnu.exam;
class Super{
	private int a=10;//private 상속불가
	int b=100;
}
class Child extends Super{
	int b=50;//부모 변수는 숨겨짐(값이 지워지지 않고)
	int d=10;
	void test() {
		System.out.println("Super.b="+super.b);//b=100
		System.out.println("b="+b);
		System.out.println("d="+d);

	}
}
public class Exam_01 {
	public static void main(String[] args) {
		Super s1 = new Super();
		System.out.println("s1.b="+s1.b);
		Child c1 = new Child();
		System.out.println("c1.b="+c1.b);
		System.out.println("c1.d="+c1.d);
		System.out.println("----------------");
		c1.test();//b=100 d=10
		
	}

}
