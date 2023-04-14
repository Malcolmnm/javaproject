package java1;

import java.util.Arrays;

public class Array11 {
	//2차배열 응용편
	public static void main(String[] args) {
		/*
		 응용문제7.
		 Adata와 Bdata 두가지 배열값을 더한 후
		 해당 배열값을 기준으로 짝수, 홀수인지를 나열하는 배열 결과를 출력하는 코드를 작성하시오.
		 Adata[0] = 5 17 19 22 33
		 Adata[1] = 1 2 3 4 5
		 Result = [짝수,홀수...]
		 */
		
		int Adata[][] = {
				{5,17,19,22,33},
				{1,2,3,4,5}
		};
		String Result[] = new String[Adata[0].length];
		int w = 0;
		int sum = 0;
		while(w < Adata[0].length) {
			sum = Adata[0][w] + Adata[1][w];
			if(sum%2==0) {
				Result[w] = "짝수";
			}
			else {
				Result[w] = "홀수";
			}
			w++;
		}
		System.out.println(Arrays.toString(Result));
	}

}
