//회원가입, 로그인, 로그아웃
//회원정보(이름,아이디,비번,연락처)
//로그인: 아이디,비번
public class Exam_01 {

	public static void main(String[] args) {

		Member m1 = new Member();
		boolean bool = m1.memberRegister();
		if(bool) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");		
		}
		
		m1.name="저사람";
		m1.id="abcd";
		m1.pass="1234";
		m1.phone="010-1234-1234";
		bool = m1.memberRegister();
		
		if(bool) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");			
		}
		
		Member m2 = new Member("이사람","user","1234","010-1111-2222");
		bool = m2.memberRegister();
		if(bool) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");
		}

		
	}

}
