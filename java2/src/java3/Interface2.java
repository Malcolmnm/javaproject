package java3;
//user1.java, user2.java 응용편 (interface)

import java.text.DecimalFormat;
import java.util.Scanner;

public class Interface2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자 아이디를 입력하세요.");
		String id  = sc.next().intern();
		sc.close();
		userinfo ui = new userinfo();
		ui.myinfo(id);
	}

}
//사용자 포인트 확인하는 페이지 구성
class userinfo implements user2, user1{
	private int total;
	@Override
	public void myinfo(String userid) {
		this.total = dataea();
		int point = 0;
		//데이터 로드 부화를 줄이기 위해서 사용하는 형태
		try {
			System.out.println("잠시만 기다려주세요.(조회중)");
			Thread.sleep(5000);
		} catch (Exception e) {
			
		}
		int w = 0;
		int count = 0;
		while(w < this.total) {
			//사용자가 검토하는 아이디와 배열값에 있는 아이디가 같을 경우
			if(userid == user2.infodata[w][0]) {
				count++;
				//문자를 숫자로 변환
				point = Integer.valueOf(user2.infodata[w][4]);
			}
			w++;
		}
		if(count==0) { //검색 결과가 없을경우
			System.out.println("등록된 회원이 아닙니다.");
		}
		else {
			DecimalFormat df = new DecimalFormat("###,###"); //숫자 자료형에 자동 콤마 기능을 적용합니다.
			System.out.println("고객님의 포인트는 "+df.format(point)+"원 입니다.");
		}
	}
	
	@Override
	public String pointck(String userid) {
		return null;
	}
	
	@Override
	public int dataea() {
		return user1.super.dataea();
	}
	
	
	@Override //사용안함
	public void mytel(String usertel) {}
}