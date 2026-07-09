//키보드로 실수를 입력하여 입력된 값이 85~95사이면 "Pass" 아니면 "No"출력하는 프로그램 작성

import java.util.Scanner;

public class Exam_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.print("입력: ");
		
		double jum = scn.nextDouble();
		String str=(jum>=85 && jum<=95)?"Pass":"No";
		System.out.println(str);

		boolean bool1 = jum>=85;
		boolean bool2 = jum<=95;
		String str2=(bool1 &&bool2)?"Pass":"No";
		System.out.print(str2);

		
		
		
		
		
		
	}

}
