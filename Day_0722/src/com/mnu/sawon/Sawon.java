package com.mnu.sawon;

public class Sawon {
	private int sabun;
	private String name;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	private int gender;
	private int grade;
	private int time;
	
	public Sawon(){}
	public Sawon(int sabun,String name,int gender, int grade, int time) {
		this.sabun = sabun;
		this.name=name;
		this.gender=gender;
		this.grade = grade;
		this.time=time;
	}
	
}
