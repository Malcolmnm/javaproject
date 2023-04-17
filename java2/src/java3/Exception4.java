package java3;
//예외처리 응용편 2
/*
	"hong3000"
	"park1250"
	"kang852"
	"kim1819"
	"lee5117"
	전체 포인트 합계를 출력하는 프로세서를 구축하시오.
*/
public class Exception4 {

	public static void main(String[] args) {
		String arr[] = {"hong3000", "park1250", "kang852", "kim1819", "lee5117"};
		ex i = new ex();
		try {
				i.ex1(arr);
		}
		catch (Exception e) {
			e.getMessage();
		}
		finally {
			String rarr[] = new String[arr.length];
			try {
			int ww = 0;
			while(ww < arr.length){
				rarr[ww] = arr[ww].replaceAll("[A-z]", "");
				ww++;
				}
			i.ex1(rarr);
			}
			catch (Exception e) {
				if(e.getMessage()!=null) {
					System.out.println(e);
				}
			}
		}
	}

}
class ex{
	public void ex1(String data[]) throws Exception{
		int w = 0;
		int sum = 0;
		while(w < data.length) {
			sum += Integer.valueOf(data[w]);
			w++;
		}
		System.out.println(sum);
		Exception a = new Exception();
		throw a;
	}
}