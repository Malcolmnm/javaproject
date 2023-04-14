package java1;

import java.math.BigInteger;

public class index12 {
	//Big_loop 값 설정
	public static void main(String[] args) {
		//1부터 100까지 모든 숫자를 곱한 값을 출력하시오.
		int w = 1;
		BigInteger sum = new BigInteger("1");
		//BigInteger : java 유일하게 무한의 값을 가질 수 있는 변수형
		//단, 변수값에 최초값은 무조건 문자 ""로 설정
		while(w<=100) {
			/*
				add : 사칙연산 더하기 당담
				subtract : 사칙연산 빼기 당담
				multiply : 사칙연산 곱하기 당담
				divide : 사칙연산 나누기 당담
			*/
			sum = sum.multiply(BigInteger.valueOf(w));
			//valueOf : 문자를 숫자로 변환
			w++;
		}
		System.out.println(sum);
	}

}
