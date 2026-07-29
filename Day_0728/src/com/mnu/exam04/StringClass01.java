package com.mnu.exam04;
//문자추출
public class StringClass01 {

	public static void main(String[] args) {

		String str = "자바 프로그래밍";
		char ch = str.charAt(4);
		
		for(int x=0;x<str.length();x++) {
			char c = str.charAt(x);
			System.out.println(c);
		}
		
		String ssn = "900206-1234567";
		char s =ssn.charAt(7);

		System.out.println("성별체크: "+s); 
		

		
	}

}
