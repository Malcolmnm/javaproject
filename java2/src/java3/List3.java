package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class List3 {
	/*
	 응용문제3.
	 넘버데이터 3 6 9 12 15
	 넘버데이터 2 4
	 결과 2 3 4 6 9 12 15 로 출력
	 */
	public static void main(String[] args) {
		Integer arr1[] = {3,6,9,12,15};
		Integer arr2[] = {2,4};
		
		ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(arr1));
		ArrayList<Integer> arr4 = new ArrayList<>(Arrays.asList(arr2));
		arr3.addAll(arr4); // addAll : ArrayList에 있는 모든값을 기존 배열로 추가
		Collections.sort(arr3);
		System.out.println(arr3);
		
		//무한 루프
		Scanner sc = new Scanner(System.in);
		while(true) { //무한루프 사용형태(while, do~while)
			System.out.println("숫자를 입력하세요.");
			int no = sc.nextInt();
			if (no==10) { //사용자가 숫자 10을 입력하며 무한루프가 정지됨
				break;
			}
		}
		sc.close();
	}
}
