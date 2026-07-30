package com.mnu.exam01;

import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		StringBuffer stBuf = new StringBuffer();
		
		while(true){
			System.out.print("10진수 입력: ");
			int val =scn.nextInt();
			if(val==-99)
				break;
			stBuf.delete(0, stBuf.length());
			int mok;
			int nmg;
			do {
				mok=val/2;
				nmg=val%2;
				stBuf.insert(0, nmg);
				val=mok;
			}while(mok!=0);
			System.out.println("2진수: "+stBuf);
		}
		System.out.print("프로그램을 종료합니다");
	}

}
