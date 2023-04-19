package Network;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Net4 {

	public static void main(String[] args) {
		try {
		crawling2 cr = new crawling2();
		cr.creak();
		}
		catch (Exception e) {}
	}
}
class crawling2{
	Scanner sc = null;
	String url = "";
	URL urls = null;
	InputStream is = null;
	BufferedInputStream bs = null;
	
	public void creak() throws Exception{
		
		this.sc = new Scanner(System.in);
		System.out.println("크롤링 할 URL 주소를 입력하세요.(파일명 포함):");
		this.url = this.sc.nextLine();
		this.urls = new URL(this.url);
		URLConnection con = this.urls.openConnection();
		//통신에는 OpenStream만 사용
		this.is = this.urls.openStream();
		//bufferedinputStream 적용 후 byte 변환
		this.bs = new BufferedInputStream(this.is);
		byte[] code = new byte[1024];
		FileOutputStream fs = new FileOutputStream("E:\\memo\\test2.html",true);
		int z = 0;
		while((z=this.bs.read(code)) != -1) {
			//int 형태로write
			fs.write(code,0,z);
		}
		this.bs.close();
		fs.flush();
		fs.close();
		System.out.println("크롤링 완료");
		
	}
	
	
	
	
}