import java.util.Arrays;

class Chejo{
	String name;
	int[] score;
	int max,min;
	
	Chejo(String name,int[]score){
		this.name=name;
		this.score=score;
	}
	//최대 최소
	void maxMin() {
		max=score[0];
		min=score[0];
		for(int i=1;i<score.length;i++) {
			if(max<score[i])
				max=score[i];
			if(min>score[i])
				min=score[i];
		}			
	}
	//출력
	void dataPrint() {
		System.out.println("이름: "+name);
		System.out.println("점수: "+Arrays.toString(score));
		System.out.println("최고점: "+max);
		System.out.println("최저점: "+min);
		
	}
}
public class Exam_14 {

	public static void main(String[] args) {

		Chejo a = new Chejo("김가가",new int[] {9,3,7,4,6,5,8,7});
		a.maxMin();
		a.dataPrint();
		Chejo b = new Chejo("김나나",new int[] {1,2,3,4,5,6,7,8,9});
		b.maxMin();
		b.dataPrint();
		Chejo c = new Chejo("김다다",new int[] {9,8,7,6,5,4,3,2,8});
		c.maxMin();
		c.dataPrint();
	}

}
