package java3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try1 {
	//예외처리 방식
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int box;
		//try~catch : 예외 처리문
		try { //오류발생시 check
		System.out.println("숫자를 입력하세요.");
		box = sc.nextInt();
		sc.close();
		System.out.println("사용자는 " + box + "를 입력하였습니다.");
		}
		catch (InputMismatchException aa) {
			System.out.println("문자가 입력되었습니다.");
		}
		catch (Exception e) { //오류발생된 사항
			System.out.println(e);
			System.out.println("숫자만 입력하세요.");
		}
	}
	
}
