package java1;

public class Class3 {
	
	//외부 class 생성시 static 유/무 활용 및 return 메소드
	public static void main(String[] args) {
		//Box b = new Box();
		//b.abc();
		Class3 c3 = new Class3(); //같은 클래스라도 해당 객체 생성 후 메소드 로드
		c3.bbb();
		
		//리턴 메소드로 값 받기
		String result = c3.zzz();
		System.out.println(result);
		
		int result2 = c3.kkk();
		System.out.println(result2);
		
		//event라는 메소드가 static 메모리에 이미 할당 되어 있으므로
		//Coupon Class를 로드 후 바로 해당 메소드를 호출 할 수 있음.
		Coupon.event();
		
	}
	public void bbb() {
		int a = 10000;
		double b = a / 0.5;
		System.out.println(b);
	}
	
	//리턴 메소드(문자)
	public String zzz() {
		String a = "10";
		return a;
	}
	
	//리턴 메소드(숫자)
	public int kkk() {
		int a = 10;
		return a;
	}
	
}
//static 메소드가 없는 경우
class Box{
	public void abc() { //static void : 메모리에 할당 되는 메소드임
		//단, static 사용하지 않을 경우 같은 package안에서는 공유가 가능함.
		System.out.println("test");
	}
}
//static 메소드가 있는 경우
class Coupon{
	public static void event() { //객체 생성할 필요없음
		int cp = 30;
		System.out.println(cp);
	}
	public void event2() { //이건 객체를 생성해야함
		System.out.println("test");
	}
}