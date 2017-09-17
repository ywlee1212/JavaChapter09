package PreProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LayoutDrill extends JFrame {

	Container ct;
	JPanel north, south;
	JButton open, read, close;
	JButton help, download, sign, create;
	JLabel center;

	int width = 800, height = 700;

	ImageIcon onDown = new ImageIcon("Chapter09/images/ywlee��ư-�ٿ�ε�.png");
	ImageIcon onSign = new ImageIcon("Chapter09/images/ywlee��ư-���ξ�.png");
	ImageIcon onCreative = new ImageIcon("Chapter09/images/ywlee��ư-ũ������Ʈ.png");
	ImageIcon onHelp = new ImageIcon("Chapter09/images/ywlee��ư-����.png");

	public LayoutDrill() {
		// TODO Auto-generated constructor stub
		this.setTitle("���̾ƿ� ����_96017_�̾��");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		ct = this.getContentPane();
		north = new JPanel();
		north.setBackground(Color.gray);

		open = new JButton("Open");
		read = new JButton("Read");
		close = new JButton("Close");

		north.add(open);
		north.add(read);
		north.add(close);

		south = new JPanel();
		south.setBackground(Color.GRAY);
		help = new JButton(onHelp);
		sign = new JButton(onSign);
		create = new JButton(onCreative);
		download = new JButton(onDown);

		south.add(help);
		south.add(download);
		south.add(sign);
		south.add(create);

		ct.add(north, BorderLayout.NORTH);
		ct.add(south, BorderLayout.SOUTH);

		center = new JLabel("CENTER");
		center.setHorizontalAlignment(JLabel.CENTER);
		center.setVerticalAlignment(JLabel.CENTER);
		center.setOpaque(true);
		center.setBackground(Color.CYAN);
		ct.add(center, BorderLayout.CENTER);

		this.setSize(width, height);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LayoutDrill();
	}

}
