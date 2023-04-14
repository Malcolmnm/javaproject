package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List2 {

	public static void main(String[] args) {
		new Li2();
		String user[] = {"hong", "kim", "park", "jang"};
		ArrayList<String> al = new ArrayList<>(Arrays.asList(user));
		//int ea = al.size(); 몇개인지 나옴 4개
		int w = 0;
		while(w<al.size()) {// 노드배열 번호를 바꿔야하기때문에 ea가 아닌 al.size()를 입력하여 실제 배열 번호가 바뀌게해준다.
			if(al.get(w).equals("kim")) {
				al.remove(w);
			}
			w++;
		}
		System.out.println(al);
	}
	/*
	 응용문제
	 해당 배열을 확인 후 짝수의 숫자를 모두 삭제하여 최종 결과 배열을 출력 하시오.
	 10 7 6 1 11 37 41 22
	 */
}
class Li2{
	public Li2() {
		Integer user2[] = {10,7,6,1,11,37,41,22};
		ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(user2));
		int ww = 0;
		while (ww<al2.size()) {
			if(al2.get(ww)%2==0) {
				al2.remove(ww);
			}
			ww++;
		}
		//Collections.sort(al2);오름차순 정렬
		Collections.sort(al2,Collections.reverseOrder()); //내림차순 정렬
		System.out.println(al2);
	}
}