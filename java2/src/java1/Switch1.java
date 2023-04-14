package java1;

public class Switch1 {

	public static void main(String[] args) {
		int a = 10;
		switch(a) {
		case 1:
		case 10: //멀티 케이스.
			System.out.println("옵션 1을 선택");
		break;
		case 2:
			System.out.println("옵션 2을 선택");
		break;
		case 3:
			System.out.println("옵션 3을 선택");
		break;
		default:
			System.out.println("잘못 입력했음.");
		break;
		}

	}

}
