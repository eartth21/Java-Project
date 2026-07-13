//1~15 사이의 정수를 입력 16진수 변환프로그램 작성 입력 값이 1~15 사이가 아니면 "입력오류" 출력 후 종료

import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("1~15 사이의 정수를 입력하시오: ");
		int num=scn.nextInt();
		String result="";
		
		if(num<1||num>15) {
			System.out.println("입력오류");
			System.exit(1);
			}

		int na = num%16;
	

		switch(na) {
			case 15:
				result = "F";
				break;
			case 14:
				result = "E";
				break;
			case 13:
				result = "D";
				break;
			case 12:
				result = "C";
				break;
			case 11:
				result = "B";
				break;
			case 10:
				result = "A";
				break;
			default:
				result=num+"";
			
		}
		
		
		
		System.out.println("10진수: "+num);
		System.out.print("16진수: "+result);
		
		
		


		
		
		
		
		
		
		
		
		
	}

}
