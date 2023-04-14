package example;
import java2.Mssql; //다른 패키지에서 값을 가져오는 방법.

public class Example10 {

	public static void main(String[] args) {
		Mssql ms = new Mssql();
		ms.abc(); //외부 메소드 로드
		//ms.main(args); //외부 메인 메소드 로드 권장하지않음.
		String result = ms.bbb();
		System.out.println(result);
	}

}
