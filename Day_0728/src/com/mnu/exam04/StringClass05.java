package com.mnu.exam04;
//string.format()
public class StringClass05 {
	public static void main(String[] args) {

		String str =String.format("%d 더하기 %d는 %d입니다",123,456,789);
		String str2 =String.format("%d 더하기 %d는 %d입니다",3,5,3+5);
		System.out.print(str);
		System.out.print(str2);
		
		String str3 = String.format("%7.2f", 3.1234567);
		System.out.println(str3);
	}

}
