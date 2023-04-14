package java1;

public class Class6 {
	//상수 선언하는 방법 + 외부 클래스 메소드 이동
	public static void main(String[] args) {
		int a = 5;
		final int b = 10; //final : 상수를 선언하는 자료형(변경 불가)
		a = 10;
		//b = 5;
		System.out.println(a);
		System.out.println(b);
		
		//User u  = new User(); 객체 생성 및 인자값으로 전달
		new User(); 
	}

}
class User{
	String person; //필드에 있는 인스턴스 변수(전역변수)
	
	public User() { //기본 메소드 (즉시 실행 메소드, 무조건 class명과 동일해야함)
		person = "홍길동"; //인스턴스 변쉥 값을 이관
		list(); //메소드를 바로 호출이 가능함
	}
	public void list() { //즉시실행 메소드에서 실행되는 메소드
		System.out.println(person);
		System.out.println("사용자 리스트 출력");
		int p = point(); //return 메소드로 값을 이관 받아서 처리
		System.out.println(p);
	}
	public int point() {
		return 5000;
	}
}