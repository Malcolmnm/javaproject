package Files;

import java.io.FileReader;
import java.nio.charset.Charset;

public class File2 {
//Charset.forName("EUCKR") : 인코딩 언어셋을 변경할 때 사용합니다.
//단, 출력하는 형태 언어셋만 바꾸는 명령어임. 파일자체는 아님.
	public static void main(String[] args) {
		try {
		FileReader fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\agree.txt",Charset.forName("UTF-8"));
		System.out.println(fr.getEncoding()); //파일 인코딩 언어 확인
		System.out.println(fr.read()); //데이터 크기
		while(true) {
			int a = fr.read();
			System.out.println((char)a);
			if(a == -1) {
				break;
			}
		}
		fr.close(); //로드한 파일을 닫을때.
		}
		catch (Exception e) {
			System.out.println("파일 경로 실패");
		}
	}

}
