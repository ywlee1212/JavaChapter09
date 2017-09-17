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

	ImageIcon onDown = new ImageIcon("Chapter09/images/ywlee버튼-다운로드.png");
	ImageIcon onSign = new ImageIcon("Chapter09/images/ywlee버튼-사인업.png");
	ImageIcon onCreative = new ImageIcon("Chapter09/images/ywlee버튼-크리에이트.png");
	ImageIcon onHelp = new ImageIcon("Chapter09/images/ywlee버튼-헬프.png");

	public LayoutDrill() {
		// TODO Auto-generated constructor stub
		this.setTitle("레이아웃 연습_96017_이양원");
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
