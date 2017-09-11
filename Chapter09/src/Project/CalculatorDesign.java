package Project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorDesign extends JFrame {
	Container ct;
	//test
	JPanel upper, lower;
	JButton on, mc, div, mul, add, sub, equal, mod, comma;
	JButton zero, one, two, three, four, five, six, seven, eight, nine;
	JTextField display;
	int displayHeight = 100;
	Font digit = new Font("Times", Font.BOLD, 60);
	Font btnDigit = new Font("고딕", Font.BOLD, 55);

	// Window Area
	int width = 660;
	int height = 700;

	// JPanel Size
	int upperHeight = 140;
	int lowerHeight = 560;

	// Button Size
	int btnWidth = 130;
	int btnHeight = 80;

	// Result Display Field
	int resWidth = 580;
	int resHeight = 100;

	// Gap and Margin
	int gap = 20;
	int margin = 40;

	public CalculatorDesign() {
		this.setTitle("프로젝트 : 계산기 틀 짜기");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		ct = this.getContentPane();
		ct.setLayout(null);

		upper = new JPanel();
		upper.setBackground(new Color(0, 131, 143));
		upper.setBounds(0, 0, width, upperHeight);
		upper.setLayout(null);

		lower = new JPanel();
		lower.setBounds(0, upperHeight + 1, width, lowerHeight);
		lower.setBackground(new Color(0, 172, 193));
		lower.setLayout(null);

		display = new JTextField("123456789012345", 15);
		display.setHorizontalAlignment(JTextField.RIGHT);
		display.setFont(digit);
		display.setBounds(margin, gap, resWidth, resHeight);
		display.setBackground(new Color(224, 224, 224));
		display.setCaretPosition(15); // 커서의 위치를 오른쪽으로 옮김
		display.setForeground(new Color(97, 97, 97));
		upper.add(display);

		btnGenerate();

		ct.add(upper);
		ct.add(lower);

		this.setSize(width + gap, height + margin + gap);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CalculatorDesign();
	}

	public void btnGenerate() {
		ImageIcon onImg = new ImageIcon("Chapter09/images/ON.png");
		on = new JButton(onImg);
		on.setBounds(margin, margin, btnWidth, btnHeight);
		lower.add(on);

		ImageIcon mcImg = new ImageIcon("Chapter09/images/MC.png");
		mc = new JButton(mcImg);
		mc.setBounds(margin + btnWidth + gap, margin, btnWidth, btnHeight);
		lower.add(mc);

		ImageIcon divImg = new ImageIcon("Chapter09/images/div.png");
		div = new JButton(divImg);
		div.setBounds(margin + btnWidth * 2 + gap * 2, margin, btnWidth, btnHeight);
		lower.add(div);

		ImageIcon mulImg = new ImageIcon("Chapter09/images/mul.png");
		mul = new JButton(mulImg);
		mul.setBounds(margin + btnWidth * 3 + gap * 3, margin, btnWidth, btnHeight);
		lower.add(mul);

		seven = new JButton("7");
		seven.setBounds(margin, margin + btnHeight + gap, btnWidth, btnHeight);
		seven.setFont(btnDigit);
		seven.setBackground(new Color(96, 96, 96));
		seven.setForeground(Color.WHITE);
		lower.add(seven);

		eight = new JButton("8");
		eight.setBounds(margin + btnWidth + gap, margin + btnHeight + gap, btnWidth, btnHeight);
		eight.setFont(btnDigit);
		eight.setBackground(new Color(96, 96, 96));
		eight.setForeground(Color.WHITE);
		lower.add(eight);

		nine = new JButton("9");
		nine.setBounds(margin + btnWidth * 2 + gap * 2, margin + btnHeight + gap, btnWidth, btnHeight);
		nine.setFont(btnDigit);
		nine.setBackground(new Color(96, 96, 96));
		nine.setForeground(Color.WHITE);
		lower.add(nine);

		ImageIcon addImg = new ImageIcon("Chapter09/images/add.png");
		add = new JButton(addImg);
		add.setBounds(margin + btnWidth * 3 + gap * 3, margin + btnHeight + gap, btnWidth, btnHeight);
		lower.add(add);

		four = new JButton("4");
		four.setBounds(margin, margin + btnHeight * 2 + gap * 2, btnWidth, btnHeight);
		four.setFont(btnDigit);
		four.setBackground(new Color(96, 96, 96));
		four.setForeground(Color.WHITE);
		lower.add(four);

		five = new JButton("5");
		five.setBounds(margin + btnWidth + gap, margin + btnHeight * 2 + gap * 2, btnWidth, btnHeight);
		five.setFont(btnDigit);
		five.setBackground(new Color(96, 96, 96));
		five.setForeground(Color.WHITE);
		lower.add(five);

		six = new JButton("6");
		six.setBounds(margin + btnWidth * 2 + gap * 2, margin + btnHeight * 2 + gap * 2, btnWidth, btnHeight);
		six.setFont(btnDigit);
		six.setBackground(new Color(96, 96, 96));
		six.setForeground(Color.WHITE);
		lower.add(six);

		ImageIcon subImg = new ImageIcon("Chapter09/images/sub.png");
		sub = new JButton(subImg);
		sub.setBounds(margin + btnWidth * 3 + gap * 3, margin + btnHeight * 2 + gap * 2, btnWidth, btnHeight);
		lower.add(sub);

		one = new JButton("1");
		one.setBounds(margin, margin + btnHeight * 3 + gap * 3, btnWidth, btnHeight);
		one.setFont(btnDigit);
		one.setBackground(new Color(96, 96, 96));
		one.setForeground(Color.WHITE);
		lower.add(one);

		two = new JButton("2");
		two.setBounds(margin + btnWidth + gap, margin + btnHeight * 3 + gap * 3, btnWidth, btnHeight);
		two.setFont(btnDigit);
		two.setBackground(new Color(96, 96, 96));
		two.setForeground(Color.WHITE);
		lower.add(two);

		three = new JButton("3");
		three.setBounds(margin + btnWidth * 2 + gap * 2, margin + btnHeight * 3 + gap * 3, btnWidth, btnHeight);
		three.setFont(btnDigit);
		three.setBackground(new Color(96, 96, 96));
		three.setForeground(Color.WHITE);
		lower.add(three);

		ImageIcon equalImg = new ImageIcon("Chapter09/images/equal.png");
		equal = new JButton(equalImg);
		equal.setBounds(margin + btnWidth * 3 + gap * 3, margin + btnHeight * 3 + gap * 3, btnWidth,
				btnHeight * 2 + gap);
		lower.add(equal);

		mod = new JButton("%");
		mod.setBounds(margin, margin + btnHeight * 4 + gap * 4, btnWidth, btnHeight);
		mod.setFont(btnDigit);
		mod.setBackground(new Color(96, 96, 96));
		mod.setForeground(Color.WHITE);
		lower.add(mod);

		zero = new JButton("0");
		zero.setBounds(margin + btnWidth + gap, margin + btnHeight * 4 + gap * 4, btnWidth, btnHeight);
		zero.setFont(btnDigit);
		zero.setBackground(new Color(96, 96, 96));
		zero.setForeground(Color.WHITE);
		lower.add(zero);

		comma = new JButton(",");
		comma.setBounds(margin + btnWidth * 2 + gap * 2, margin + btnHeight * 4 + gap * 4, btnWidth, btnHeight);
		comma.setFont(btnDigit);
		comma.setBackground(new Color(96, 96, 96));
		comma.setForeground(Color.WHITE);
		lower.add(comma);
	}
}
