//a가 90이상 'A', 80이상 'B', 70이상'C', 60이상'D',
public class Exam_11 {
	public static void main(String[] args) {

		int a =77;
		String grade ="";
		
		switch(a/10) {
			case 10:
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade = "f";
		}
	
		System.out.print("학점은"+grade);
		
		
		
	}

}
