package java1;

import java.util.Scanner;

public class index9 {
	//한줄 이상 입력 관련 및 공백
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Q. 두 개의 숫자를 입력하세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		//nextInt, next : 스페이스바 or enter를 이용해서 두개를 받을 수 있음.
		System.out.printf("첫번째 숫자 %d, 두번째 숫자 %d",a,b);
		
		System.out.println("\nQ. 두명의 이름을 입력하세요.");
		String c = sc.next();
		String d = sc.next();
		System.out.printf("첫번째 이름 : %s, 두번째 이름:  %s",c,d);
		
		Scanner sc2 = new Scanner(System.in); 
		//sc라는 객체는 이미 nextInt, next를 사용하였으므로 신규 객체를 만들어줘야합니다.
		System.out.println("\nQ. 주소를 입력하세요.");
		//nextLine : 스페이스바는 그냥 공백으로 인식
		String e = sc2.nextLine();
		System.out.printf("주소:%s",e);
		sc.close();
		sc2.close();
	}

}