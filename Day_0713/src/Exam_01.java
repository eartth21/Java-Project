//1~15 사이의 정수를 입력 16진수 변환프로그램 작성 입력 값이 1~15 사이가 아니면 "입력오류" 출력 후 종료

import java.util.Scanner;

public class Exam_01 {
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
	
		if(na==10) {
				result="A";
			}else if(na==11) {
				result="B";
			}else if(na==12) {
				result="C";
			}else if(na==13) {
				result="D";
			}else if(na==14){
				result="E";
			}else if(na==15) {
				result="F";
			}else {
				result=na+"";//정수를 문자로 바꾸는 방법
							 //문자열을 정수로 Integer.parseInt("1")
			}
		System.out.println("10진수: "+num);
		System.out.print("16진수: "+result);
		
		
		


		
		
		
		
		
		
		
		
		
	}

}
