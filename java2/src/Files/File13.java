package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class File13 {
	//파일 생성
	public static void main(String[] args) {
		try{
		File fi = new File("E:\\git_java\\javaproject\\java2\\src\\Files\\abc.txt");
		//System.out.println(fi.exists());
		if(fi.exists()==false) { //해당 경로에 파일 유/무 체크
			fi.createNewFile(); //파일 생성
		}
		String data = "홍길동"; //데이터
		OutputStream os = new FileOutputStream(fi); //파일 저장경로
		byte[] b = data.getBytes(); //데이터를 바이트단위로 생성함
		os.write(b); //파일에 쓰기
		os.flush(); //메모리 초기화
		os.close(); //파일 닫기
		}
		catch (Exception e) {}
	}

}
