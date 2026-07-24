package com.mnu.exam02;
//switch case break 유무 확인문제!
public class Exam_11 {

	public static void main(String[] args) {
		int i=3, k=1;
		switch(i) {
		case 1: k++;
		case 2: k+=3;
		case 3: k=0;//0
		case 4: k+=3;//3
		case 5: k -= 10;//-7
		dafault: k--;//-8
		
		}
		System.out.print(k);
		
		
		
		
	}

}
