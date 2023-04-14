package java1;

import java.util.Scanner;

public class index5 {

	public static void main(String[] args) {
		
		//System.in(입력) != System.out(출력)
		
		//new : 객체를 선언하는 것을 말함
		Scanner sc = new Scanner(System.in); //사용자가 직접 값을 입력하세요
		
		int a = 10;
		
		//print, printf : 출력라인이 같은 라인으로 출력됨
		//println : 출력라인이 각각의 라인으로 출력됨(br)
		
		System.out.print("사용자가 원하는 숫자를 입력하세요");
		int b = sc.nextInt(); 
		//String b = sc.next();
		System.out.println(b);
		if(a > b) {
			System.out.println("업");
		}
		else if(a < b) {
			System.out.println("다운");
		}
		else {
			System.out.println("정답입니다.");
		}
		
		sc.close();
	}

}
