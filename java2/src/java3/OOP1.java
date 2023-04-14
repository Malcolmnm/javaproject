package java3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OOP1 {
	Scanner sc;
	
	//List, ArrayList, LinkedList, Map(Key)
	public static void main(String[] args) {
		/*
			응용문제1. 사용자가 입금을 처리하게 됩니다. 총 8번의 횟수 금액을 입력하게 되며,
			모든 입금이 완료 되었을 경우 최종 합계 금액을 출력시키는 프로세서를 구축하시오.
			예시) 입금할 금액을 적으세요.
				 최종 입금금액 : ~~원
		*/
		OOP1 op1 = new OOP1();
		List<Integer> arr =  new ArrayList<>(1);
		int sum = 0;
		while(true) {
			try {
				op1.sc = new Scanner(System.in);
				System.out.println("입력할 금액을 적으세요.");
				int number = op1.sc.nextInt();
				arr.add(number);
				sum += number;
				if(arr.size()==8) {
					DecimalFormat df = new DecimalFormat("###,###");
					System.out.println("최종 입금금액 : " + df.format(sum));
					System.out.println(arr);
					break;
				}
			}
			catch (Exception e) {
					System.out.println("숫자만 입력하세요.");
					continue;
				}
			}					
		op1.sc.close();
		}
	}

