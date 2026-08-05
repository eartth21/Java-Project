package com.mnu.exam04.exam;

import java.util.List;
import java.util.Scanner;

import com.mnu.exam04.model.CommDTO;
import com.mnu.exam04.model.EmpDAO;
import com.mnu.exam04.model.EmpDTO;

public class Exam_03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("이름 1문자입력");
		String name = scn.next().toUpperCase();
		
		EmpDAO dao = EmpDAO.getInstance();
		List<EmpDTO> list = dao.nameList(name);
		
		System.out.print("사원번호\t이름\t입사일\t급여\t부서번호\t부서명\n");
		
		for(EmpDTO dto: list) {
			System.out.print(dto.getEno()+"\t");
			System.out.print(dto.getEname()+"\t");
			System.out.print(dto.getJob()+"\t");
			System.out.print(dto.getManager()+"\t");
			System.out.print(dto.getHiredate()+"\t");
			System.out.print(dto.getSalary()+"\t");
			System.out.print(dto.getDno()+"\n");
		}
	}

}
