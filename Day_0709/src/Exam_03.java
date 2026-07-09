//키보드 입력(Scanner 클래스)
/*	객체 생성
 * 	Scanner 변수명 = new scanner(System.in);
 * 
 *  메소드: next();-문자열 입력
 *  	  nextInt();-정수 입력
 *  	  nextLine();-한 줄 전체
 *  	  nextBoolean(); nextDouble(); ...
 *        XXX nextChar(); XXX
 */

import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);//scn 참조변수
		//키보드로 이름, 국어, 영어, 수학 점수를 입력
		//총점, 평균(실수로 계산)을 구하여 출력
		
		//한줄에서 모두 입력시
		System.out.print("학생 입력: ");
		String na = scn.next();
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int math = scn.nextInt();
		
		int tot = kor+eng+math;
		//double ave = tot/3;//결과는 정수
		double ave = tot/3.;//결과는 실수
		
		System.out.println("이름: "+na);				
		System.out.println("총점: "+tot);		
		System.out.println("평균: "+ave);		
		
		
		
		
		
		
	}

}
