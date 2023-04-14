package example;

import java.util.Arrays;
import java.util.Scanner;

public class Example7 {
	/*
	 응용문제3.
	 사용자가 총 7개의 숫자를 입력합니다.
	 7개의 숫자 중 짝수 값이 몇개 입력되었는지 출력하시오. 
	 */
	public static void main(String[] args) {
		
		new ax();
	}
}
class ax{
	Scanner sc = new Scanner(System.in);
	Integer a[] = new Integer[7];
	public ax() {
		int b = 0;
		int count = 0;
		System.out.println("값을 7개 입력하세요.");
		while(b < a.length) {
			a[b] = sc.nextInt();
			if(a[b]%2==0) { //사용자가 입력한 숫자가 짝수일 경우
				count++; //+1씩 증가
			}
			b++;
		}
		System.out.println(Arrays.toString(a));
		System.out.printf("짝수는 총 %d개입니다.",count);
	}
}
