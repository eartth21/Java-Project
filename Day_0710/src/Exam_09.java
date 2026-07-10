//3개의 정수를 입력받아 최대값,중간값,최소값 찾기
//내림차순 정렬(교환법-새로운 변수 만들어서 값 교환)

import java.util.Scanner;

public class Exam_09 {
	public static void main(String[] args) {


		Scanner scn = new Scanner(System.in);
		System.out.print("4개의 정수 입력: ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int d = scn.nextInt();
		
		//3개의 정수 중 하나라도 1 미만이면 오류처리
		
		if(a<1 || b<1 ||c<1||d<1) {
			System.out.println("입력오류");
			System.exit(1);
		}
		
		System.out.println(a+","+b+","+c+","+d);//기존 a,b,c 값

		
		if(a<b) {
			int imsi =a;
			a=b;
			b=imsi;			
		}
		if(a<c) {
			int imsi=a;
			a=c;
			c=imsi;
		}
		if(a<d) {
			int imsi=a;
			a=d;
			d=imsi;
		}
		if(b<c) {
			int imsi=b;
			b=c;
			c=imsi;
		}
		if(b>d) {
			int imsi=b;
			b=d;
			d=imsi;
		}
		if(c<d) {
			int imsi=b;
			b=d;
			d=imsi;
		}
		
		System.out.println(a+">"+b+">"+c+">"+d);//바뀐 a,b,c 값
		
		
		
	}

}
