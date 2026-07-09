/*
 * 키보드로 이름 국어 영어 수학 점수를 입력, 총점, 평균, 판정을 구하여 출력
 * 1. 입력은 한줄로 입력
 *  ex) 김학생 99 93 88
 * 2. 평균은 소수점 이하 3째자리에서 반올림
 * 3. 판정은 평균 80점 이상 "합격" 아니면 "불합격"
 * 4. 출력은 다음과 같이한다.
 *  이름		총점		평균		판정
 *  김학생 	xxx		xx.xx	합격
 */

import java.util.Scanner;

public class Exam_16 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("이름, 국어, 영어, 수학 점수를 입력하세요.");
		String name =scn.next();
		int kor=scn.nextInt();
		int eng=scn.nextInt();
		int math=scn.nextInt();
		
		int tot=kor+eng+math;
		double ave=(int)(tot/3.*100+0.5)/100.;
		
		/*String result="";
		if(ave>=80) {
			result="합격";
		}else {
			"불합격";
		}
		*/
		
		String result = (ave>=80)?"합격":"불합격";
		
		System.out.println("이름\t총점\t평균\t판정");
		System.out.print(name+"\t"+tot+"\t"+ave+"\t"+result);
		
		
		
		
		
		
		
		
		
		
		
	}

}
