package com.mnu.exam02;
interface InterB{
	int add(int a, int b);
}
public class Exam_17 {
	public static void main(String[] args) {
		//익명 구현체를 이용한 a~b 합계
		
		InterB ab= new InterB() {
			public int add(int a, int b) {
				int sum=0;
				for(int i=a;i<=b;i++) {
					sum +=i;
				}
				return sum;
			}
		};
		
		int result = ab.add(1, 10);
		System.out.print("결과: "+result);
	}

}
