package FirstGUI;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContainerLayout extends JFrame {

	Container ct;// 2
	JButton btn01, btn02, btn03, btn04, btn05;

	public ContainerLayout() {
		this.setTitle("������ â �����");// 3
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// 4
		ct = this.getContentPane();// 5
		this.setLocation(100, 100);// â�� �ʱ� ��ġ ����

		btn01 = new JButton("ù ��° ��ư");
		btn02 = new JButton("�� ��° ��ư");
		btn03 = new JButton("�� ��° ��ư");
		btn04 = new JButton("�� ��° ��ư");
		btn05 = new JButton("�ټ� ��° ��ư");

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
