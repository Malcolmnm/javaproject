package java3;
//abstract4
abstract class sum_total{
	public int sum;
	public abstract void datalist();
	public abstract void result();
}



//public을 쓰려면 main class가 없어야함
public abstract class ab1 {
	public abstract String loginck();
	
	public abstract void idck(String id);
	
	public abstract void result();
		
	public int aa1 = 30;
	
	public void ab_1() { //추상 클래스에 실제 메소드
		
	}
}
//외부 가상 class를 만들기위해서는 public을 사용하지 않습니다.
abstract class aa{
	public abstract int password(); //가상 메소드 생성
	
}
abstract class aa2 extends aa{ //추상 클래스 끼리 상속을 받음
	//단, 추상 클래스는 오버라이드 하지않습니다.
	public abstract String user_info();
}
//일반 클래스 메소드
class aa3{
	public String aa3_method() {
		return null;
	}
}