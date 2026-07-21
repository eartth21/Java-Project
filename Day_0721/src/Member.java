
public class Member {
	//멤버변수 이름,아이디,비밀번호,연락처 필수 입력 - 객체 생성
	String name;
	String id;
	String pass;
	String phone;
	

	public Member() {}
	
	public Member(String name, String id, String pass, String phone) {
		this.name=name;
		this.id=id;
		this.pass=pass;
		this.phone=phone;
		
	}
	
	//회원가입
	boolean memberRegister() {
		if(name!=null&&id!=null&&pass!=null&&phone!=null) {
			return true;
		}else
			return false;
	}
	
	//로그인
	boolean memberLogin() {
		if(id.equals("user")&&pass.equals("1234")) {
			return true;
		}else
			return false;
	}
	
	
	//로그아웃
	String memberLogout() { //이름,아이디,비밀번호,연락처 삭제
		return "로그아웃 되었습니다.";
	}
	
	
}
