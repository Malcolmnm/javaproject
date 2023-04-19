package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Net6 {
	//Client 생성
	public static void main(String[] args) {
		try {
			System.out.println("Client 접속");
			String ip = "192.168.10.143";
			int port = 9001;
			Socket sk = new Socket(ip,port);
			
			//Client에서 Sever로 보내는 메세지
			String cmsg = "안녕하셈";
			
			//Client에서 Server로 보내는 통로 byte로 전송
			OutputStream os = sk.getOutputStream();
			os.write(cmsg.getBytes());
			os.flush();
			
			//Server에서 보낸 메세지를 Client가 받는 통로
			byte[] data = new byte[1024];
			InputStream is = sk.getInputStream();
			int n = is.read(data);
			String sm = new String(data,0,n);
			System.out.println(sm);
			sk.close();
			os.close();
		}
		catch (Exception e) {System.out.println("서버에 접근하지 못합니다.");}
	}

}
