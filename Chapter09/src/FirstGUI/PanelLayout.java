package FirstGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelLayout extends JFrame {

	Container ct;// 2
	JPanel jp01, jp02, jp03;
	JButton btn01, btn02, btn03, btn04, btn05;

	public PanelLayout() {
		this.setTitle("윈도우 창 만들기");// 3
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// 4
		ct = this.getContentPane();// 5
		this.setLocation(100, 100);// 창의 초기 위치 결정
		
		jp01=new JPanel();
		jp01.setBackground(Color.BLUE);
		
		jp02=new JPanel();
		jp02.setBackground(Color.RED);
		
		jp03=new JPanel();
		jp03.setBackground(Color.YELLOW);
		
		ct.add(jp01, BorderLayout.WEST);
		ct.add(jp02, BorderLayout.EAST);
		ct.add(jp03, BorderLayout.CENTER);
		
		btn01 = new JButton("첫 번째 버튼");
		btn02 = new JButton("두 번째 버튼");
		btn03 = new JButton("세 번째 버튼");
		btn04 = new JButton("네 번째 버튼");
		btn05 = new JButton("다섯 번째 버튼");
		
		jp03.add(btn01);
		jp03.add(btn02);
		jp03.add(btn03);
		jp03.add(btn04);
		jp03.add(btn05); 

		this.setSize(800, 600);// 6
		this.setVisible(true);// 7
	}

	public static void main(String[] args) {
		new PanelLayout();// 1
	}
}
