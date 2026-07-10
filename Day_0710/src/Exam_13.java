/*
 * 키보드로 이름 국어 영어 수학 입력 총점 평균 등급을 구하여 출력
 * 등급은 100~90 수, 89~80 우, 79~70 미, 69~60 양, 60미만 가
 * [입력형식]
 * 이름: 김학생 90 80 70
 * [출력형식]
 * 이름: 김학생
 * 총점: 000
 * 평균: 000
 * 등급: 0
 * 
 * switch case 사용
 */

import java.util.Scanner;

public class Exam_13 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("이름, 국어, 영어, 수학 입력");
		String name=scn.next();
		int kor=scn.nextInt();
		int eng=scn.nextInt();
		int mth=scn.nextInt();
		int tot=kor+eng+mth;
		double ave=(int)(tot/3.+0.5)*100/100;
		String grade="";
		
		int ave2=(int)ave/10;
		 
		
		switch(ave2) {
			case 10:
			case 9:
				grade="수";
				break;
			case 8:
				grade="우";
				break;
			case 7:
				grade="미";
				break;
			case 6:
				grade="양";
				break;
			default:
				grade="가";	
		}
		
		System.out.println("이름: "+name);
		System.out.println("총점: "+tot);
		System.out.println("평균: "+ave);
		System.out.println("등급: "+grade);
		
	}

}
