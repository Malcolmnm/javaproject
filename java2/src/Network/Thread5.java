package Network;

public class Thread5 {
	//멀티 쓰레드 응용편
	/*
	 응용문제1. 멅리 쓰레드를 이용하여 각가의 구구단을 출력하는 프로세서를 제작하시오.
	 첫번재 쓰레드에는 구구단 5단, 두번째 쓰레드에는 구구단 9단
	 */
	
	static int a = 5;
	static int b = 9;
	
	public static void main(String[] args) throws Exception{
		Thread th2 = new gugu9();
		th2.start();
		
		Thread th = new gugu5();
		th.start();
	}

}
class gugu5 extends Thread{
	@Override
	public void run() {
		int w = 1;
		while(w <= 9) {
			System.out.printf("%d * %d = %d\n",Thread5.a,w,(Thread5.a * w));
			w++;	
		}
	}	
}

class gugu9 extends Thread{
	@Override
	public void run() {
		int w = 1;
		while(w <= 9) {
			System.out.printf("%d * %d = %d\n",Thread5.b,w,(Thread5.b * w));
			w++;	
		}
	}
}