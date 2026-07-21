package AAA;

public class Exam_11 {

	public static void main(String[] args) {
		Student stu1= new Student();
		
		int hak=1101;
		String name="홍";
		boolean gender=false;
		int age=22;
		int kor=90;
		int eng=80;
		int mat=70;
		
		//초기화
		stu1.setHak(hak);
		stu1.setName(name);
		stu1.setGender(gender);
		stu1.setAge(age);
		stu1.setKor(kor);
		stu1.setEng(eng);
		stu1.setMat(mat);
		
		Student stu2=new Student(1102,"이사람",true,30,77,88,99);

		int tot = stu1.getKor()+stu1.getEng()+stu1.getMat();
		double ave = tot/3.;

		
		//출력
		System.out.print("학번\t이름\t성별\t나이\t국어\t영어\t수학\t총점\t평균\n");
		String genderStr;
		if (stu1.isGender()){
			genderStr = "woman";
		}else {
			genderStr = "man";
		}
		System.out.println(stu1.getHak()+"\t"+stu1.getName()+"\t"+genderStr+"\t"+stu1.getAge()+"\t"+stu1.getKor()+"\t"+stu1.getEng()+"\t"
		+stu1.getMat()+"\t"+tot+"\t"+ave);
		//학번 이름 성별 나이 국어 영어 수학 총점 평균
		
		int tot2 = stu2.getKor()+stu2.getEng()+stu2.getMat();
		double ave2 = tot2/3.;

		
		//출력
		System.out.print("학번\t이름\t성별\t나이\t국어\t영어\t수학\t총점\t평균\n");
	
		if (stu2.isGender()){
			genderStr = "woman";
		}else {
			genderStr = "man";
		}
		System.out.println(stu2.getHak()+"\t"+stu2.getName()+"\t"+genderStr+"\t"+stu2.getAge()+"\t"+stu2.getKor()+"\t"+stu2.getEng()+"\t"
		+stu2.getMat()+"\t"+tot2+"\t"+ave2);
		//학번 이름 성별 나이 국어 영어 수학 총점 평균
		
	}

}
