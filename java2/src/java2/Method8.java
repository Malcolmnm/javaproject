package java2;

import java.util.Arrays;
import java.util.Base64;

//setter 및 getter
public class Method8 {

	public static void main(String[] args) {
		apple2 ap  = new apple2();
		ap.userinfo(); //setter실행
		ap.myinfo(); //getter실행
	}
}
class apple1{
	private String userid = "";
	private String userpw = "";
	private String userpw2 = "";
	private String useremail = "";
	//setter : 데이터를 변수에 할당하는 작업
	public void userinfo(){
		this.userid="kim";
		this.userpw="a123456";
		//Base64.getEncorder() : 문자를 특수 형태의 문법으로 인코딩 하는것을 말함
		this.userpw2 = Base64.getEncoder().encodeToString(this.userpw.getBytes());
		this.useremail = "kim@naver.com";
	}
	//getter : 데이터를 내보내는 작업
	public String[] user() {
		String data[] = new String[3];
		data[0]= this.userid;
		data[1]= this.userpw2;
		data[2]= this.useremail;
		return data;
	}
}
class apple2 extends apple1{ //상속
	public void myinfo(){
		String list[] = this.user();
		System.out.println(Arrays.toString(list));
	}
}