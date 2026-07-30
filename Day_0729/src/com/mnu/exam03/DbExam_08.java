package com.mnu.exam03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mnu.util.DBManager;

public class DbExam_08 {
	public static void main(String[] args) {
		
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner scn= new Scanner(System.in);
		System.out.print("입력: ");
		int eno=scn.nextInt();

		
		
		String sql="update emp set salary=salary*1.1 where eno=? ";
		
		try {
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, eno);
			
			int row = pstmt.executeUpdate();
			System.out.println("수정한 로우: "+row);

			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		
	}

}
