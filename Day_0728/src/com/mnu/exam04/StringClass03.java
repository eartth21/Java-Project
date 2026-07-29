package com.mnu.exam04;
//지정된 문자열 포함 유무(contains())
public class StringClass03 {
	public static void main(String[] args) {

		String str="Hello 자바 World 자바 프로그래밍";
		boolean bool = str.contains("자바");
		
		System.out.println(bool);
		
	}

}
