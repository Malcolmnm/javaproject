package java2;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Awt1 {
	//java => awt, swing(GUI)
	//awt 생성방식
	/*
	 Frame -> Panel ->Object(생성)
	 적용방식 : Object -> Panel -> Frame(적용)
	 */
	
	
	public static void main(String[] args) {
		Frame fr = new Frame();
		closepm cp = new closepm();
		fr.setTitle("사용자로그인"); //창 타이틀
		fr.setSize(500,500); //창 사이즈
		fr.setVisible(true); //사용 유무
		
		fr.addWindowListener(cp); //창닫기
		
		Panel p = new Panel(); //패널 생성
		//오브젝트 생성 파트
		Checkbox c1 = new Checkbox("auto login");
		TextField id = new TextField(10);
		Button btn = new Button("login");
		Button btn2 = new Button("close");
		Button btn3 = new Button("auto id");
		
		btn.setBackground(Color.blue);//배경 색상
		
		p.add(id); //add : 추가(패널에 오브젝트를 추가)
		p.add(btn3);
		p.add(btn);
		p.add(c1);
		p.add(btn2);
		fr.add(p); //프레임에 패널 추가
		
		//addActionListener : 버튼 클릭시 핸들링 메소드
		btn3.addActionListener(new ActionListener() {
			String userid = "hong";
			@Override
			public void actionPerformed(ActionEvent e) {
				//이벤트 발생
				id.setText(userid);//id이름을 가진 오브젝트 안에 값을 적용
			}
		});
		
		//닫기버튼
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}



class closepm extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) {
		super.windowClosing(e);
		System.out.println("프로그램 종료");
		System.exit(0);
	}
}