//반올림
public class Exam_06 {

	public static void main(String[] args) {
		
		double a = 3.14567; //3.15
		//1. (3.14567 *100) => 314.567 + 0.5 => 315.067
		//	 int(315.067) = 315, (315/100 = 3) 315/100.= 3.15
		
		a = (int)(a*100+0.5)/100.;
		System.out.println("a= "+a);
		
		double aa = 3.14567; //3.15
		System.out.println("aa= "+String.format("%f", aa));//aa의 실수값
		System.out.println("aa= "+String.format("%.2f", aa));//aa 실수값 소숫점 둘째자리까지
		System.out.println("aa= "+String.format("%7.2f", aa));//7칸 중 소수점 둘째자리까지-0003.15 
		System.out.println("aa= "+String.format("%7.3f", aa));//cf16

	}

}
