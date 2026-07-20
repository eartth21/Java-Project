
public class Exam_06 {
	BB b = new BB();//멤버
	public static void main(String[] args) {
		BB b2 = new BB();
		b2.bun=1;
		b2.name="하비비";
		b2.score=100;
		b2.bbPrint();
		
		if(b2.score>=90) {
			System.out.print("합격");
		}
		
	}

}
