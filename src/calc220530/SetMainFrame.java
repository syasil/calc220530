package calc220530;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SetMainFrame {
	
	public static void Set(Frame frame,String name,int x,int y,int width,int height) {
		frame.setTitle(name);//â ������ ����
		frame.setBounds(100,100,600,900);//â ũ�⸦ ����
		frame.addWindowListener(new WindowAdapter() {   //������ ������
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		frame.setVisible(true);
	}
	
}
