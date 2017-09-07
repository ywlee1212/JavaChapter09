package OpenChallenge;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Page488 extends JFrame {

	Container ct;
	JPanel upper, center;
	JButton open, read, close;
	JLabel hello, love, java;
	ImageIcon javaImage;

	int winWidth = 400, winHeight = 400;
	int centerWidth, centerHeight;

	public Page488() {
		this.setTitle("간단한 스윙 응용프로그램 만들기");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		ct = this.getContentPane();

		upper = new JPanel();
//		center = new JPanel();
		center=new MyPanel();
	

		upper.setBackground(new Color(186, 189, 186));// BD,BA,BD
		open = new JButton("Open");
		read = new JButton("Read");
		close = new JButton("Close");

		javaImage = new ImageIcon("images/ywleejava.png");
		int iw = javaImage.getIconWidth();
		int ih = javaImage.getIconHeight();

		center.setLayout(null);

		hello = new JLabel("Hello");
		hello.setBounds(0, 0, 50, 30);
		hello.setBackground(Color.BLUE);
		hello.setOpaque(true);
		hello.setForeground(Color.WHITE);
		hello.setHorizontalAlignment(JLabel.CENTER);// 위치 정리

		love = new JLabel("Love");
		love.setBounds(200, 150, 50, 30);
		java = new JLabel(javaImage);
		java.setBounds(50, 200, iw, ih);// image size : (100,106)

		center.add(hello);
		center.add(love);
		center.add(java);

		upper.add(open);
		upper.add(read);
		upper.add(close);

		ct.add(upper, BorderLayout.NORTH);
		ct.add(center, BorderLayout.CENTER);

		myDrawLine();

		this.setSize(winWidth, winHeight);
		this.setVisible(true);
	}

	private void myDrawLine() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new Page488();
	}

	class MyPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.GRAY);
			centerWidth=center.getWidth();
			centerHeight=center.getHeight();
			
			for (int i = 0; i < 41; i++) {
				if(i%10==0) {
					g.setColor(Color.RED);
				}else {
					g.setColor(Color.GRAY);
				}
				g.drawLine(0, i * 10, winWidth, i*10);
				g.drawLine(i*10,0, i*10, winHeight);
				
			}
			g.setColor(Color.BLACK);
			g.setFont(new Font("고딕",Font.BOLD, 20));
			g.drawString("화면 크기 : ("+Integer.toString(centerWidth)+",", 0, 50);
			g.drawString(Integer.toString(centerHeight)+")",160, 50);
		}
	}

}
