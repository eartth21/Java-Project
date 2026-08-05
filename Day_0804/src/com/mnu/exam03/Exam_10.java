package com.mnu.exam03;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

//학생 객체를 생성
//스택에 저장후 출력
public class Exam_10 {

	public static void main(String[] args) {
/*		
		Student stu = new Student();
		stu.setBun(1);
		stu.setName("김학생");
		stu.setKor(100);
		stu.setEng(90);
		stu.setMat(80);
		
		Stack<Student> stack = new Stack();
		stack.push(stu);
		
		System.out.print("번호\t이름\t국어\t영어\t수학");
		while(!stack.isEmpty()) {
			Student a = stack.pop();
			System.out.print("꺼낸 객체: "+a);
			System.out.print("스택 객체 수: "+stack.size());
		}
*/		
		Deque<Student> student = new ArrayDeque<Student>();
		student.push(new Student(1,"김학생",90,100,80));
		student.push(new Student(2,"모학생",91,99,84));
		student.push(new Student(3,"장학생",88,79,85));
		student.push(new Student(4,"박학생",94,80,78));
		student.push(new Student(5,"이학생",93,99,86));
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
	
		while(!student.isEmpty()) {
			Student st = student.pop();
			System.out.print(st.getBun()+"\t");
			System.out.print(st.getName()+"\t");
			System.out.print(st.getKor()+"\t");			
			System.out.print(st.getEng()+"\t");
			System.out.print(st.getMat()+"\t");
			System.out.print(st.tot()+"\t");
			System.out.printf("%.2f\n",st.ave());
		}
	
	
	
	
	}
	
	
	
	

}
