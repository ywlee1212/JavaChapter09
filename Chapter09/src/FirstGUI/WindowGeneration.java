package FirstGUI;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowGeneration extends JFrame {

	Container ct;// 2 

	public WindowGeneration() {
		this.setTitle("������ â �����");// 3
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// 4
		ct = this.getContentPane();// 5
		this.setLocation(100, 100);// â�� �ʱ� ��ġ ����
		
		 

		this.setSize(800, 600);// 6
		this.setVisible(true);// 7
	}

	public static void main(String[] args) {
		new WindowGeneration();// 1
	}

}
