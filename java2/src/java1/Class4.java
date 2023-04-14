package java1;

import java.util.Scanner;

public class Class4 {

	public static void main(String[] args) {
		/*
		 응용문제4.
		 static이 없는 class 이며, 해당 class에 두개의 숫자를 인자값으로 보냅니다.
		 해당 두개의 숫자 범위 안에 모든 값을 더하여 결과값을 받아서 출력하는 코드를 작성하시오 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 숫자를 입력하세요.");
		int aa = sc.nextInt();
		int bb = sc.nextInt();
		Abab y = new Abab();
		//y.man(aa, bb);
		//int result = y.aaa(aa,bb);
		int result = y.aaa(aa, bb);
		sc.close();
		System.out.println(result);
	}

	
}

class Abab{ //같은 package 안에 동일한 class는 사용하지 못합니다.
	/*public void man(int a, int b) {
		int sum = 0;
		while(a<=b){
			sum += a;
			a++;
		}
		System.out.println(sum);
	}*/
	
	public int aaa(int a, int b) {
		int sum = 0;
		while(a<=b){
			sum += a;
			a++;
		}
		return sum;
	}
}