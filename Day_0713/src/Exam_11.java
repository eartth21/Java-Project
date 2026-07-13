//소수 판별
// 2 3 4 7 11 ...

import java.util.Scanner;

public class Exam_11 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int a= scn.nextInt();
		int x;
		for(x=2;x<=a;x++) {
			if(a%x ==0) {
				break;
				}
			}
		if(x==a) {
			System.out.println(a+"는 소수");
		}else {
			System.out.println(a+"는 소수아님");
		}
		
		
		
		
		
		
		
	}

}
