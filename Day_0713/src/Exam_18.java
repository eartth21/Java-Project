//진법변환(10 -> 2진수)

import java.util.Scanner;

public class Exam_18 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("10진수 입력: ");
		int dec = scn.nextInt();
		
		if(dec<1||dec>100) {
			System.out.println("입력 오류");
			System.exit(1);
		}
		int imsi = dec; // 처음 dec값 보관용
		String bin="";//2진수-문자열 결합방식
	
		while(dec !=0) {
			int na = dec%2;
			bin = na + bin;//나머지 값을 역순으로 결합
			dec = dec/2;
		}
		
		System.out.println("10진수: "+imsi);
		System.out.println("2진수: "+bin);
		
		
		
	}

}
