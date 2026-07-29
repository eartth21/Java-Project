package com.mnu.exam04;
//문자열 비교(equals(문자열))
public class StringClass04 {
	public static void main(String[] args) {

		String s1 = "AAA";
		String s2 = "AAA";
		String s3 = new String("AAA");
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}

}
