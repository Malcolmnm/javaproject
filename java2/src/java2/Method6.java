package java2;

public class Method6 {
	//배열 데이터를 이용하여 홀수 값에 대한 총 갯수 받기(응용)
	public static void main(String[] args) {
		mysql m = new mysql();
		String number = m.check("홀수");
		System.out.printf("총 갯수는 %s 입니다",number);
	}

}
// data내용 15 22 17 14 32 35 19 33
class mysql{
	/*
	  응용문제3. 협업 프로그래머가 해당 DB(Database)에 값 중 홀수값에 대한 총 갯수를 받고자 합니다.
	  해당 갯수를 출력 될 수 있도록 코드를 작성하시오.
	*/
	private int data[] = {15,22,17,14,32,35,19,33};
	
	public String check(String a) {
		int w = 0;
		int count = 0;
		while(w < this.data.length) {
			if(this.data[w]%2==1) {
				count++;
			}
			w++;
		}
		String b = Integer.toString(count);
		return b;
	}
	
	
	
}
