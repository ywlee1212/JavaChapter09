package ExerciseProblem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Problem09_06 extends JFrame {

	Container ct;
	JLabel[] jlabel = new JLabel[20];
	JPanel bound;
	int winWidth = 350;
	int winHeight = 350;
	int jlabelWidth = 10;
	int jlabelHeight = 10;

	int locationX, locationY;
	Font fnt = new Font("Times", Font.BOLD, 8);

	public Problem09_06() {
		this.setTitle("9장 실습문제 6번");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ct = this.getContentPane();
		// ct.setLayout(null);
		bound = new MyPanel();
		bound.setLayout(null);
		ct.add(bound, BorderLayout.CENTER);

		for (int i = 0; i < jlabel.length; i++) {
			jlabel[i] = new JLabel(Integer.toString(i));
			jlabel[i].setFont(fnt);
			jlabel[i].setForeground(
					new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
			jlabel[i].setBackground(
					new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
			jlabel[i].setOpaque(true);
			jlabel[i].setHorizontalAlignment(JLabel.CENTER);
			locationX = (int) (Math.random() * 200) + 50;
			locationY = (int) (Math.random() * 200) + 50;
			jlabel[i].setBounds(locationX, locationY, jlabelWidth, jlabelHeight);
			bound.add(jlabel[i]);
		}

		this.setSize(winWidth, winHeight);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Problem09_06();
	}

	class MyPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawRect(50, 50, 210, 210);
		}
	}

}
