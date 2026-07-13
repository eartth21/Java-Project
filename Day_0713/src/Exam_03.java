import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		System.out.print("이름, 국어, 영어, 수학 점수를 입력하시오.");
		String nam=scn.next();
		int kor=scn.nextInt();
		int eng=scn.nextInt();
		int mat=scn.nextInt();
		int tot=kor+eng+mat;
		int ave= tot/3;
		String result="";
		String reason="";

		/*
		if(ave>=60) {
			if(kor>=40&&eng>=40&&mat>=40) {
				result="합격";
	
			}else {
				result="불합격\n사유: 과락";
			}
		}else {
			result="불합격\n사유: 평균미만";
		}
		*/
		
		if(kor>=40&&eng>=40&&mat>=40&&ave>=60) {
			result = "합격";
		}else {
			result = "불합격";
			if(kor<=40 || eng<=40 || mat<=40) {
				reason="과락";
			}else {
				reason="평균미만";
			}
		}
		
		System.out.println("이름: "+nam);
		System.out.println("총점: "+tot);
		System.out.println("평균: "+ave);
		System.out.println("판정: "+result);
		
		if(result.equals("불합격")) {
			System.out.print("판정: "+reason);
		}

		
		
		
	}

}
