import java.util.Scanner;
//2,8,16진수 변환
public class Exam_02 {

	public static void main(String[] args) {

		Scanner scn =new Scanner(System.in);
		
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
				switch(na) {
					case 15:
						str="F";
						break;
					case 14:
						str="E";
						break;
					case 13:
						str="D";
						break;
					case 12:
						str="C";
						break;
					case 11:
						str="B";
						break;
					case 10:
						str="A";
						break;
					default: 
						str=na+str;
					}	
				imsi=imsi/con;				
			}
			//출력num
			System.out.println("10진수: "+num);
			System.out.println(con+"진수: "+str);
		
		}
		
	
		
		
		
		
	}

}
