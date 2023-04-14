package java2;

public class Mssql {

	public void abc() {
		System.out.println("외부 클래스 로드 완료");
	}
	public static void main(String[] args) {
		System.out.println("외부 클레스 메인 로드 완료");
	}
	public String bbb() {
		String user ="홍길동";
		return user;
	}
}
