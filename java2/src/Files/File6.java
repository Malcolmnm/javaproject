package Files;

import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.Scanner;

public class File6 {

	public static void main(String[] args) {
		notice n = new notice();
		try {
		n.view();
		}
		catch (Exception e) {
			System.out.println("메소드 함수 오류");
		}
	}
}
//Scanner + FileReader 응용
class notice{
	FileReader fr = null;
	Scanner sc = null;
	public void view() throws Exception{
		this.fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt",Charset.forName("UTF8"));
		//해당 Scanner에 파일 내용을 모두 적용시킴
		//System.in : 직접입력, System.out : 출력파트
		this.sc = new Scanner(this.fr);
		while(this.sc.hasNext()) { //파일에 사용된 라인갯수 만큼 반복
		System.out.println(this.sc.nextLine());
		}
		this.sc.close();
		this.fr.close();
	}
}