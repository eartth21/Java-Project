package com.mnu.exam02;

import java.util.Scanner;

import com.mnu.model.GoodsDAO;
import com.mnu.model.GoodsDTO;

public class GoodsWrite {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("상품 번호: ");
		String pcode=scn.next();
		System.out.print("상품 이름: ");
		String pname=scn.next();
		System.out.print("상품 가격: ");
		int pcost=scn.nextInt();
		System.out.print("재고 수량: ");
		int stock=scn.nextInt();
		
		GoodsDAO dao = GoodsDAO.getInstance();
		GoodsDTO dto = new GoodsDTO();
		dto.setPcode(pcode);
		dto.setPname(pname);
		dto.setPcost(pcost);
		dto.setStock(stock);
		
		int row = dao.goodsIp(dto);
		if(row==1) {
			System.out.print("상품등록성공");
		}else {
			System.out.print("상품등록실패");
			
		}
		
		
		
		
	}

}
