//while() vs do~while()
public class Exam_14 {

	public static void main(String[] args) {

		int a=0, b=0;
		
		while(a>5) {
			a++;
			System.out.println(a);
		} //거짓 - 동작안
		
		do {
			b++;
			System.out.println(b);
		}while(b>5); //거짓 - 첫 조건 동작
		
	
		
	}

}
