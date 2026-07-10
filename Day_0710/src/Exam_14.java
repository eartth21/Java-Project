//키보드로 이름, 국어, 영어, 수학, 과학 점수를 입력 총점, 평균을 구하여 최고점수, 최저점수를 출력
/* 입력: 홍길동 70 80 90 86
 * 출력
 * 이름:  
 * 총점:
 * 평균:
 * 최고점:
 * 최저점:
 */

import java.util.Scanner;

public class Exam_14 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("이름, 국어, 영어, 수학, 과학 입력");
		String name=scn.next();
		int kor=scn.nextInt();
		int eng=scn.nextInt();
		int mth=scn.nextInt();
		int snc=scn.nextInt();
		int tot=kor+eng+mth+snc;
		double ave=(int)(tot/4.+0.5)*100/100;
		
		int max=kor;
		int min=kor;
		
		if(max<eng) {
			max=eng;
		}else if(min>eng) {
			min=eng;
		}
		if(max<mth) {
			max=mth;
		}else if(min>mth) {
			min=mth;
		}		
		if(max<snc) {
			max=snc;
		}else if(min>snc) {
			min=snc;
		}		
		System.out.println("이름: "+name);
		System.out.println("총점: "+tot);
		System.out.println("평균: "+ave);
		System.out.println("최고점수: "+max);
		System.out.println("최저점수: "+min);
		
	}

}
