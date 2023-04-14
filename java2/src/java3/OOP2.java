package java3;

public class OOP2 {
	//변수 선언(전역변수, 지역변수)
	public static String datas = "홍길동";
	public static void main(String[] args) {
		vars v = new vars();
		v.abc();
	}
}
class vars{
	public void abc() {
		int a = 10;
		int b = 0; //밖에 선언을 해둬야합니다.
		if(a == 10) {
			b = 30; //if문 안에서 생성된 변수는 밖에서 사용할수없기때문에
		}
		int w = 0;
		while(w < b) { //b 변수를 가져올 수 없음
			w++;
		}
		System.out.println(OOP2.datas);
	}
}