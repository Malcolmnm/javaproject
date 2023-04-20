package Network;

public class Thread3 {
//멀티 스레드 간편 코드양식
	public static void main(String[] args) {
		Thread t = new cpus();
		t.start();
		
		Runnable r = new amds();
		Thread t2 = new Thread(r);
		t2.start();
		
		int a = 1;
		int sum = 0;
		do {
			sum += a;
			System.out.println(sum + " 1번공장데이터");
			a++;
		}while(a <= 10);
	}

}
//interface
class amds implements Runnable{
	@Override
	public void run() {
		int a = 1;
		int sum = 0;
		do {
			sum += a;
			System.out.println(sum + " 3번공장데이터");
			a++;
		}while(a <= 10);
	}
}


//extends
class cpus extends Thread{
	@Override
	public void run() {
		int a = 1;
		int sum = 0;
		do {
			sum += a;
			System.out.println(sum + " 2번공장데이터");
			a++;
		}while(a <= 10);
	}
}
	