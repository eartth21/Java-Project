package com.mnu.exam03;

import java.util.Scanner;

public class Test_03 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("자료 입력: ");
		String mem[]=scn.nextLine().split(",");
		
		String gender="";
		int age=0;
		
		//String index=mem[1].substring(7);
		int cnt=mem[1].indexOf('-');
		String index=mem[1].charAt(cnt+1)+"";
		
		String year=mem[1].substring(0,2);
	
		if("1256".contains(index)) {
			age=2026-(1900+Integer.parseInt(year));
			if("15".contains(index)) {
				gender="남";
			}else {
				gender="여";
			}
		}else if("3478".contains(index)){
			age=2026-(2000+Integer.parseInt(year));
			if("37".contains(index)) {
				gender="남";
			}else {
				gender="여";
			}
		}
	
		System.out.print("이름\t전화\t성별\t나이\n");
		System.out.print(mem[0]+"\t"+mem[2]+"\t"+gender+"\t"+age);
		
	
	
	}
	
	

}
