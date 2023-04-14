package java1;

import java.util.Scanner;

public class index10 {

	public static void main(String[] args) {
		/*
		 	응용문제2.
		 	Q. 원하는 구구단 숫자를 입력하세요.
		 	사용자가 원하는 숫자를 입력하면 해당 숫자의 맞는 구구단이 출력되도록 합니다.
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Q. 원하는 구구단 숫자를 입력하세요.");
		int a = sc.nextInt();
		int b;
		int sum;
		sc.close();
		for(b=1;b<=9;b++) {
			sum = a*b;
			System.out.printf("\n%d * %d = %d",a,b,sum);
		}
		
	}

}
