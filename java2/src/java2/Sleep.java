package java2;

public class Sleep {

	public static void main(String[] args) {
		try {
			//Thread??? 프로세스가 실질적으로 작업하는 단위를 말함
			int w = 0;
			while(w<101) {
				Thread.sleep(500);//1초에 한번 식 반복하는 형태
				System.out.println(w);
				w++;
			}
		}
		catch (Exception e) {
			
		}
	}

}
