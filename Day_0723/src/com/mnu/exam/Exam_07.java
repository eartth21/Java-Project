package com.mnu.exam;
class EE{
	
}
class ChEE extends EE{
	
}
public class Exam_07 {
	public static void main(String[] args) {
		EE e = new ChEE();//EE 클래스를 이용해서 ChEE 객체 생성
		// 객체 타입 확인 instanceof 연산자
		
		if(e instanceof ChEE) {
			System.out.println("같은 타입임");
			ChEE ch = (ChEE)e;
		}else {
			System.out.println("다른 타입임");
		}
		
		if(e instanceof EE) {
			System.out.println("같은 타입임");
			ChEE ch = (ChEE)e;
		}else {
			System.out.println("다른 타입임");
		}
		
		
	}

}
