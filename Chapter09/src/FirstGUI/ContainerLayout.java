package FirstGUI;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContainerLayout extends JFrame {

	Container ct;// 2
	JButton btn01, btn02, btn03, btn04, btn05;

	public ContainerLayout() {
		this.setTitle("윈도우 창 만들기");// 3
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// 4
		ct = this.getContentPane();// 5
		this.setLocation(100, 100);// 창의 초기 위치 결정

		btn01 = new JButton("첫 번째 버튼");
		btn02 = new JButton("두 번째 버튼");
		btn03 = new JButton("세 번째 버튼");
		btn04 = new JButton("네 번째 버튼");
		btn05 = new JButton("다섯 번째 버튼");

		ct.add(btn01, BorderLayout.SOUTH);
		ct.add(btn02, BorderLayout.NORTH);
		ct.add(btn03, BorderLayout.EAST);
		ct.add(btn04, BorderLayout.WEST);
		ct.add(btn05, BorderLayout.CENTER);

		this.setSize(800, 600);// 6
		this.setVisible(true);// 7
	}

	public static void main(String[] args) {
		new ContainerLayout();// 1
	}

}
