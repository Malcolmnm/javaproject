package java2;

public class Method3 {
	//method 접근형태 + static
	public static void main(String[] args) {
		cdb c = new cdb();
		c.a1 = "홍길동";
		//c.a2 = "실버회원";
		c.a3 = "hong@nate.com";
		c.data1("실버회원");
	}
}

class cdb{
	String a1 = null;
	private String a2 = null; //private는 외부 class에서 변경불가
	public static String a3 = null;
	
	public void data1(String level) {
		System.out.println(a1);
		this.a2=level; //인자값으로 받은 데이터를 private 변수로 이관
		System.out.println(a2);
		System.out.println(a3);
	}
}