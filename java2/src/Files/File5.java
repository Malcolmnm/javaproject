package Files;

import java.io.FileWriter;
import java.util.Scanner;

//user.txt라는 파일에 다음고 같이 저장 되도록 코드를 작성하시오.
/*
 사용자 아이디를 입력하세요.
 총 5번의 질문을 물어보며, 사용자가 직접 입력합니다.
 사용자가 입력한 내용은 user.txt에 남아 있어야합니다.
*/
public class File5 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		//true를 안쓰는 이유는 반복문 안에 적용시에만 true필요
		FileWriter fw = new FileWriter("E:\\git_java\\javaproject\\java2\\src\\Files\\user.txt");
		int w = 1;
		while(w < 6) {
			System.out.println("질문" + w);
			String as = sc.next();
			fw.write(w +"."+as+"\n");
			w++;
		}
		sc.close();
		fw.close();
	}

}
