package calc220530;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SetMainFrame {
	
	public static void Set(Frame frame,String name,int x,int y,int width,int height) {
		frame.setTitle(name);//창 제목을 설정
		frame.setBounds(100,100,600,900);//창 크기를 설정
		frame.addWindowListener(new WindowAdapter() {   //윈도우 종료기능
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		frame.setVisible(true);
	}
	
}
