//키보드로 정수를 입력 받아서 80이상"Pass", 아니면"No"출력
import java.util.Scanner;


public class Exam_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scn = new Scanner(System.in);
		System.out.print("입력: ");
		
		int A = scn.nextInt();
		String str="";
		
		if(A>=80) {
			str = "Pass";
		}else {
			str = "No";
		}
		System.out.println(A+"= "+str);
		
		//조건연산자
		String pass=(A>=80)?"Pass":"No";
		System.out.println(A+": "+pass);
		
	}

}
