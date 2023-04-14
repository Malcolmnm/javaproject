package java3;

/*import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Interface3 {
	//user1.java, user2.java 응용편
	/*
	 응용문제2.
	 가입된 모든 사용자의 정보를 출력합니다. 출력형태는 다음과 같습니다.
	 아이디 : hong 고객명 : 홍길동 이메일 : hong@nate.com 지역 : 서울시 영등포구
	
	public static void main(String[] args) {
		new ifif3();
	}

}
class ifif3{
	public ifif3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색하실 아이디를 입력하세요.");
		String name = sc.next().intern();
		if3 i = new if3();
		i.myinfo(name);
		sc.close();
	}
}
class if3 implements user1{ //user2 인터페이스는 로드하지않음. 단, user2에 있는 필드 변수명을 별도로 호출 할 수 있음.
	@Override
	public void myinfo(String userid) {
		int w = 0;
		try {
			System.out.println("잠시만 기다려주셈.");
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		int count = 0;
		while(w < dataea()) {
			if(userid == user1.userdata[w][0]) {
				System.out.printf("아이디 : %s 고객명 : %s 이메일 : %s 지역 : %s",user1.userdata[w][0],user1.userdata[w][1],user1.userdata[w][2],user2.infodata[w][2]);
				count++;
				
			}
			w++;
		}
		if(count==0) {
			System.out.println("해당 아이디는 없습니다.");
			new ifif3();
		}
	}
	@Override
	public int dataea() {
		return user1.super.dataea();
	}
	
	@Override
	public void mytel(String usertel) {} //사용안함
}*/