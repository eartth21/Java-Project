/*
 * 키보드로 이름 국어 영어 수학 점수를 입력, 총점, 평균, 판정을 구하여 출력
 * 1. 입력은 한줄로 입력
 *  ex) 김학생 99 93 88
 * 2. 평균은 소수점 이하 3째자리에서 반올림
 * 3. 판정은 3과목 모두 60점 이상이고 평균 80점 이상 "합격" 아니면 "불합격"
 * 4.불합격 사유 출력
 * 	- 한과목이라도 60점 미만인 경우 "과락"
 * 	-3과목 모두 60이상이나 평균이 80미만이면 "평균미만"
 * 5. 출력은 다음과 같이한다.
 *  1.이름		총점		평균		판정 		불합격사유
 * 	 김학생 		xxx		xx.xx	합격
 *  2.이름 		총점		평균		판정		불합격사유		
 *   이학생		xxx		xx.xx	불합격	과락
 */

import java.util.Scanner;

public class Exam_20 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("이름, 국어, 영어, 수학 점수를 입력하세요.");

		String name =scn.next();
		int kor=scn.nextInt();
		int eng=scn.nextInt();
		int math=scn.nextInt();
		
		int tot=kor+eng+math;
		double ave=(int)(tot/3.*100+0.5)/100.;
		
		String result="";
		String reason="";
		
		if(kor>=60&&eng>=60&&math>=60 && ave>=80) {
			result="합격";
		}else{
			result="불합격";
			if(kor<60||eng<60||math<60){
				reason="과락";
			}else{
				reason="평균미만";
			}
		}
		
		
		System.out.println("이름\t총점\t평균\t판정\t불합격사유");
		System.out.println(name+"\t"+tot+"\t"+ave+"\t"+result+"\t"+reason);
	
		
		
		
		
		
			
		

	}
}

