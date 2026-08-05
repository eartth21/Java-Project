package com.mnu.exam01.main;

import java.util.Scanner;

import com.mnu.exam01.model.MemberDAO;
import com.mnu.exam01.model.MemberDTO;

//tbl_member 테이블에 새로운 회원등록
//회원번호는 자동증가 이용
public class Exam_02 {

	public static void main(String[] args) {
		MemberDAO dao = MemberDAO.getinstance();
		MemberDTO dto = new MemberDTO();
		
		
		Scanner scn = new Scanner(System.in);
		System.out.print("회원이름: ");
		dto.setCustname(scn.next());
		System.out.print("전화번호: ");
		dto.setPhone(scn.next());
		System.out.print("성별: ");
		dto.setGender(scn.next().toUpperCase());
		System.out.print("고객등급: ");
		dto.setGrade(scn.next().toUpperCase());
		System.out.print("거주도시: ");
		dto.setCity(scn.next());
		
		//등록메소드 호출
		int row = dao.memberWriteSeq(dto);
		if(row==1) {
			System.out.println("회원 등록 성공");
		}else {
			System.out.println("회원 등록 실패");
		}
		


	}

}
