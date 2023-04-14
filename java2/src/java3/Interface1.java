package java3;

public class Interface1 {
	//interface 사용법 (inter1.java, inter2.java)
	//interface의 특징 : class가 없음 (추상 메소드)
	public static void main(String[] args) {
		key k = new key();
		k.z1();
		k.z2();
		k.z3();
		k.z1_1(2, 2);
	}
}
//interface 상속을 받기 위해서는 implement를 이용합니다.
//여러개의 interface를 한번에 모두 로드할 수 있음.
//interface의 단점 : 일반메소드 생성 불가.
//단, 강제로 메소드를 생성할 수 있음 (default 이용시)
class key implements inter1, inter2{
	@Override
	public void z1() {
		System.out.println(inter1.names); //동일한 변수를 사용시 this를 사용하지못하며 해당 인터페이스 메소드 이름을 입력 후 해당변수명을 적용해야합니다.
	}
	@Override
	public void z2() {
		System.out.println(inter1.names);
	}
	@Override
	public String z3() {
		System.out.println(inter2.names);
		return null;
	}
	@Override
	public void z1_1(int a, int b) { //일반 메소드 사용 유/무
		inter1.super.z1_1(a, b);
	}
}