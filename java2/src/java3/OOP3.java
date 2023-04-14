package java3;

import java.util.Arrays;
import java.util.LinkedList;

public class OOP3 {

	public static void main(String[] args) {
		/*
			응용문제2.
			본데이터 15,22,37,8,11,19,41 이 있습니다.
			해당 본 데이터를 다음 결과같이 커스텀 하여 출력하시오
			커스텀 결과 [7,15,22,8,11,39,41]
		*/
		Integer arr[] = {15,22,37,8,11,19,41};
		LinkedList<Integer> ln = new LinkedList<>(Arrays.asList(arr));
		ln.addFirst(7);
		ln.add(6,39);
		ln.remove(3);
		ln.remove(6);
		System.out.println(ln);
	}

}
