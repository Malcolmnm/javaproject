package Files;

import java.io.FileInputStream;
import java.io.InputStream;

public class File12 {
	//Stream을 이용한 파일로드
	public static void main(String[] args) {
		try {
			filein fi = new filein();
			fi.fileload();
		}
		catch (Exception e) {System.out.println("메소드 통신오류");}
	}

}
class filein{
	InputStream is = null;
	public void fileload() throws Exception{
		this.is = new FileInputStream("E:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt");
		//available() : 파일의 용량 크기를 확인 할 수 있습니다. (byte 단위)
		//System.out.println(is.available());
		
		//byte 배열 값을 해당 파일 로드한 크기와 동일하게 생성하라는 뜻.
		byte temp[] = new byte[is.available()];
		//byte temp[] = new byte[1024*16];
		int ea = this.is.read(temp);
		System.out.println(ea);
		String data = new String(temp);
		//String data = new String(temp, 0, this.is.read(temp));
		System.out.println(data);
	}
}