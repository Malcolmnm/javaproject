package java2;

import java.util.Scanner;

public class Over3 {
	/*
	 응용문제4. 각 통신사별 인원수 현황을 출력하는 프로세서를 개발하시오.
	 예시) SKT : 1명
	 	  KT : 2명
	 	  LGT : 1명
	 */
	//메인 실행 class: Over1, method:userlist (String) 변수명:list
	public static void main(String[] args) {
		O3 o3 = new O3();
		System.out.println("통신사를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String tong = sc.next().intern();
		o3.userlist(tong);
		sc.close();
	}

}
class O3 extends Over1{

	@Override
	public void userlist(String username) {
		super.userlist(username);
		int w = 0;
		int count = 0;
		while(w<4) {
			if(username == list[w][4]) {
				count++;
			}
			w++;	
		}
		System.out.printf("%s : %d",username,count);
	}
}