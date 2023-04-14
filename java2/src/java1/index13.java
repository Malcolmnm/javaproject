package java1;

import java.text.SimpleDateFormat;
import java.util.*;
//import 비슷한 구조일경우 뒷부분만 *처리로 모든 임포트를 가져올 수 있다.
public class index13 {
	//JAVA : OOP (객체지향언어), Javascript : OOP 스크립팅 언어
	public static void main(String[] args) {
		//날짜 출력 형태
		Date today = new Date(); 
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("YYYY-MM-dd");
		SimpleDateFormat time = new SimpleDateFormat("h:m:s");		
		SimpleDateFormat datetime = new SimpleDateFormat("YYYY-MM-dd HH:mm:s");
		//a : 오전 오후 표시
		SimpleDateFormat time2 = new SimpleDateFormat("a h:m:s");		
		
		//format() : 규격화된 형태로 값을 표현할 때 사용하게 됩니다.
		System.out.println(date.format(today));
		System.out.println(time.format(today));
		System.out.println(datetime.format(today));
		System.out.println(time2.format(today));
		
	}

}
