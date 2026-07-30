package com.mnu.exam02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mnu.util.DBManager;

public class DBExam_03 {

	public static void main(String[] args) {
		//키보드로 부서번호 입력
		int dno =50;
		String dname = "인사";
		String loc = "목포";
		Connection conn=null;
		PreparedStatement pstmt =null;
		ResultSet rs= null;
		
		String sql="insert into DEPT(DNO,DNAME,LOC) values(?,?,?)";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			
			int row = pstmt.executeUpdate();//insert,update,delete
			//row 값으로 결과 확인하기 위해 변수 설정
			System.out.println("등록한 로우: "+row);
			
						
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		
	}

}
