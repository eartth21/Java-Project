package com.mnu.exam02;
abstract class BB{
	abstract int a(int a,int b);
	
	abstract void b(int a);
}
class SubBB extends BB{
	int a(int a, int b) {
		a=a+b;
		return a;
	}
	void b(int a) {
		int b = a-1;
	}
}
public class Exam_13 {

	public static void main(String[] args) {
		BB b = new SubBB();
		int s =b.a(10,20);
		System.out.print("s= "+s);
		b.b(100);
	}

}
