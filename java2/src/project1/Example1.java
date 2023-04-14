package project1;

import java.util.Scanner;

/*
 응용문제4.
 업, 다운 퀴즈를 하도록 합니다.
 pc가 1~10까지의 임이의 숫자를 선택합니다. 단, interface 사용
 
 "1~10 숫자를 입력하세요"
 라는 메세지와 함께 사용자가 숫자를 하나 선택합니다.
 결과는 pc가 4라는 숫자를 선택하였고, 사용자가 8이라는 숫자를 선택하였다면
 Down을 만약 사용자가 1이라는 숫자를 선택하였다면 Up이라는 메세지를 출력합니다.
 단, 횟수는 딱 4회만 할 수 있도록 합니다. pc가 뽑은 숫자와 사용자가 뽑은 숫자가 같을경우
 "정답"이라는 메세지 출력 4회 이상일때는 "정답을 맞추지 못했습니다."라는 결과값을 출력합니다.
*/

public class Example1 {

	public static void main(String[] args) {
		Exam e = new Exam();
		e.EEx1();
		
	}

}
class Exam implements Ex1{
	@Override
	public void EEx1() {
		int a = (int)Math.ceil(Math.random()*10);
		int w = 0;
		int count = 0;
		System.out.println("1~10 숫자를 입력하세요.");
		while(w < 3) {
			int select = EEx2();
			count++;
			if(count == 3) {
				System.out.println("다음기회에~");
				break;
			}
			if(select > a) {
				System.out.println("Down");
				System.out.printf("기회가 %d번 남았습니다.",3-count);
			}
			else if(select < a) {
				System.out.println("UP");
				System.out.printf("기회가 %d번 남았습니다.",3-count);
			}
			else {
				System.out.println("정답입니다.");
				break;
			}
			w++;
		}
	
		
		
	}
	@Override
	public int EEx2() {
		try {
		Scanner sc = new Scanner(System.in);
		int cc = sc.nextInt();
		if(cc > 10) {
			sc.close();
			System.out.println("1부터 10까지 입력바랍니다.");
			EEx2();
		}
		return cc;
		}
		catch (Exception e) {
			System.out.println("숫자만 입력해주세요.");
			EEx2();
			return 0;
		}
	}
}