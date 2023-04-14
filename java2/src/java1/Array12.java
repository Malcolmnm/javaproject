package java1;

public class Array12 {
	public static void main(String[] args) {
		/*
		 응용문제8.
		 데이터 배열에 있는 모든 짝수값에 합산 결과를 출력하시오. 단, 해당 배열은 2차 배열 형태 입니다.
		 1번 데이터 : 11 42 22 16
		 2번 데이터 : 7 33 10 29
		 최종 결과값 : 90
		 */
		int Data[][] = {
				{11,42,22,16},
				{7,33,10,29}
		};
		int w = 0;
		int ea = Data[0].length;
		int sum = 0;
		while(w < ea) {
			if(Data[0][w]%2==0) {
				if(Data[1][w]%2==0) {
					sum += Data[1][w];
				}
				sum += Data[0][w];
			}
			w++;
		}
		System.out.println(sum);
	}
}
