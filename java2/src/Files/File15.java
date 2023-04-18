package Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File15 {
	//파일 처리
	public static void main(String[] args) {
		try {
			//사용자가 한글 이미지 파일명으로 업로드시 영문파일명으로 변경 저장
			//파일 복사 기능
			Path data1 = Paths.get("E:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt");
			Path data2 = Paths.get("E:\\git_java\\javaproject\\java2\\src\\Files\\notice2.txt");
			Files.copy(data1, data2);
			
			Path data3 = Paths.get("E:\\git_java\\javaproject\\java2\\src\\Files\\notice2.txt");
			Path directory = Paths.get("E:\\memo\\notice2.txt");
			Files.move(data3, directory);
			
			Path data4 = Paths.get("E:\\git_java\\javaproject\\java2\\src\\Files\\abc.txt");
			Files.delete(data4);
		}
		catch (Exception e) {}
		
	}

}
