package com.mnu.exam01;
//arraylist 메소드 사용법
import java.util.List;
import java.util.ArrayList;

public class Exam_01 {
	public static void main(String[] args) {
		List aList = new ArrayList();//지네릭타입 없을땐 오브젝트로 저장
		//모든타입 저장 가능(객체로 저장)

		//저장확인
		if(aList.isEmpty())//
			System.out.println("List는 비어있음");
		if(aList.size()==0)//
			System.out.println("List는 비어있음");

		//객체 추가
		boolean bool = aList.add(1234);//(Object)1234 저장되면 bool값 참
		if(bool)
			System.out.println("성공");
		else
			System.out.println("실패");
		
		aList.add("Java");
		aList.add(3.14);
		aList.add(false);
		aList.add('A');
		
		//객체수
		int cnt=aList.size();
		System.out.println("List에 저장된 객체 수: "+cnt);
				
		//저장된 객체 확인(객체값XXX)
		System.out.println("List 객체 확인: "+aList);
		
		//n번 객체 꺼내오기
		System.out.println("0번 위치 객체: "+aList.get(0));
		
		//전체 객체 꺼내오기: 기본for문
		for(int i=0;i<aList.size();i++) {
			System.out.print(aList.get(i)+"\t");
		}
		System.out.println();
		
		//전체 객체 꺼내오기: 확장 for문
		for(Object a:aList) {
			System.out.print(a+"\t");
		}
	
	
	}

}
