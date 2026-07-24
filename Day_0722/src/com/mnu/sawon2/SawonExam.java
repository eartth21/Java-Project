package com.mnu.sawon2;

import java.util.Scanner;

public class SawonExam {

	public static void main(String[] args) {
		//키보드 입력(사원정보)
		Scanner scn = new Scanner(System.in);
		System.out.print("사원등록: ");
		int sabun=scn.nextInt();
		String name=scn.next();
		int gender=scn.nextInt();
		int grade=scn.nextInt();
		int time = scn.nextInt();
		
		SawonDAO dao = SawonDAO.getInstance();
		//1.사원 객체 생성
		SawonDTO sawon = dao.getSawon(sabun, name, gender, grade, time);
		
		dao.weekPayProcess(sawon);
		
	
		System.out.println("사원번호\t이름\t성별\t등급\t근무\t시간\t주간급여");
		System.out.print(sawon.getSabun()+"\t");
		System.out.print(sawon.getName()+"\t");
		System.out.print(sawon.getGenderStr()+"\t");
		System.out.print(sawon.getGrade()+"\t");
		System.out.print(sawon.getWeekPay()+"\t");
		System.out.print(sawon.getTime()+"\t");
		System.out.print(sawon.getWeekMoney()+"\t");

	}

}
