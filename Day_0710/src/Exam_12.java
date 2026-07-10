/*
 * 키보드로 이름 국어 영어 수학 입력 총점 평균 등급을 구하여 출력
 * 등급은 100~90 수, 89~80 우, 79~70 미, 69~60 양, 60미만 가
 * [입력형식]
 * 이름: 김학생 90 80 70
 * [출력형식]
 * 이름: 김학생
 * 총점: 000
 * 평균: 000 // 평균은 소수이하 둘째자리까지
 * 등급: 0
 * 
 * if() 사용
 */

import java.util.Scanner;

public class Exam_12 {
	public static void main(String[] args) {

	Scanner scn = new Scanner(System.in);
	System.out.print("이름, 국어, 영어, 수학 입력");
	String name=scn.next();
	int kor=scn.nextInt();
	int eng=scn.nextInt();
	int mth=scn.nextInt();
	int tot=kor+eng+mth;
	double ave=(int)(tot/3.*100+0.5)/100.;
	double ave1=tot/3.;//출력할때 변경
	String grade="";
	
	if(ave>100||ave<0) {
		System.out.println("입력오류");
	}else if(ave>=90) {
		grade="수";
	}else if(ave>=80) {
		grade="우";
	}else if(ave>=70) {
		grade="미";
	}else if(ave>=60) {
		grade="양";
	}else {
		grade="가";
	}
	
	System.out.println("이름: "+name);
	System.out.println("총점: "+tot);
	System.out.println("평균: "+ave);//String format("%.2f",ave1));
	System.out.println("등급: "+grade);
	
		
	}

}
