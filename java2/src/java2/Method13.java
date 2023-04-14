package java2;

import java.util.Scanner;

public class Method13 {

	public static void main(String[] args) {
		gugudan2 gg = new gugudan2();
		gg.gugu();
	}

}
/*
 응용문제1. 사용자가 구구단 숫자를 하나 입력 합니다.
 세컨 개발자가 입력된 사항을 1~9까지 결과가 출력되는 구구단을 개발합니당.
 단, 상속받은 메소드에서 처리되도록 합니다. 
 */
class gugudan{
	protected int number;
	public void gugu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 구구단을 입력하세요.");
		number = sc.nextInt();
		sc.close();
	}
	public void result(int number) {
		
	}
}
class gugudan2 extends gugudan{
	@Override
	public void gugu() {
		super.gugu();
		result(this.number);
		
	}
	@Override
	public void result(int number) {
		super.result(number);
		int w = 1;
		while(w<=9) {
			System.out.printf("\n%d * "+w+" = "+(number*w),number);
			w++;
		}
	}
}