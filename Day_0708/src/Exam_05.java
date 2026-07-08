/*
 * 	키보드 입력 Scanner 클래스 도움으로 입력
 * 	정수, 실수, 문자열 구분해서 입력 가능
 */

import java.util.Scanner;//cmd+shift+o //클래스보다 위에 있어야

public class Exam_05 {

	public static void main(String[] args) {
		//객체 생성(클래스를 이용하여 객체 생성)

		Scanner scn;//변수 생성
		scn= new Scanner(System.in);//객체 생성
		
		Scanner scn2 = new Scanner(System.in);
		System.out.print("이름 국어 영어 수학 입력하시오 ");
		
		String name = scn.next();//문자
		int k = scn.nextInt();//정수
		int e = scn.nextInt();
		int m = scn.nextInt();
		
		System.out.println("이름: "+name);
		System.out.println("국어: "+k);
		System.out.println("영어: "+e);
		System.out.println("수학: "+m);
		System.out.println("총점: "+(k+e+m));
		System.out.println("평균: "+(k+e+m)/3);


	
	}

}
