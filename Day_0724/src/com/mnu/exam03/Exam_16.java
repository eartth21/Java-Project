package com.mnu.exam03;

public class Exam_16 {

	public static void main(String[] args) {

		int a=0, sum =0;
		while(a<10) {
			a++;//1,2,3,4,5...10
			if(a%2==1)
				continue;//조건문으로 이동
			sum+=a;//2+4+6+8+9+10
		}
		System.out.print(sum);
	}

}
