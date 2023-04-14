package java1;

import java.util.Scanner;

public class index8 {
	//Scanner와 문자열 비교
	public static void main(String[] args) {
		/*Scanner a = new Scanner(System.in);
		System.out.println("아이디름 입력하세요.");
		String mid = a.next().intern(); //intern을 사용해줘야 연산자형태로 쓸수있다.(문자형 일경우)
		
		//if(mid.equals("kim") || mid.equals("park")) //equals = "==" (같다라는 뜻)
		if(mid=="kim" || mid=="park"){ 
			System.out.println("회원이 확인 되었습니다.");
		}
		else {
			System.out.println("비회원 입니다.");
		}
		a.close();*/
		
		/*
			응용문제 1.
			사용자가 원하는 숫자를 입력합니다. 단, 해당 숫자가
			100이하 숫자만 입력해야 하며, 100이상일 경우
			"숫자는 100까지만 입력 가능합니다."라는 메세지가 출력 되도록 제작하시오.
			-추가-
			사용자가 입력한 값이 짝수인지 홀수인지 출력하시오.
		*/
		Scanner b = new Scanner(System.in);
		System.out.println("1~100까지 숫자를 입력하세요.");
		int number = b.nextInt();
		if(number > 100) {
			System.out.println("숫자는 100까지만 입력 가능합니다.");
		}
		else {
			if(number%2==0) {
				System.out.println("짝수입니다.");
			}
			else {
				System.out.println("홀수입니다.");
			}
		}
		
		b.close();
	}

}