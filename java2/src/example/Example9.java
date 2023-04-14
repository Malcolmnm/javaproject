package example;

import java.util.Arrays;
import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		/*
		 응용문제4.
		 자판기 프로세스 개발 다음과 같이 작동 되도록 코드를 작성합니다.
		 "금액을 입력하세요."
		 "다음 메뉴를 선택하세요 [콜라, 사이즈, 환타, 포카리]"
		 "최종 남은 금액은 XXX 입니다."
		 */

		new Ex9();
	}

}
class Ex9{
	String data[][] = {
			{"콜라", "사이다", "환타", "포카리"},
			{"500", "500", "600", "800"}
	};
	Scanner sc = new Scanner(System.in);
	public Ex9(){
		System.out.println("금액을 입력하세요.");
		int a = sc.nextInt();
		System.out.printf("다음 메뉴를 선택하세요. %s",Arrays.toString(data[0]));
		String b = sc.next().intern();
		int w = 0;
		int ea = data[0].length;
		int result = 1;
		while(w < ea) {
			if(b==data[0][w]) {
				result = a - Integer.parseInt(data[1][w]); //data[1][w]값을 int로 변경
			}
			w++;
		}
		if(result==1) {
			System.out.println("없는 품목입니다.");
			new Ex9();
		}
		else {
			System.out.printf("최종 남은금액은 %d원 입니다",result);
		}
	
	}
}