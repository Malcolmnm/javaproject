package java2;

import java.util.Arrays;
import java.util.Scanner;

public class Over2 {
	//메인 실행 class: Over1, method:userlist (String) 변수명:list
	public static void main(String[] args) {
		myinfo m = new myinfo();
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세용");
		String nm = sc.next();
		m.userlist(nm);
		sc.close();
	}

}
class myinfo extends Over1{
	int ea;
	@Override
	public void userlist(String username) {
		super.userlist(username);
		this.ea = this.list.length;
		int w = 0;
		while(w < this.ea) {
			if(this.list[w][0].equals(username)) {
				System.out.println(Arrays.toString(this.list[w]));
				break;
			}
			w++;
		}
	}
}