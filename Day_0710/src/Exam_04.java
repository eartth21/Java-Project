import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("점수 입력: ");
		
		int score = scn.nextInt();
		String grade="";
		
		if(score>=90) {
			grade = "A";
		}else if(score>=80){
			grade ="B";
		}else if(score>=70) {
			grade="C";
		}else if(score>=60) {
			grade="D";
		}else {
			grade="F";
		}
		System.out.println(score+"점\n학점은 '"+grade+"' 입니다.");
		
		
	}

}
