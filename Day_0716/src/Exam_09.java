//키보드로 정수 연산자 정수를 입력하면 사칙연산을 하는 프로그램

import java.util.Scanner;

public class Exam_09 {

	static void add(int a,int b) {
		System.out.println(a+" + "+b+" = "+(a+b));
	}
	static void sub(int k1,int k2) {
		int r = k1-k2;
		System.out.printf("%d - %d = %d\n",k1,k2,r);
	}
	static void mul(int a,int b) {
		System.out.println(a+" * "+b+" = "+(a*b));
	}
	static void div(int a,int b) {
		int r= a/b;
		System.out.println(a+" / "+b+" = "+r);
	}
	static void mod(int a,int b) {
		int r=a%b;
		System.out.println(a+" % "+b+" = "+r);
	}



	
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		System.out.print("입력: ");
		
		int a = scn.nextInt();
		String op = scn.next();
		int b = scn.nextInt();
		
		if(op.equals("+"))
			add(a,b);
		else if(op.equals("-"))
			sub(a,b);
		else if(op.equals("*"))
			mul(a,b);
		else if(op.equals("/"))
			div(a,b);
		else if(op.equals("%"))
			mod(a,b);
		else
			System.out.print("연산자 오류");
		
		
	}

}
