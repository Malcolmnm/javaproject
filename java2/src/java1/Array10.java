package java1;

import java.util.Arrays;

public class Array10 {
	//2차 배열 + 다차원배열
	public static void main(String[] args) {
		//숫자 형태의 2차 배열
		int data[][] = {
				{1,2,3},
				{3,4,5}
		};
		//정적배열 형태
		int indata[][] = new int[2][5]; //[배열 구분 갯수]
		indata[0][0] = 10;
		indata[0][1] = 20;
		indata[0][2] = 30;
		indata[0][3] = 40;
		indata[0][4] = 50;
		indata[1][0] = 60;
		indata[1][1] = 70;
		indata[1][2] = 80;
		indata[1][3] = 90;
		indata[1][4] = 100;
		System.out.println(Arrays.toString(indata[0]));
	}

}
