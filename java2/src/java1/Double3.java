package java1;

import java.util.Scanner;

public class Double3 {

	public static void main(String[] args) {
		/*
			응용문제7.
			사용자가 숫자 3개를 입력 시킵니다.
			3개의 숫자 중 짝수의 대한 숫자만 곱하여 결과값을 출력합니다.
			단, 짝수의 숫자가 한개 또는 없을 경우 
			"짝수의 숫자가 확인 되지 않습니다."라는 메세지를 출력
		*/
		
		Scanner sc = new Scanner(System.in);
		int w = 1;
		int v =1;
		int b = 0;
		while(w<4) {
		System.out.println("숫자를 입력하세요.");
		int a = sc.nextInt();
		if(a%2==0) {
			v*=a;
			b++;
		}
		w++;
		}
		if(b<2) {
			System.out.println("짝수의 숫자가 확인 되지 않습니다.");
		}
		else {
			System.out.println(v);
		}
		sc.close();
	}

}
