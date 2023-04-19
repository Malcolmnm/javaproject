package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class File17 {
//이미지 용량제한 체크 프로세서 만들기
	/*
	 이미지 업로드 할 수 있는 최대 용량은 1MB 이하 입니다.
	 1MB 이상 파일을 업로드시 "이미지 제한 용량은 1MB 이하 가지 입니다."라는
	 메세지를 출력 단 정상적인 1MB 이하라면 e:memo에 이미지 복사되도록 함.
	 */
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("원하는 사진을 고르세요.");
			String data = sc.next().intern();
			InputStream is = new FileInputStream("E:\\memo\\"+ data);
			if(is.available() > 1048576) {
				System.out.println("1MB이하만 가능합니다.");
			}
			else {
				/*
				 BufferedInputStream bs = new BufferedInputStream(is);
				 byte img[] = new byte[bs.available()];
				 int total = bs.read(img);
				 os.write(total); 
				 */
				byte img[] = new byte[is.available()/100];
				OutputStream os = new FileOutputStream("E:\\memo\\onlovehani.jpg");
			
				int imgs = 0;
				while(true) {
					imgs = is.read(img);
					if(imgs == -1) {
						break;
					}
					else {
						os.write(img,0,imgs);
					}
			}
				System.out.println("복사완료 되었습니다.");
				os.close();
			}
				sc.close();	
				is.close();
		}
		catch (Exception e) {
			
		}
	}

}
