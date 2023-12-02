import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListner {

	JFrame jf;
	public Calculator() {

		JFrame jf=new JFrame("calulator");
		jf.setLayout(null);
		jf.setSize(600,545);
		jf.setLocation(350,5);
		jf.setVisible(true);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel displayLabel=new JLabel("hello");
		displayLabel.setBounds(20,50 , 540, 40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		jf.add(displayLabel);
		
		JButton seven=new JButton("7");
		seven.setBounds(20,120 ,80, 80);
		
		
		seven.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(seven);
		
		JButton Eight=new JButton("8");
		Eight.setBounds(120,120 ,80, 80);
		Eight.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(Eight);
		
		JButton nine=new JButton("9");
		nine.setBounds(220,120 ,80, 80);
		nine.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(nine);
		
		JButton four=new JButton("4");
		four.setBounds(20,220 ,80, 80);
		four.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(four);
		
		JButton five=new JButton("4");
		five.setBounds(120,220 ,80, 80);
		five.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(five);
		
		JButton six=new JButton("6");
		six.setBounds(220,220 ,80, 80);
		six.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(six);
		
		JButton one=new JButton("1");
		one.setBounds(20,320 ,80, 80);
		one.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(one);
		
		JButton two=new JButton("2");
		two.setBounds(120,320 ,80, 80);
		two.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(two);
		
		JButton three=new JButton("3");
		three.setBounds(220,320 ,80, 80);
		three.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(three);
		
		JButton point=new JButton(".");
		point.setBounds(20,420 ,80, 80);
		point.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(point);
		
		JButton zero=new JButton("0");
		zero.setBounds(120,420 ,80, 80);
		zero.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(zero);
		
		JButton equalto=new JButton("=");
		equalto.setBounds(220,420 ,80, 80);
		equalto.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(equalto);
		
		JButton div=new JButton("/");
		div.setBounds(320,120 ,80, 80);
		div.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(div);
		
		JButton mul=new JButton("x");
		mul.setBounds(320,220 ,80, 80);
		mul.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(mul);
		
		JButton sub=new JButton("-");
		sub.setBounds(320,320 ,80, 80);
		sub.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(sub);
		
		JButton add=new JButton("+");
		add.setBounds(320,420 ,80, 80);
		add.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(add);
		
		
		
	}
	public static void main(String[] args) {
		
		new Calculator();
	}
	
	
}
