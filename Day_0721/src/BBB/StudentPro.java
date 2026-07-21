package BBB;
//싱글톤 만들기
public class StudentPro {
	private StudentPro() {}
	
	public static StudentPro pro = new StudentPro();
	
	public static StudentPro getInstance() {
		return pro;
	}
	
	//필요한 메소드 정의
	//1. student 객체를 생성 후 반환하는 메소드
	public Student getStudent(int hak,String name,boolean gender,int age,int kor,int eng,int mat) {//매개변수
		Student student = new Student(hak,name,gender,age,kor,eng,mat);//학생 객체 생성
		return student;//student값 반환
	}

	//2. 총점 평균 출력하는 메소드
	public void studentOutput(Student st1) {
		System.out.print("학번\t이름\t성별\t나이\t국어\t영어\t수학\t총점\t평균\n");
		int tot = st1.getKor()+st1.getEng()+st1.getMat();
		double ave = tot/3.;
		String genderStr;
		if (st1.isGender()){
			genderStr = "woman";
		}else {
			genderStr = "man";
		}
		
		System.out.println(st1.getHak()+"\t"+st1.getName()+"\t"+genderStr+"\t"+st1.getAge()+"\t"+st1.getKor()+"\t"+st1.getEng()+"\t"
		+st1.getMat()+"\t"+tot+"\t"+ave);
		
	}
}
