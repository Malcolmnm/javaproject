package java1;

import java.util.Scanner;

public class Class9 {

	public static void main(String[] args) {
		
		new room();
	}

}
class room{
	Scanner sc = new Scanner(System.in);
	public room() {
		System.out.println("방번호를 입력하세요.");
		int a = sc.nextInt();
		String b;
		if(a==1) {
			a = 60000;
			b = "무지개룸";
			room2(a,b);
		}
		else if(a==2) {
			a = 125000;
			b = "패밀리룸";
			room2(a,b);
		}
		else if(a==3) {
			a = 100000;
			b = "달빛아래룸";
			room2(a,b);
		}
		else {
			System.out.println("올바른 값이 아닙니다.");
			new room();
		}
	}
	public void room2(int aa, String bb) {
		System.out.println("30% 할인 쿠폰을 적용하시겠습니까?(y/n)");
		String c = sc.next().intern();
		int d;
		if(c=="y") {
			d = aa - (int)(aa * 0.3);
			System.out.printf("방이름:%s  가격:%d",bb,d);
		}
		else if(c=="n") {
			System.out.printf("방이름:%s  가격:%d",bb,aa);
		}
		else {
			System.out.println("올바른 입력값이 아닙니다.");
			room2(aa,bb);
		}
	}

}