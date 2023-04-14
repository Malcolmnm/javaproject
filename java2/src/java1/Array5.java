package java1;

public class Array5 {

	public static void main(String[] args) {
		/*
			응용문제3. 배열데이터를 모두 합한 결과물을 출력하시요.
			15, 60, 11, 14, 27 => 127
		*/
		int a[] = {15,60,11,14,27};
		int sum = 0;
		int ea = a.length;
		int w = 0;
		/*
		 for in과 동일한 형태의 배열전용 반복문
		 	for(int f : a){
		 		sum += f;
		 	}
		 */
		while(w < ea) {
			sum += a[w];
			w++;
		}
		System.out.println(sum);
		
		String id[] = {"hong", "kim", "park", "lee", "jang", "jung"};
		//응용문제4. 아이디 데이터 중 4글자 이상인 아이디만 출력하시오.
		for(String f : id) {
			if(f.length() > 3) {
				System.out.println(f);
			}
		}
	}

}
