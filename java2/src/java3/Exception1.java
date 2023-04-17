package java3;
//예외처리 : I/O(Input % Output) 사용시 무조건 필수로 적용하게 됩니다.
public class Exception1 {

	public static void main(String[] args) {
		int a;
		String b = "a1";
		try { //(1) : 해당 변수값을 숫자 자료형으로 변환
			a = Integer.valueOf(b); //문자 a로 인하여 오류발생
			
			//try에서 문제 발생시 해당 문법은 작동하지 않음.
			int sum = 10 + 20;
			System.out.println(sum);
		}
		catch (Exception e) { //(2) : 오류발생시 실행 되는 문법
			System.out.println("숫자로 변환되지 않습니다.");
			//(3) 어떤 부분에서 문제가 발생하는지를 체크
		}
		finally {//(4)try에서 문제가 발생한 사항을 수정 후 재실행
			b = b.replaceAll("[A-z]", "");
			a = Integer.valueOf(b);
		}
		System.out.println(a); //(5) 최종 결과값 출력
	}

}
