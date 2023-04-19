package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Net5 {
	//socket 통신 : Server, Client : 양방향
	//HTTP통신 : Image, 동영상, 음악 사용자(요청)에 맞춰서 송수신 통신 (단방향)\
	
	//양방향 : 자동 업데이트
	public static void main(String[] args) {
		System.out.println("Server Connect");
		int port = 9001;
		try {
			ServerSocket ss = new ServerSocket(port); //오픈시킬 포트를 적용
			while(true) {
				System.out.println("연결 대기중...");
				Socket sc = ss.accept(); //accept : 클라이언트가 들어오는 것을 대기 하는 역할을 하게됨
				System.out.println("준승통신 : 통신 연결 성공");
				
				//Server에서 Client로 받는 통로
				InputStream is = sc.getInputStream();
				
				//Client로 보내는 통로
				OutputStream os = sc.getOutputStream();
				
				//Client에서 받는 텍스트를 byte로 받음
				byte data[] = new byte[1024];
				int n = is.read(data); //해당 값을 읽어드림
				//문자 자료형 변환
				String msgclient = new String(data,0,n);
				//출력
				System.out.println(msgclient);
				
				//클라이언트로 메세지 전송
				String aws = "반갑워요~"; //서버에서 보내는 메세지
				os.write(aws.getBytes()); //클라이언트로 보내기 위한 메모리 저장
				
				os.flush();
				os.close();
				is.close();
				sc.close();
			}
		}
		catch (Exception e) {System.out.println("Server Connect error!!");}
	}

}
