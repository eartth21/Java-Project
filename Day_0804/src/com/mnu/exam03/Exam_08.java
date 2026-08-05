package com.mnu.exam03;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

//Stack(LIFO)
public class Exam_08 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack();		
		Deque<Integer> stack2 = new ArrayDeque();
		
		//삽입
		stack.push(123);
		stack.push(456);
		stack.push(789);
		stack.push(012); //첫글자 0으로 시작하면 8진수로 인식 출력결과-10
		
		System.out.println("전쳬: "+stack);
		System.out.println("객체 수: "+stack.size());
		System.out.println("마지막 입력 객체: "+stack.peek());
		//System.out.println("마지막 객체 꺼내기: "+stack.pop());
		//System.out.println("객체 수: "+stack.size());
	
		//확장 for 소거 안됨 - 확인용
		for(Integer data : stack) {
			System.out.println(data);
		}
		System.out.println("객체 수: "+stack.size());
		
		//정석 출력
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.println("객체 수: "+stack.size());

	}

}
