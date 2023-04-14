package project1;

import java.util.ArrayList;
import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		String data[] = {"hong", "park"}; //문자열 배열
		int data2[] = {10,20}; //숫자열배열
		//현재 배열 자료형이 2가지 입니다.
		
		//단 ArrayList에 자료형이 String 이므로 int 배열은 받지 못함 해당 방식은 Object를 사용합니다.
		//Object란? 문자, 숫자 자료형과 관련없이 모든 자료형을 다 받아주는 자료형 구조입니다.
		ArrayList<Object> li = new ArrayList<>(Arrays.asList(data));
		li.add(data2[0]);
		li.add(data2[1]);
		System.out.println(li);
		
		//계산 방식 밑에 세개 모두 가능
		//int sum = (int)li.get(2) + (int)li.get(3);
		//Object sum = (int)li.get(2) + (int)li.get(3);
		Integer sum = (Integer)li.get(2) + (Integer)li.get(3);
		System.out.println(sum);
		
		//추가로 ArrayList 안에 데이터가 어떤 자료형인지 알아보는방법(Object일경우)
		System.out.println(li.get(2).getClass().getName());
	}

}
