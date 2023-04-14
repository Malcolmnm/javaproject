package java1;

import java.util.Arrays;
import java.util.Scanner;

public class Array13 {
	// 사용자 아이디 입력 및 배열 데이터로 변환
	public static void main(String[] args) {
		String lists = "";
		int f;
		Scanner sc = new Scanner(System.in);
		// 반복문없이 nextline으로 사용할 수 있다.
		for (f = 0; f <= 4; f++) {
			System.out.println("학급 학생 아이디를 입력해 주세요.");
			String id = sc.next();
			lists += id + " ";
		}
		// split : 문자열 또는 숫자열을 특정 문자 기준으로 배열화 하는 명령어
		sc.close();
		String userdata[] = lists.split(" ");
		System.out.println(Arrays.toString(userdata));
	}

}
