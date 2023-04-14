package java1;

import java.util.Scanner;

public class Class10 {

	public static void main(String[] args) {
		new log();

	}

}
class log{
	Scanner sc = new Scanner(System.in);
	int count = 0;
	public log(){
		System.out.println("아이디를 입력하세요.");
		String a = sc.next().intern();
		if(a!="hong") {
			System.out.println("가입되지 않은 사용자입니다.");
			new log();
		}
		else {		
			System.out.println("패스워드를 입력하세요.");
			log2();
		}
	}
	public void log2() {
		String b = sc.next().intern();
		if(b!="a123456") {
			count++;
			if(count ==3) {
				System.out.println("해당 아이디는 10분 후에 다시 로그인 하실 수 있습니다.");
				System.exit(0);
			}
			System.out.println("패스워드를 확인해주세요.");
			log2();
		}
		else {
		System.out.println("로그인 되었습니다.");
		}
		sc.close();
	}
}
