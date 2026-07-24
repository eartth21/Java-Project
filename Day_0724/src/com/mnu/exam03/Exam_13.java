package com.mnu.exam03;
//반복문(for(), while(), do~while(조건식이 거짓이더라도 한번은 작동함))
public class Exam_13 {
	public static void main(String[] args) {
		//피보나치수열
		int a,b,c,sum;
		a=b=1;
		sum=a+b;
		
		for(int i=3;i<=5;i++) {
			c=a+b;//2,3,5
			sum+=c;//4,7,12
			a=b;//1,2,3
			b=c;//2,3,5
		}
		System.out.println(sum);
		
		
		
	}

}
