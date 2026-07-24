package com.mnu.sawon2;

public class SawonDAO {
	//싱글톤패턴
	private SawonDAO() {}
	//자신의 객체를 자신이 생성
	private static SawonDAO instance = new SawonDAO();
	public static SawonDAO getInstance() {
		return instance;
	}
	//객체 생성 후 반환 메소드
	public Sawon getSawon(int sabun, String name , int gender, int grade, int time) {
		//Sawon sawon = new Sawon();
		SawonDTO sawon = new SawonDTO(sabun,name,gender,grade,time);
				return Sawon;
	}
	
	//성별을 구하여 반환하는 메소드

	//주간급여를 계산 후 반환하는 메소드
	public void weekPayProcess(SawonDTO sa) {
		setWeekPay(sa);
		setGender(sa);		
		
		int pay=0;//주간급여
		int overTime=0;//초과근무시간
		int baseTime=sa.getTime();//
		
		if(baseTime>50)
			baseTime=50;//최대근무시간 50시간
		//초과근무시간계산
		if(baseTime>36) { 
			overTime = baseTime-36;
			baseTime = 36;
		}
		pay=baseTime*sa.getWeekPay() + (int)(overTime*sa.getWeekPay()*1.5);
	
	}
	
	private void setWeekPay(SawonDTO sa) {
		sa.setWeekPay(2000);
		if(sa.getGrade()==1)
			sa.setWeekPay(10000);
		else if(sa.getGrade()==2)
			sa.setWeekPay(5000);
	}
	
	private void setGender(SawonDTO sa) {
		sa.setGenderStr("여자");
		if(sa.getGender()==1||sa.getGender()==3)
			sa.setGenderStr("남자");
	}
	
}
