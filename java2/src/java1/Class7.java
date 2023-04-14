package java1;

import java.util.Scanner;

public class Class7 {
	//응용편 : 회원가입시 약관 동의 및 간편회원 가입 진행
	public static void main(String[] args) {
		//해당 코드느 단 한번만 사용(외부 클라스 기준으로 작성)
		//System.exit(0); 프로세스 강제종료
		
		new Morn();
	}

}
class Morn{
	Scanner sc = new Scanner(System.in);
	public Morn() {
		System.out.println("회원가입 약관에 동의 하시겟습니까?(y/n)");
		String a = sc.next().intern();
		if(a=="y") {
			Morn2();
		}
		else if(a=="n") {
			System.out.println("회원가입이 취소되셨습니다.");
		}
		else {
			System.out.println("y와 n중 입력 바랍니다.");
			new Morn();
		}
	
	}
	public void Morn2() {
		System.out.println("아이디를 입력하세요.");
		String id = sc.next().intern();
		if(id=="admin") {
			System.out.println("중복된 아이디입니다.");
			Morn2();
		}
		else {
			System.out.println("패스워드를 입력하세요.");
			String pw = sc.next().intern();
			System.out.println("가입자명을 입력하세요.");
			String name = sc.next().intern();
			if(pw!="" && name!="") {
				System.out.println("정상적으로 회원가입이 완료 되었습니다.");
			}
		}
		sc.close();
	}
}
