package com.mnu.exam01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//Set 인터페이스 구현 클래스 HashSet
public class Exam_02 {
	public static void main(String[] args) {

		Set set = new HashSet();
		
		set.add("이사람");//중복되면 사라짐
		set.add("김사람");
		set.add("박사람");
		set.add("정사람");
		set.add("이사람");//중복 발생
		
		System.out.println("객체 확인: "+set);
		
		//1. 확장 for()
		for(Object obj: set) {
			System.out.print(obj+" ");
		}
		System.out.println();
		
		//2. 반복자 Iterator
		Iterator iter = set.iterator();//반복자로 변환
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		//3.ArrayList 변환 후 출력
		List list = new ArrayList(set);
		for(int x=0;x<list.size();x++) {
			Object ob = list.get(x);//list 지네릭타입 지정안하면 object로 지정
			System.out.print(ob+"\t");
	
		 }
		
	}

}
