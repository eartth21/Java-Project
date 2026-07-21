//로그인 로그아웃 구현
public class Exam_02 {

	public static void main(String[] args) {

		Member m2 = new Member("이사람","user","1234","010-1111-2222");

		//키보드입력(가정)
		String id="user";
		String pass="4321";
		
		boolean bool = m2.memberLogin();
		if(bool) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("아이디 또는 비밀번호 오류");
		}
		
		//로그아웃
		if(bool) {
			String str = m2.memberLogout();
			System.out.println(str);
			}
		
		/*
		bool = m2.memberlogin();
		if(bool){
		
		}else {
			
		}
		*/
		
		
	}

}
