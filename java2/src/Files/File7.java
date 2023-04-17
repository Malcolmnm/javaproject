package Files;

import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class File7 {

	public static void main(String[] args) {
		try {
		F7 f = new F7();
		f.FF7();
		}
		catch (Exception e) {
			System.out.println("메소드 통신오류");
		}
	}

}
class F7{
	FileReader fr = null;
	Scanner sc = null;
	ArrayList<ArrayList<String>> all = new ArrayList<>();
	public void FF7() throws Exception{
		this.fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\member.txt");
		this.sc = new Scanner(this.fr);
		while(this.sc.hasNext()) {
		String data[] = this.sc.nextLine().split(",");
		ArrayList<String> ar1 = new ArrayList<>(Arrays.asList(data));
		all.add(ar1);
		}		
		System.out.println(all);
	}
}