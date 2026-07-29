package com.mnu.exam04;
//문자, 문자열 찾기(indexOf())
public class StringClass06 {
	public static void main(String[] args) {

		String str = "Java&JSP Programming 프로그래밍";
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf("프"));
		System.out.println(str.indexOf('a',2));
		
		String str1="abcabc";
		System.out.println(str1.lastIndexOf("c"));
		System.out.println(str1.lastIndexOf("c",2));
		
		
	}

}
