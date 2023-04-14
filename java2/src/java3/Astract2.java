package java3;


public class Astract2 {
	
	public static void main(String[] args) {
		boox3 b = new boox3();
		b.idck("hong");
		b.result();
	}

}
//abstract(추상) : 상속을 강제하는 일종의 규제 즉, 법칙을 제공하는 class
//ab1연계
class boox3 extends ab1{ //추상클래스를 상속하면 무조건 추상클래스 안에 있는 모든 메소드를 오버라이드 해야함
	public void zzz() {
		
	}
	@Override
	public void idck(String id) {
		System.out.println(id);
	}
	@Override
	public String loginck() {
		return null;
	}
	@Override
		public void result() {
			System.out.println(this.aa1);
		}	
}
/*
 	추상클레스의 법칙
 	1. main에서 추상 메소드를 직접 핸들링 할 수 없습니다.
 	2. 추상클래스는 상속 위주로 사용하게 됩니다.
 	3. 추상클래스에 별도의 코드를 작성하지 않음(if, for X)
 	4. 필드에 변수를 선언 및 값을 적용할 수 있음.
 	5. 추상 클레스 안에 실제 메소드를 생성시 사용 안해도 상관없음.
 	6. 추상 클래스는 직접 실행이 안됩니다.
 	7. 추상 클레스는 추가 상속이 가능합니다.
*/