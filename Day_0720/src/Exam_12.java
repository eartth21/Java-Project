//학생 성적처리(번호-정수, 이름-문자, 국어-정수, 영어, 수학, 총점, 평균-실수)데이터 타입 다양 배열처리 불가
//번호이름점수 생성자 처리 생성자에서 총점, 평균 계산
class Hakseng{
	int bun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;

	Hakseng(){}
	
	Hakseng(int bun, String name, int kor, int eng, int mat){
		this.bun=bun;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		//totAve();
		//haksengPrint();
				
	}
	//총점, 평균을 계산하는 메소드
	void totAve(){
		tot= kor+eng+mat;
		ave = tot/3.;
		}
	//출력메소드
	void haksengPrint() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.print(bun+"\t");
		System.out.print(name+"\t");
		System.out.print(kor+"\t");
		System.out.print(eng+"\t");
		System.out.print(mat+"\t");
		System.out.print(tot+"\t");
		System.out.printf("%.2f",ave);
		
	}
}
public class Exam_12 {

	public static void main(String[] args) {
		
		Hakseng h1 = new Hakseng();
		h1.bun=1101;
		h1.name="dada";
		h1.kor=90;
		h1.eng=88;
		h1.mat=85;
		h1.totAve();
		h1.haksengPrint();

		System.out.println();
		
		Hakseng h2 = new Hakseng(1201,"nana",100,95,90);
		h2.totAve();
		h2.haksengPrint();
		
	}

}
