package com.mnu.exam03;

public class Tese_01 {

	public static void main(String[] args) {
		String ssn = "910207-1234567";
		String date="990102";//99-01-02 year +"-"+ mon +"-"+ day
		
		//년,월,일 구분
		String year=ssn.substring(0,2);//0번부터 2번전까지"91"
		String mon = ssn.substring(2,4);//"02"
		String day = ssn.substring(4,6);//"07"
		
		//성별1
		int s = ssn.charAt(7)-48;//자동형변환 숫자코드 0-48,1-49,2-50,3-51,4-52
		//성별2
		int ss = Integer.parseInt(ssn.substring(7,8));
		String gender="여자";
		if(ss==1||ss==3)
			gender="남자";
		System.out.println("성별: "+gender);		

		//나이
		
		if(s==1||s==2) {
			int age = 2026 - (1900+Integer.parseInt(year));
			System.out.println("나이: "+age);
		}else {
			int age = 2026 - (2000+Integer.parseInt(year));
			System.out.println("나이: "+age);
		}
		
	}

}
