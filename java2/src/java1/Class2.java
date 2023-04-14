package java1;

import java.util.Scanner;

class Member{ //위아래 아무곳에나 class 작성 가능
	String user = "홍길동"; //인스턴스 변수값
	public static void abc() { //void : return이 없는 메소드
		String user2  = "이순신";
		System.out.println(user2);
	}
}
/*
 	[접근 제어자]
	public : 기본으로 필요시 접근이 용의하게 사용 (접근 제한이 없음)
	private : 자신의 클래스 내에서만 접근이 됨
	protected : 같은 패키지 안에서 파생되는 클래스만 접근
 	외부 클래스 : default (동일한 패키지만 접근이 됨)
 */
public class Class2 {
	//외부 Class 및 외부 method 활용
	public static void main(String[] args) {
		Member m = new Member();
		//m.user = "유관순";
		System.out.println(m.user);
		m.abc(); //Member Class에 abc 메소드를 호출
		
		Inject i = new Inject();
		i.user("hong","a123456");
		
		/*
		 응용문제1. 외부 class를 이용하여 2개의 숫자 값을 외부 class 안에 있는
		 메소드를 이용하여 곱합니다. 해당 곱한 값이 짝수인지 홀수인지 겁토하는 코드를 작성하시오.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 두개를 입력하세요.");
		int cc = sc.nextInt();
		int dd = sc.nextInt();
		Yolo y = new Yolo();
		y.man(cc, dd);
		sc.close();
	}

}

class Inject{
	//user 메소드에 두개의 인자값 및 자료형을 받는 형태
	public static void user(String name, String pw) {
		System.out.println("사용자명 : " + name + "\n패스워드 : "+pw);
	}
}
class Yolo{
	public static void man(int aa, int bb) {
		int sum = aa * bb;
		if(sum%2==0) {
			System.out.println("두수의 곱은 짝수입니다.");
		}
		else {
			System.out.println("두수의 곱은 홀수입니다.");
		}
	}
}