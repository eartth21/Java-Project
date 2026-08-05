package com.mnu.exam01.main;

import java.util.Scanner;

import com.mnu.exam01.model.MemberDAO;
import com.mnu.exam01.model.MemberDTO;

public class Exam_07 {
//회원번호 입력 회원정보 삭제
	public static void main(String[] args) {

		MemberDAO dao = MemberDAO.getinstance();
		MemberDTO dto = new MemberDTO();
		
		Scanner scn = new Scanner(System.in);
		System.out.print("회원번호 입력: ");
		
		int custno = scn.nextInt();
		dto.setCustno(custno);
		
		int row=dao.memberDelete(dto);
		if(row==1) {
			System.out.println("회원 삭제 성공");
		}else {
			System.out.println("회원 삭제 실패");
		}

		
		
		
		
	}

}
