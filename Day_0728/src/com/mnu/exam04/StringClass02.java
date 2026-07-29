package com.mnu.exam04;
//문자열 결합
public class StringClass02 {
	public static void main(String[] args) {
		String str="";
		for(int x=0;x<10;x++) {
			str+=x;
		}
		System.out.println(str);
	
		String str1="";
		for(int x=0;x<10;x++) {
			str1 = str1.concat(""+x);
		}
		System.out.print(str1);;
		
	}
}
