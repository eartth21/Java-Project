//소수 판별
// 2 3 4 7 11 ...

import java.util.Scanner;

public class Exam_10 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int a= scn.nextInt();
		for(int x=2;x<=a;x++) {
			if(a%x ==0) {
				if(x==a) {
					System.out.println(a+"소수입니다.");
					break;
				}else {
					System.out.println(a+"소수가 아닙니다.");
					break;
				}
			}
		}
		
		
		
		
		
		
		
	}

}
