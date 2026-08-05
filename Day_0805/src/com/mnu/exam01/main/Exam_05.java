package com.mnu.exam01.main;

import java.util.List;
import java.util.Scanner;

import com.mnu.exam01.model.MemberDAO;
import com.mnu.exam01.model.MemberDTO;

public class Exam_05 {

	public static void main(String[] args) {

		
		Scanner scn = new Scanner(System.in);
		System.out.println("이름: ");
		String name = scn.next();
		
		MemberDAO dao = MemberDAO.getinstance();
		
		List <MemberDTO> list = dao.memberListName(name);
		System.out.println("회원번호\t이름\t연락처\t성별\t가입일자\t고객등급\t거주도시");
		if(list.size()==0) {
			System.out.println("등록된 회원이 없습니다.");
		}else {
			for(MemberDTO dto : list) {
				String genStr;
				if(dto.getGender().equals("M")) {
					genStr="남성";
				}else {
					genStr="여성";
				}
				
				String gradeStr;
				if(dto.getGrade().equals("A")) {
					gradeStr="VIP";
				}else if(dto.getGrade().equals("B")) {
					gradeStr="일반";
				}else {
					gradeStr="직원";
				}
								
				System.out.print(dto.getCustno()+"\t");
				System.out.print(dto.getCustname()+"\t");
				System.out.print(dto.getPhone()+"\t");
				System.out.print(genStr+"\t");
				System.out.print(dto.getJoindate()+"\t");
				System.out.print(gradeStr+"\t");
				System.out.print(dto.getCityname()+"\n");

			}
		}

			
		

		
	}

}
