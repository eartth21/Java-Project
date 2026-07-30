package com.mnu.exam03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mnu.util.DBManager;

public class DBExam_09 {

	public static void main(String[] args) {
		//키보드로 부서번호 입력
		Scanner scn = new Scanner(System.in);
		System.out.print("사번입력: ");
		int eno =scn.nextInt();

		Connection conn=null;
		PreparedStatement pstmt =null;
		ResultSet rs= null;
		
		String sql="delete from emp where eno=?";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, eno);

			int row = pstmt.executeUpdate();//insert,update,delete
			//row 값으로 결과 확인하기 위해 변수 설정
			System.out.println("삭제된 로우: "+row);
			
						
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		
	}

}
