package example; //그룹에 해당

class Korea{ //외부 class
	//외부 field 공간
	public void aa() { //외부 메소드
		
	}
}


public class Example1 { //class는 무조건 생성
	//field 공간 (public, private, protected, default)
	private int a = 1;
	public int b = 2;
	public String c = "이순신";
	protected int d = 3;
	
	public Example1() { //construct 즉시 실행 메소드
		
	}
	
	public static void main(String[] args) { //프로세스 실행 메소드
		//단 main 메소드는 1개로 구성

	}

	public String abc() { //문자형 return 메소드
		return null;
	}
	
	public void bbb() { //일반 확장 메소드
		String aa = "홍길동"; //지역변수
	}
	
	public static void ccc() {//메모리에 저장 시키는 일반 확장 메소드
		
	}
}
