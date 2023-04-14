package java2;

import java.util.Arrays;

public class Method2 {
	//return 값을 이용한 메소드
	public static void main(String[] args) {
		test2 t = new test2();
		
		//1개 이상의 데이터를 split로 return 데이터이관
		String data1 = t.userinfo1();
		String info[] = data1.split(",");
		System.out.println(Arrays.toString(info));
		
		//배열로 해당 값을 모두 받아서 처리
		String[] data2 = t.userinfo2();
		System.out.println(Arrays.toString(data2));
	}
}

class test2{
	String user_name = "홍길동";
	String user_id = "hong";
	
	public String userinfo1() {
		String userinfo = user_name + "," + user_id;
		return userinfo;
	}
	
	public String[] userinfo2() {
		String userinfo2[] = {user_name,user_id};
		return userinfo2;
	}
}