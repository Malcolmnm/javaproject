package java2;

public class Method4 {
	//private에 대한 객체 선언 형태2
	public static void main(String[] args) {
		insert i = new insert();
		i.userid = "hong";
		String member_key = "123456";
		String msg = i.checks(member_key); //인자값을 class안으로 보냄
		if(msg.equals("ok")) {
			System.out.println("정상적인 접근");
		}
		else {
			System.out.println("올바른 접근이 아닙니다.");
		}
	}
}

class insert{
	String userid = null;
	private String key = "memberok"; //내부 변수로 값을 변경 못함
	
	public String checks(String userkey) { //main에서 인자값을 보낸 보안키
		String call = null;
		if(userkey.equals(key)) { //내부 변수값과 인자값을 비교 같을경우
			call = "ok";
		}
		else {
			call = "error";
		}
		return call; //return으로 값 이관
	}
}