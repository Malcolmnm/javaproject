package java1;

import java.util.Scanner;

public class index14 {
	//할인율 구하는 공식 방법
	public static void main(String[] args) {
		int money =10000;
		int coupon = 20;
		//double sales = money * (double)0.8;
		double a = coupon * 0.01;
		double b = money * a;
		double c = money - b;
		
		//(int)란 double 자료형 변환 시킬때 사용
		//int total = (int)c;
		int total = (int)Math.round(c);
		
		//double sum = money - (money*(coupon *0.01)); 한줄로 표현
		System.out.println(total);
		/*
			응용문제4.
			총 상품 금액이 50000원 입니다.
			사용자에게 "할인 쿠폰을 얼마를 적용할까요?"라는 질문과 함께 숫자를 받습니다.
			결과 값으로 사용자가 적용한 할인율을 최종 상품금액으로 출력하시오.
			예시) 총 상품금액 50000원 할인 쿠폰을 얼마 적용할까요?
			20 최종 상품 금액은 40000원이에요~.
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("총 상품금액 50000원 할인 쿠폰을 얼마 적용할까요?");
		int aa = sc.nextInt();
		int bb = 50000;
		int dd = bb - (int)(bb * (aa * 0.01)); 
		System.out.printf("최종 상품 금액은 %d원입니다.",dd);
		sc.close();
	}
	

}
