package com.mnu.exam01;

public class Person {
 
	String name;
	int age;
	boolean gender;
	Person(String name, int age, boolean gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		String genderStr="여자";
		if(gender)
			genderStr="남자";//boolean값 참이면 남자, 아니면 여자
		return name+","+age+","+genderStr;
	}
}


