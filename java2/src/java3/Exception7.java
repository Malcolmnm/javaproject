package java3;

import java.util.LinkedList;

//예외처리로 발생하는 코드 테스트
/*
 응용문제.
 데이터 파일 {"김민수", 55, "김민재", "민지현", 48, "이세현", "이수정", 34, 88};
 해당 데이터 값 중 문자값만 출력 되도록 재 배열 하시길 바랍니다.
 단, 메인에서는 해당 배열을 외부 클래스(setter)로 전송합니다.
 해당 setter에서 배열값을 확인하여 이름만 재배열로 생성 합니다.
 getter에서 해당 배열을 return으로 보내도록 합니다.
 단, 외부 클래스에서 숫자만 잇는 배열은 모두 예외처리 되도록 합니다.
 */
public class Exception7 {

	public static void main(String[] args) {
		Object data[] = {"김민수", 55, "김민재", "민지현", 48, "이세현", "이수정", 34, 88};
		try { //예외처리
		rdata r = new rdata();//class호출(1)
		r.setter(data); //값전달
		LinkedList<String> result = r.getter(); //(4) getter 메소드 호출 및 배열 자료형으로 받음
		System.out.println(result); // 최종출력(6)
		}
		catch (Exception e) {
			if(e.getMessage()!=null) {
				System.out.println("error 발생");
			}
		}
	}

}
class rdata{
	LinkedList<String> ls = new LinkedList<>(); //빈배열 생성
	LinkedList<Integer> ar = new LinkedList<>(); //빈배열 생성
	//setter : 데이터를 생성 및 가공
	//getter : 데이터를 출력 (return)
	
	//(3) Object배열을 setter로 받음
	public void setter(Object[] call) throws Exception{
		int ea = call.length;
		int w = 0;
		do {
			try { //문자만 배열에 입력, 숫자 자료형일 경우 예외처리
				String check = String.valueOf((String)call[w]);
				this.ls.add(check);
			}
			catch (Exception ex) {
				int check2 = Integer.valueOf((int)call[w]);
				this.ar.add(check2);
			}	//예외처리 발생		
			w++;
		}while(w < ea);
		System.out.println(ar);
	}
	public LinkedList<String> getter() { //(5)getter
		return this.ls;
	}
}
