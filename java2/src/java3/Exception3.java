package java3;

import java.util.ArrayList;

public class Exception3 {

	public static void main(String[] args) {
		String data[] = {"2,000", "2,500", "3,000", "500", "4,500"};
		method2 mt = new method2();
		try {
		mt.total1_method(data);
		}
		catch (Exception e) {
			System.out.println("해당 데이터는 문자여서 합산이 안됩니다.");
		}
		finally {
			//원시 배열로 받을 경우 원시 배열값으로 보내야함
			//ArrayList, List, LinkedList, Map으로 할경우 일반 인자값으로 보내면 됨
			
			//ArrayList<String> rdata = new ArrayList<>(); 인자값으로 보내지 못함
			
			String rdata[] = new String[data.length];
			int j = 0;
			while(j < data.length) {
				rdata[j] = data[j].replaceAll(",", "");
				j++;
			}
			//다시 해당 메소드를 호출 시 try ~ catch를 적용 해야함
			try {
			mt.total1_method(rdata);
			}
			catch (Exception e) {
				//catch에는 sysout을 사용하지않음.
				e.getMessage(); //문제 발생시에만 출력됨
			}
		}
	}

}
class method2{
	public void total1_method(String db[]) throws Exception{
		int w = 0;
		int ea = db.length;
		int sum = 0;
		while(w < ea) {
			sum += Integer.valueOf(db[w]);
			w++;
		}
		System.out.println("총 합계는 "+ sum);
		Exception ex = new Exception();
		throw ex;
	}
}