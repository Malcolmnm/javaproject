package java1;

public class Double2 {

	public static void main(String[] args) {
		/*
		 	응용문제6.
		 	구구단 9단 중 9*64까지 숫자 중
		 	홀수 값에 대한 평균값 결과를 출력하시오.
		 */
		int a = 9;
		int b = 1;
		int c = 0;
		int sum;
		int sum2 = 0;
		while(b<=64) {
			sum = a*b;
			if(sum%2==1) {
				sum2 += sum;
				c++;
			}
			b++;
		}
		System.out.println(sum2/c);
	}

}
