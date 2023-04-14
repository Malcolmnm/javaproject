package java1;

import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		Member2 mb = new Member2();
		mb.list("홍길동", 5);
		/*
			응용문제5. Member2 class 안에 신규 메소드를 생성하여,
			다음과 같이 결과가 나올 수 있도록 코드를 제작합니다. 단, 사용자가 직접 구구단 숫자를 입력합니다.
			예시)
			"사용하실 구구단 숫자를 하나 입력해 주세요."
			[결과] - 해당 구구단 출력 단, 역순으로 출력합니다.
			만약 4를 입력 4 * 9 = 36 .. 4 * 1 = 4
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("\n사용하실 구구단 숫자 하나를 입력해주세요.");
		int a =  sc.nextInt();
		mb.man(a);
		sc.close();
	
	}

}

class Member2{
	//일반 메소드는 인자값을 복합적으로 적용할 수 있음.
	public void list(String user, int level) {
		System.out.printf("고객명:%s 레벨:%d",user,level);
	}
	
	public void man(int aa) {
		if(aa<=0) {
			System.out.println("숫자는 1 이상만 입력가능합니다.");
		}
		else {
			int w = 9;
			while(w >= 1) {
				System.out.printf("\n%d * %d = %d",aa,w,aa*w);
				w--;
			}
		}
	}
	
}