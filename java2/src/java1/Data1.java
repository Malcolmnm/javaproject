package java1;

//해당 파일은 실행권한이 없음 Class_array1.java에서 실행 해야ㅐ함
public class Data1 {
	// 전역 배열변수로 작성
	String[] user = { "hong", "kim", "park" };
	int number = 0;

	public void userlist() {
		// String user[] = {"hong","kim", "park"}; 둘다 됨
		this.number = 100;
		// 반복문으로 배열값 출력
		int w = 0;
		while (w < 3) {
			System.out.println(user[w]);
			w++;
		}
	}
}
