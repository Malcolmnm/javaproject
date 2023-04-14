package java2;

public class Method18 extends data {
	//main은 오버라이드를 사용할 수 없습니다.
	public static void main(String[] args) {
		//Method17 m = new Method17();
		//m.main(args);
		md d = new md();
		d.display();
		Method18 mh = new Method18();
		mh.name();
	}
	@Override
	public void name() {
		super.name();
	}
}
class md extends pt{
	@Override
	public void display() {
		super.display();
	}
}

class data{
	public void name() {
		System.out.println("외부 클래스 data 로드");
	}
}