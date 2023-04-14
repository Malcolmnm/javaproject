package java2;

//상속 메소드 (extends)
public class Method7 {
	public static void main(String[] args) {
		box2 b2 = new box2();
		b2.list();
		b2.list2();
	}
}

class box1 { // 외부 box1 class
	public String user_id;
	private String user_pw; //private는 상속되지 않음으로 return을 이용하여 핸들링함
	public void list() {
		this.user_id = "hong";
	}
	public String pw() { //getter(무조건 return)
		this.user_pw = "a123456";
		return this.user_pw;
	}
}

class box2 extends box1 { // extends : box1을 상속받아 box2에서 진행
							// 상속을 이용할 경우 같은 메소드 이름을 사용하지 않음
	public void list2() {
		String pass = pw(); //box1에서 return메소드로 값을 가져옴
		System.out.println(pass);
		System.out.println(this.user_id);
	}
}