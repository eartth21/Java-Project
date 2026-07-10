//키보드로 정수 2개 입력 큰값을 출력하세요

import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.print("정수 2개 입력: ");
		
		int a = scn.nextInt();
		int b = scn.nextInt();

		/* a가 b보다 클 경우 else가 출력되는 오
		if(a>b) {
			System.out.println(a+">"+b);
		}
		if(a<b) {
			System.out.println(a+"<"+b);
		}else{
			System.out.println(a+"=="+b);
		}
		 */
	
		if(a>b) {
			System.out.println(a+">"+b);
		}else {
			if(a<b){
				System.out.println(a+"<"+b);

			}else {
				System.out.println(a+"=="+b);
			}
		}
	
	
		
	}


}
