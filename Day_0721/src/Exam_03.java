//키보드로 학번, 이름, 국어, 영어, 수학 입력
/*학생객체(Student) 생성후 출력
 * 
 */
import java.util.Scanner;
public class Exam_03 {

	public static void main(String[] args) {
		//키보드 입력(학생 객체 생성)
		Scanner scn = new Scanner(System.in);
		System.out.print("학번, 이름, 국어, 영어, 수학 점수 입력");
		int hakbun=scn.nextInt();
		String name=scn.next();
		int kor =scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		
		Student s1=new Student(hakbun,name,kor,eng,mat);
		s1.totAve();

		
		//총점,평균을 구하여 nextInt()과 같이 출력
		//학번 이름  국어 영어 수학 총점 평균
		System.out.println("학번\t이름\t국어\t 영어\t수학\t평균");
		System.out.print(s1.hakbun+"\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+s1.ave+"\t");
		System.out.print(s1.tot+"\n");
		//학점을 구하여 출력(A,B,C,D,F)
		//학번 이름  국어 영어 수학 총점 평균
		String grade =s1.studentGrade();
		System.out.println("학번\t이름\t국어\t 영어\t수학\t평균\t학점");
		System.out.print(s1.hakbun+"\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+s1.ave+"\t");
		System.out.print(grade+"\n");
}

}
