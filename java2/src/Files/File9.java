package Files;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class File9 {
	//파일 데이터를 배열로 전송 하기 io
	public static void main(String[] args) {
		try {
			filedata fd = new filedata();
			fd.addfile();
		}
		catch (Exception e) {
			System.out.println("메소드 호출 오류");
		}
	}

}
class filedata{
	//라이브러리 : io(기본 input,out만 사용), nio(버퍼를 활용하는 io 성능이 좋음)
	//nio2 = nio개선, File클래스를 보다 더 바르게 사용
	
	//Files.readAllLines : 파일 전체 모든 텍스트 라인을 읽어들임.
	//List(최상위), ArrayList(파생배열) (일반형식 배열)
	//단, LinkedList : 파일 전체 라인에 대한 배열값으로 적용하지 못함.
	ArrayList<String> data = null;
	
	LinkedList<String> data2 = null;
	public void addfile() throws Exception{
		//Paths.get : 파일 경로
		this.data = (ArrayList<String>)Files.readAllLines(Paths.get("E:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt"));
		System.out.println(data);

		this.data2 = new LinkedList<String>(Files.readAllLines(Paths.get("E:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt")));
		System.out.println(data2);
		
		//원시 배열로 처리 (byte단위) : 언어패킷을 사용하지 못함 1차배열로만 처리
		byte data3[] = Files.readAllBytes(Paths.get("E:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt"));
		System.out.println(new String(data3));
	}
}