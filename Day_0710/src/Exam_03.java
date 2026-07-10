// 키보드로 점수를 입력 입력된 점수가 80~90 사이면 "Pass" 아니면 "NoPass"

import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("점수를 입력하세요");
		
		int score=scn.nextInt();
		
		//&& 사용시
		if(score>=80 && score>=90) {
			System.out.println("Pass");
		}else {
			System.out.println("NoPass");
		}
		
		//&& 미사용
		if(score>=80) {
			if(score<=90) {
				System.out.println("Pass");
			}else {
				System.out.println("NoPass");
			}
		}else {
			System.out.println("NoPass");
		}
	
		
		
		
	}

}
