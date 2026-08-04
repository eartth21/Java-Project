package com.mnu.exam01;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*	키보드로 학생정보를 입력 학생 객체를 생성 List에 저장 후
 * 	총점, 평균, 학점을 구하여 출력
 * 	[입력형식]
 *	학생 정보 입력: 1101 이학생 90 80 70
 *	[출력형식]
 *	번호		이름		국어		영어		수학		총점		평균		학점
 *	1101 	이학생	90		80		70		240		80 		B
 *	[처리조건]
 *	3명 입력, 동일한 번호가 있는 경우 "이미 등록된 학생입니다 " 출력 후 재입력
 */
public class Exam_10 {

	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(new File("src/student.txt"));
		List<Student> sList = new ArrayList();
		//파일 입력 후 출력 테스트
		while(scn.hasNextLine()) {
			//String data = scn.nextLine();
			//System.out.println(data);
			String data[] = scn.nextLine().split(",");
			for(int i=0;i<3;i++) {
				Student s1 = new Student();
					
				System.out.print("정보 입력: ");
				s1.setBun(Integer.parseInt(data[0]));
				s1.setName(data[1]);
				s1.setKor(Integer.parseInt(data[2]));
				s1.setEng(Integer.parseInt(data[3]));
				s1.setMat(Integer.parseInt(data[4]));
				
				//학번 중복 검사 
				boolean bool=false;//스위치 역할
				for(int x=0;x<sList.size();x++) {
					if(s1.getBun()==sList.get(x).getBun()) {
						System.out.println(s1.getBun()+"는 이미 등록된 번호입니다.");
						bool = true;//중복
						break;
					}
				}
				if(bool) {
					continue;
				}
					
				int tot = s1.getKor()+s1.getEng()+s1.getMat();
				double ave = (double)tot/3.;
				String grade=null;
				
				switch((int)ave/10) {
					case 10:
					case 9:
						grade= "A";
						break;
					case 8: 
						grade= "B";
						break;
					case 7: 
						grade = "C";
						break;
					case 6: 
						grade = "D";
						break;
					default : 
						grade = "F";
						break;
				}
				//default 생성자밖에 없을때				
				sList.add(s1);
				
				
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
				System.out.println(s1.getBun()+"\t"+s1.getName()+"\t"+s1.getKor()+"\t"
				+s1.getEng()+"\t"+s1.getMat()+"\t"+tot+"\t"+ave+"\t"+grade);

		}
		
		}}}


