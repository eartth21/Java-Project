package com.mnu.oracle;
import java.sql.*;
public class OracleExam_02 {
	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt =null;
		ResultSet rs = null;
		
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			//2. 커넥션 연결
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##test", "1234");
			//3. 명령문 수행
			stmt = conn.createStatement();
			rs=stmt.executeQuery("select eno, ename, hiredate, salary from emp");
			//4. 출력
			while(rs.next()) {
				System.out.print(rs.getInt("eno")+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString("hiredate")+"\t");
				System.out.print(rs.getInt("salary")+"\n");
			}

		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
			
		
		
	}

}
