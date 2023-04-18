package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.nio.charset.Charset;

public class File8 {
	//BufferReader(output) - cpu 캐시메모리 임시저장
	//사용하는 이유 : 배열에 값을 빠르게 배분하여 활용 할 수 있도록 함.
	public static void main (String[] args) throws Exception{
		buffer bf = new buffer();
		bf.dataview();
	}

}
class buffer{
	FileReader fr = null;
	BufferedReader br = null;
	public void dataview() throws Exception{
		this.fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt",Charset.forName("UTF8"));
		this.br = new BufferedReader(fr);
		
		//파일 객체를 한번 인스턴스로 로드함
		this.fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt",Charset.forName("UTF8"));
		//buffered부분에 사용을 했으면 FileReader을 다시 선언해줘야함.
		//LineNumberReader : 새롭게 생성된 객체 인스턴스를 로드합니다.
		LineNumberReader li = new LineNumberReader(fr);
		int ea = 0;
		while(li.readLine()!= null) {
			ea = li.getLineNumber();
		}
		System.out.println(ea);
		li.close();
		//System.out.println(this.br.readLine());
		
		//조건문에 Buffered readLine 사용시 해당 첫번째 라인은 캐시메모리에서 삭제됨
		//Buffered는 무조건 한번 사용시 다음 라인으로 이동됩니다.
		/*if(this.br.readLine()!=null) {
			System.out.println(this.br.readLine());
		}*/
		
		String text = "";
		while((text = this.br.readLine())!=null) {
			System.out.println(text);
		}
	}
}

