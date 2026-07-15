import java.util.Scanner;

public class Exam_03 {
//2,8,16진수 변환 - 배열
	public static void main(String[] args) {
		
		Scanner scn =new Scanner(System.in);
		//나머지값을 모두 저장
		char ch[]= {'0','1','2','3','4','5','6','7','8','9',
					'A','B','C','D','E','F'};//switch case 대체
		
		while(true) {
			System.out.print("10진수를 입력하세요");
			int num=scn.nextInt();
			if(num==0) {
				System.out.print("프로그램을 종료합니다.");
				break;
			}
			System.out.print("변환할 진수(2,8,16): ");
			int con = scn.nextInt();
			String str="";
			int imsi=num;//변환값
			
			while(imsi!=0) {
				int na=imsi%con;
				str=ch[na]+str;
				imsi=imsi/con;			
			}
		
		
			//출력num
			System.out.println("10진수: "+num);
			System.out.println(con+"진수: "+str);
		
		
		
		}
		
	
		
		
		
		
	}

}
