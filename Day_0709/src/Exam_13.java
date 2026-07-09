//키보드로 정수를 입력 입력된 정수가 80이상이면 "합격"

import java.util.Scanner;

public class Exam_13 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("정수 입력: ");
		
		int jum=scn.nextInt();
		
		if(jum>=80) {
			System.out.println("Pass");
		}
		System.out.println("Program End");

	}
}
