package java3;

public class Abstract1 {
	// 추상 클래스 (가상 클래스)
	public static void main(String[] args) {
		box2 b = new box2();
		b.sbox();
	}
}

class box2 extends box {

	@Override
	String result() {
		return null;
	}

	@Override
	public void sbox() {

	}

}

//abstract : 추상 메소드가 존재하며, 해당 추상 메소드를 사용하지 않을 경우(오버라이드) error가 발생합니다.
abstract class box {
	abstract public void sbox(); //추상 메소드

	abstract String result(); //추상 리턴 메소드
}