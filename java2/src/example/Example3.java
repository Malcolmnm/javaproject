package example;

import java.util.Scanner;

public class Example3 {

	final int money = 7000;
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Example3 ex3 = new Example3();
		ex3.aaa();
	}

	public void aaa() {
		System.out.printf("%d 결제 하시겠습니까?", this.money);
		int a = sc.nextInt();
		// String일 경우 intern 또는 equals 해야만 조건을 확인 할 수 있습니다.
		if (a == 1) {
			System.out.println("결제가 진행됩니다.");
			System.exit(0);
		} else if (a == 2) {
			System.out.println("결제가 취소 되었습니다.");
			System.exit(0);
		}

	}
}
