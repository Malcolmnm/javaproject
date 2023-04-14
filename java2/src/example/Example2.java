package example;

//class : 틀, 객체 : 제품, 인스턴스 : 제품의 박스

public class Example2 {
	public final int data = 2;// final 상수
	String abc = "홍길동";
	
	public static void main(String[] args) {
		final int data2 = 50; //메소드 안에 상수선언
		System.out.println(data2);
		//field에 있는 값은 main 직접 핸들링이 안됨
		Example2 ex = new Example2(); //객체 생성 및 인스턴스로 등록시킵니다.
		System.out.println(ex.data);
		ex.abc = "이순신"; //전역변수 값 바꿈
		ex.aaa();
	}
	public void aaa() { //확장 메소드에서는 field값 핸들링이 가능함
		this.abc = "강감찬";
		System.out.println(abc);
		System.out.println(data);
	}
	
	
}
