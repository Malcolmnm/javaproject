package project1;

import java.util.ArrayList;
import java.util.Scanner;


public class Example3 {
	/*
		사용자가 8명 있습니다.
		각각의 사용자에게 포인트를 주어야 합니다. 다음 결과와 같이 나오도록 코드를 작성하시오.
	 	customer data : 서울 경기도 인천 대전 충북 충남 전북 전남
	 	"서울 님에게 포인트를 추가 하시겠습니까?"
	 	...
	 	"전남 님에게 포인트를 추가 하시겠습니까?"
	 	무조건 숫자를 입력하며 숫자 외에 입력시 "포인트는 숫자만 입력합니다." 출력
	 	단, 인천님 포인트 입력시 문자를 사용하여 오류 발생이 되면 다시 "인천님에게 포인트를 추가 하시겠습니까?"라는 질문이 나와야합니다.
	 	최종 결과정보
	 	서울 : 500
	 	경기도 : 300
	 	...
	 	
	*/

	public static void main(String[] args) {
		Ex3 e = new Ex3();
		e.Exx3();
	}

}
class Ex3{
	public String data[] = {"서울", "경기도", "인천", "대전", "충북", "충남", "전북", "전남"};
	ArrayList<Integer> al = new ArrayList<>();
	int w = 0;
	int count = 0;
	public void Exx3() {
		while(w < this.data.length) {
			count++;
			System.out.printf("%s 님에게 포인트를 추가하시겠습니까?",this.data[w]);
			int select = EEx3(w);
			al.add(select);
			w++;
		}
		int ww = 0;
		while(ww < this.data.length) {
			System.out.printf("%s : %d\n",this.data[ww],al.get(ww));
			ww++;
		}
	}
	
	public int EEx3(int c) {
		Scanner sc = new Scanner(System.in);
		try {
		int a = sc.nextInt();
		if(a <1) {
			System.out.println("포인트는 1이상입니다.");
			sc.close();
			EEx3(c);
		}
		return a;
		}
		catch (Exception e) {
			System.out.println("포인트는 숫자만 입력합니다.");
			System.out.printf("%s 님에게 포인트를 추가하시겠습니까?",this.data[c]);
			return EEx3(c);
		}
				
	}
	
}