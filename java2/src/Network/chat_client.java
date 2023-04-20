package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class chat_client {
	//채팅 클라이언트
	public static void main(String[] args) {
		chat_cl ch = new chat_cl();
		ch.client();
	}

}
class chat_cl{
	private String ip = "192.168.10.143";
	private int port = 10001;
	Socket so = null;
	Scanner sc = null;
	InputStream is = null;
	OutputStream os = null;
	private String mid = "";
	private String msg = "";
	
	public void client() {
		int count = 0;
		String cms = "";
		try {
			this.sc = new Scanner(System.in);
			System.out.println("login id :");
			this.mid = this.sc.nextLine();
			while(true) {
				this.so = new Socket(this.ip, this.port);
				this.is = this.so.getInputStream();//서버에서 받아오는 메세지
				this.os = this.so.getOutputStream();//서버로 보내는 메세지
				if(count == 0) {
					this.msg = "[" + this.mid + "] Go in";
					this.os.write(this.msg.getBytes());
					this.os.flush();
				}
				//서버로 메세지 전송 코드
				else {
					this.sc = new Scanner(System.in);
					System.out.println("Message : ");
					cms = this.sc.nextLine();
				}
				if(cms.equals("exit")) {
						this.msg = "chatroom out";
						this.os.write(this.msg.getBytes());
						this.os.flush();
						//this.is.close();
						this.sc.close();
						this.is.close();
						this.sc.close();
						this.os.close();
						break;
			  }
			  else {
						this.msg = "[" + this.mid + "] : " + cms;
						this.os.write(this.msg.getBytes());
						this.os.flush();
				}
				
				count++;
				//서버로 메세지 전송코드
				
				
				
				//서버에서 메세지를 받는 코드
				byte msg[] = new byte[1024];
				int n = this.is.read(msg);
				String servertext = new String(msg,0,n);
				System.out.println(servertext);
				//서버에서 메세지를 받는코드
			}
			
		}
		catch (Exception e) {System.out.println("Server Connect Error!!");}
	}
	
	
	
}