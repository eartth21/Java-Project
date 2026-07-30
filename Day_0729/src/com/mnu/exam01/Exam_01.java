package com.mnu.exam01;
class AA {
	int bun=10;
	String name="홍길동";
	@Override
	public String toString() {
		return bun+","+name;
	}
	
}
public class Exam_01 {
	public static void main(String[] args) {

		String str = new String("AAAAA");
		AA a = new AA();
		
		System.out.println("str: "+str);//toString 자동 오버라이딩됨
		System.out.println("a: "+a);// 참조변수에는 주소값
		
	}

}
