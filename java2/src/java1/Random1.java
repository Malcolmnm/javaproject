package java1;

import java.util.Scanner;

public class Random1 {
	//random 메소드 이용법 + 재귀메소드(자신의 메소드를 호출 또는 다른 메소드를 호출)
	public static void main(String[] args) {
		int number = (int)Math.ceil(Math.random()*10);
		System.out.println(number);
		/*
		 Math.ceil : 올림
		 Math.floor : 내림
		 Math.round : 반올림
		*/
		
		/*
		 문제. 컴퓨터가 하나의 숫자를 뽑습니다. 사용자가 해당 숫자를 맞추는 게임입니다. 
		 단, 틀릴 경우 컴퓨터는 다시 다른 숫자를 뽑습니다.
		 틀릴경우 : "실패"
		 맞을경우 : "정답"
		 */
		Game g = new Game();
		g.pc();
	}
}
class Game{
	Scanner sc = new Scanner(System.in);
	public void pc() {
		int ai = (int)Math.ceil(Math.random()*5);
		System.out.println("1~5까지 숫자 중 하나를 입력하세요.");
		int person = this.sc.nextInt();
		if(ai==person) {
			System.out.println("정답");
			this.sc.close();
		}
		else {
			System.out.println("실패");
			this.pc(); //재귀함수로 자신의 메소드를 다시 재호출
		}
	}
}
