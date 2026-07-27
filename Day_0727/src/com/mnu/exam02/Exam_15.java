package com.mnu.exam02;
class AAAA{
	
}
class BBBB{
	
}
//다중 상속 불가
//class AABBExam extends AAAA,BBBB{}
interface A{
	
}
interface B{
	
}
class AB implements A,B{ //인터페이스 다중 구현 가능
	
}
class C extends AAAA implements A{//다중 상속 효과
	
}
public class Exam_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
