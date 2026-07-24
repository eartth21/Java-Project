package com.mnu.sawon;

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
		Sawon sawon = dao.getSawon(sabun, name, gender, grade, time);
		
		//주간급여(1.등급에 따른 시급)
		int weekPay = 2000;
		if(sawon.getGrade()==1)
			weekPay = 10000;
		else if(sawon.getGrade()==2)
			weekPay=5000;
		
		int weekMoney = dao.weekPayProcess(sawon,weekPay);//주간급여 계산하는 메소드 생성
		
	
	
		//성별 계산 후 출력
		System.out.println("사원번호\t이름\t성별\t등급\t근무\t시간\t주간급여");
		String genderStr="여자";
		if(sawon.getGender()==1 ||sawon.getGender()==3)
			genderStr="남자";
		System.out.print(sawon.getSabun()+"\t");
		System.out.print(sawon.getName()+"\t");
		System.out.print(genderStr+"\t");
		System.out.print(sawon.getGrade()+"\t");
		System.out.print(weekPay+"\t");
		System.out.print(sawon.getTime()+"\t");
		System.out.print(weekMoney+"\t");

	}

}
