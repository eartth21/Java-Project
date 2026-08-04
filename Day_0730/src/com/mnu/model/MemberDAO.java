package com.mnu.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mnu.util.DBManager;

public class MemberDAO {
	//싱글톤 패턴으로 제작
	private MemberDAO() {}
	private static MemberDAO instance= new MemberDAO();	
	public static MemberDAO getInstance() {
		return instance;
	}
	//메소드마다 입력하지 않기위해 클래스에 넣어줌	
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs = null;
	
	//1.등록 메소드 구현(회원가입)
	public int memberWrite(MemberDTO mDTO) {
	//반환값 int - 회원등록 성공시 1, 실패시 0 // memDTO클래스 변수명 mDTO
	//반환타입 정의
		int row=0;
		String sql="insert into tbl_member(custno,custname,phone,gender,grade,city)\n"
				+ "    values(?,?,?,?,?,?)";
		try {
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			//물음표 있을때
			pstmt.setInt(1,mDTO.getCustno());
			pstmt.setString(2,mDTO.getCustname());
			pstmt.setString(3,mDTO.getPhone());
			pstmt.setString(4,mDTO.getGender());
			pstmt.setString(5,mDTO.getGrade());
			pstmt.setString(6,mDTO.getCity());

			row=pstmt.executeUpdate();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);//select 안할땐 rs 안해도됨
		}
		return row;
	}
	//2. 회원 전체 목록 검색 메소드
	public List<MemberDTO> memberList(){
		//반환타입
		List<MemberDTO> mList = new ArrayList();
		//쿼리
		String sql="select custno, custname, phone, gender, grade, cityname, joindate"
			   +"  from tbl_member m join tbl_city c on m.city=c.city";
		try {
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setCustno(rs.getInt("custno"));
				dto.setCustname(rs.getString("custname"));
				dto.setPhone(rs.getString("phone"));
				dto.setGender(rs.getString("gender"));
				dto.setGrade(rs.getString("grade"));
				dto.setCityname(rs.getString("cityname"));
				dto.setJoindate(rs.getString("joindate"));
				mList.add(dto);
			}
					
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return mList;
		
	}
	//회원 정보 검색
	public MemberDTO memberSearch(int custno) {
		MemberDTO dto = new MemberDTO();
		String sql="select * from tbl_member where custno =?";
		try {
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, custno);
			
			rs=pstmt.executeQuery();
			if(rs.next()) {
				dto.setCustno(rs.getInt("custno"));
				dto.setCustname(rs.getString("custname"));
				dto.setPhone(rs.getString("phone"));
				dto.setGender(rs.getString("gender"));
				dto.setGrade(rs.getString("grade"));
				dto.setJoindate(rs.getString("joindate"));
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return dto;
	}
	
	
	
}