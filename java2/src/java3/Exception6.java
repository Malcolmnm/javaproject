package java3;

public class Exception6 {
//아이디 중복체크 발생 확인하는 예시
	
//error : 값이 없을경우, no : 아이디 중복발생, yes : 사용가능한 아이디
	public static void main(String[] args) {
		idcheck id = new idcheck();
		try { //AJAX로 Front-end에게 아이디값 받는 사항
			String callsign = id.id_result(""); //AJAX로 아이디 받는 사항
			System.out.println(callsign);
		}
		catch (Exception e) { //idcheck 클래스에서 오류가 발생하였을 경우
			if(e.getMessage() != null) {
				System.out.println(e); //메세지 출력
			}
		}

	}
}
class idcheck{
	//아이디 중복 검토 확인
	public String id_result(String mid) throws Exception{
		String call=""; //Front-end에게 출력해주는 메세지 변수
		if(mid==null || mid.equals("")) { //아이디가 비어있을 경우
			throw new Exception("error"); //예외처리 발생
		}
		else { //Front-end가 아이디를 정상적으로 발송 하였을 경우
			if(mid.equals("hong")) { //동일한 아이디가 있을 경우
				call = "no";
			}
			else { //동일한 아이디가 없을 경우
				call = "yes";
			}
		}
		return call; //최종 결과값
	}
}