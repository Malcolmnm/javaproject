package java1;

import java.util.Scanner;

public class Array6 {
	//배열 + 키오스크 응용편
	public static void main(String[] args) {
		/*while(w <= 5){
			System.out.println("선택하세요.");
			int select = sc.nextInt();
			if(select==0) { //사용자가 숫자 0 을 입력하면
				System.out.println("종료");
				break;//반복문 강제종료
			}
			w++;
		}*/
		/*
		 응용문제5.
		 "주문하고자 하는 음식을 선택해 주세요" 메세지가 출력됨 사용자가 원하는 음식을 선택합니다.
		 선택된 음식 리스트를 출력하십시오. 단, 주문종료를 선택했을 경우만 주문한 음식 리스트가 나와야 합니다.
		 햄버거, 피자, 치킨, 라면, 김밥, 커피
		 출력예시)
		 1.햄버거 2.피자 3.치킨 4.라면 5.김밥 6.커피 7.주문종료
		 "주문하고자 하는 음식을 선택해주세요."
		 [치킨,라면,햄버거]
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("1.햄버거 2.피자 3.치킨 4.라면 5.김밥 6.커피 7.주문종료");
		int w = 1;
		String menu[] = {"햄버거","피자","치킨","라면","김밥","커피","주문종료"};
		System.out.println("주문하고자 하는 음식을 선택해주세요.");
		String sum = "";
		int ea = menu.length;
		while(w <= ea) {
			int select = sc.nextInt();
			if(select==w) {
				sum += menu[w-1]+" ";
				System.out.printf("주문하고자 하는 음식을 선택해주세요.( %s)",sum);
			}
			else if(select==7) {
				System.out.printf("주문종료 메뉴는 (%s)",sum);
				sc.close();
				break;
			}
			w++;
		}
		/*
		 String[] mymenu = new String[ea]; 사용자가 선택한 값을 입력시키기 위한 빈배열 변수
		 */
	}

}
