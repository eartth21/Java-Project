package com.mnu.exam01;

import java.util.ArrayList;
import java.util.List;

public class Exam_05 {
	public static void main(String[] args) {
		List<Person> pList = new ArrayList();
		
		//키보드 입력사항
		String n = "김사람";
		int a=30;
		boolean b=false;
		Person p1 =new Person(n,a,b);
		
		//pList에 p1 저장
		pList.add(p1);
		p1 = new Person("이사람",20,true);
		pList.add(p1);
		
		pList.add(new Person("저사람",25,true));
		
		System.out.println("전체사원: "+pList);//toString안쓰면 참조변수 주소값 찍힘
		System.out.println("이름\t나이\t성별");
		
		for(Person i : pList) {
			System.out.print(i.name+"\t");
			System.out.print(i.age+"\t");
			//System.out.print(i.gender+"\t");
			if(i.gender)
				System.out.print("남자\n");
			else
				System.out.print("여자\n");
		}
		//System.out.println(p1);
		//System.out.print(p1.name+","+p1.age+","+p1.gender);
	
	
	
	
	}

}
