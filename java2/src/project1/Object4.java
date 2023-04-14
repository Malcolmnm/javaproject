package project1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Object4 {
	/*
	응용문제2.
	해당 상품 리스트가 있습니다.
	첫번째 값은 상품코드
	두번째 값은 상품명
	세번째 값은 상품가격입니다.
	사용자가 상품을 선택합니다. 선택한 상품은 장바구니 배열로 추가 되어야 하며
	사용자가 선택한 상품 총 금액을 출력하시면 됩니다.
	단, 상품을 중복 입력할 수 있으며, 장바구니는 최대 6개까지 담을 수 있습니다.
	 */
	public static void main(String[] args) {
		ob4 b = new ob4();
		b.oob4();
		
	}
}
class ob4{
	Object data[][];
	ArrayList<Object[]> al;
	ArrayList<Object[]> basket = new ArrayList<>();
	public void oob4() {
		this.data = new Object[][]{
			{1,"니베아 데오드란트",35000},
			{2,"파스퇴르 바른목장",17000},
			{3,"해남 꿀고구마",15300},
			{4,"프리미엄 생 칵테일 새우",22370},
			{5,"쉬슬러 고농축 액체세제",16620},
			{6,"믹시 삐삐 미니캐리어",99500}
		};
		this.al = new ArrayList<>(Arrays.asList(data));
		System.out.println("상품을 선택해주세요.(7선택시 종료)");
		int w = 0;
		while(w < this.al.size()) {
			System.out.println(Arrays.toString(this.al.get(w)));
			w++;
		}

			int count = 0;
			int sum = 0;
			while(true) {
				try {
				Scanner sc = new Scanner(System.in);
				int select = sc.nextInt();
					if(select == 7) {
						break;
					}
					else if(select == (int)this.al.get(select-1)[0]) {
						basket.add(this.al.get(select-1));
						sum += (int)this.al.get(select-1)[2];
						count++;
					}
					int ea = basket.size();
					if(ea == 6) {
						break;
					}
				}
				catch (Exception e) {
					System.out.println("상품번호를 입력해주세요.");
					continue;
				}
			}
			
			//DecimalFormat df = new DecimalFormat("###,###");
			System.out.printf("총 상품갯수는 %d이며, 총 가격은 %d원 입니다.\n",count,sum);
			int ww = 0;
			while(ww < basket.size()) {
				System.out.println(basket.get(ww)[1]);
				ww++;
			}
	}

}




