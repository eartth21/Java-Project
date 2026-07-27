package com.mnu.exam01;
class Static{
	public int a=20;
	static int b=0;//정적변수
}
public class Exam_07 {

	public static void main(String[] args) {

		int a = 10;
		Static.b=a;
		Static st = new Static();
		
		System.out.println(Static.b++);//b값 출력 후 ++
		System.out.println(st.b);//11
		System.out.println(a);//10
		System.out.println(st.a);//20
	}

}
