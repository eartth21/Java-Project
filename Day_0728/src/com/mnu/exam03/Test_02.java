package com.mnu.exam03;

import java.util.Scanner;

public class Test_02 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int chArr[]=new int[26];
		while(true) {
			System.out.print("단어 입력: ");
			String word=scn.next().toUpperCase();
			if(word.equals("end")||word.equals("END")) 
				break;
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			int index =ch-65;
			chArr[index]++;
		}	
	}
	
		for(char ch='A';ch<='Z';ch++) {
			System.out.printf("%3c", ch);
		}
		System.out.print("\n");
		
		for(int i=0;i<chArr.length;i++) {
			System.out.printf("%3d",chArr[i]);
		}
		System.out.print("\n");
		
		int max=chArr[0];
		char maxChar='A';
		
		for(int i=0;i<chArr.length;i++) {
			if(max<chArr[i]) {
				max=chArr[i];
				maxChar=(char)(i+65);
			}
		}
		System.out.println("최대 발생 문자: "+maxChar+"("+max+")");
	}
	

}
