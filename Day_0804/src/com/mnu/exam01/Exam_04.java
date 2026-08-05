package com.mnu.exam01;

import java.util.HashSet;
import java.util.Set;

public class Exam_04 {

	public static void main(String[] args) {
		Set<DeptDTO> set = new HashSet();
		
		set.add(new DeptDTO(10,"AAA","A001"));
		set.add(new DeptDTO(20,"BBB","B001"));
		set.add(new DeptDTO(10,"AAA","A001"));
		set.add(new DeptDTO(30,"CCC","C001"));
		
		System.out.print("객체 수: "+set.size());//사용자가 만든 건 중복체크 안됨
		
	}

}
