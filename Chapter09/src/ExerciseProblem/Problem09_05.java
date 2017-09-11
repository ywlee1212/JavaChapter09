package ExerciseProblem;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;

public class Problem09_05 extends JFrame {

	Container ct;
	JLabel[] jlbl = new JLabel[16];

	Color[] color = { Color.red, Color.orange, Color.yellow, Color.GREEN, Color.cyan, Color.BLUE, Color.magenta,
			Color.GRAY, Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.darkGray, Color.black, Color.yellow,
			Color.blue, Color.MAGENTA };
	String[] text = { "Red", "Orange", "Yellow", "Green", "Cyan", "Blue", "Magenta", "Gray", "Pink", "LightGray",
			"White", "DarkGray", "Black", "Yellow", "Blue", "Magenta" };

	public Problem09_05() {
		this.setTitle("실전문제 5번");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ct = this.getContentPane();
		ct.setLayout(new GridLayout(4, 4, 5, 5));

		for (int i = 0; i < jlbl.length; i++) {
			jlbl[i] = new JLabel(text[i]);
			jlbl[i].setBackground(color[i]);
			jlbl[i].setOpaque(true);
			jlbl[i].setHorizontalAlignment(JLabel.CENTER);
			ct.add(jlbl[i]);
		}

		this.setSize(500, 250);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Problem09_05();
	}

}
