import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	JFrame jf;
	JLabel displaylabel;
	JButton seven;
	JButton eight;
	JButton nine;
	JButton four;
	JButton five;
	JButton six;
	JButton one;
	JButton two;
	JButton three;
	JButton point;
	JButton zero;
	JButton equalto;
	JButton div; 
	JButton mul,clear;
	JButton sub;
	JButton addition;
	Calculator(){
		
	    jf=new JFrame("calulator");
		jf.setBounds(200, 40, 600, 550);
		jf.setLayout(null);
		jf.setVisible(true);
		
	    displaylabel=new JLabel();
		displaylabel.setBounds(20, 30, 560, 50);
		jf.add(displaylabel);
		displaylabel.setBackground(Color.gray);
		displaylabel.setOpaque(true);
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displaylabel.setForeground(Color.white);
		
		
		seven=new JButton("7");
		seven.setBounds(20, 90, 80, 80);
		seven.addActionListener(this);
		seven.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(seven);
		
		eight=new JButton("8");
		eight.setBounds(120, 90, 80, 80);
		eight.setFont(new Font("Arial", Font.PLAIN, 40));
		eight.addActionListener(this);
		jf.add(eight);
		
		nine=new JButton("9");
		nine.setBounds(220, 90, 80, 80);
		nine.setFont(new Font("Arial", Font.PLAIN, 40));
		nine.addActionListener(this);
		jf.add(nine);
		
		four=new JButton("4");
		four.setBounds(20, 190, 80, 80);
		four.setFont(new Font("Arial", Font.PLAIN, 40));
		four.addActionListener(this);
		jf.add(four);
		
		five=new JButton("5");
		five.setBounds(120, 190, 80, 80);
		five.setFont(new Font("Arial", Font.PLAIN, 40));
		five.addActionListener(this);
		jf.add(five);
		
		six=new JButton("6");
		six.setBounds(220, 190, 80, 80);
		six.setFont(new Font("Arial", Font.PLAIN, 40));
		six.addActionListener(this);
		jf.add(six);
		
		one=new JButton("1");
		one.setBounds(20, 290, 80,80 );
		one.setFont(new Font("Arial", Font.PLAIN, 40));
		one.addActionListener(this);
		jf.add(one);
		
		two=new JButton("2");
		two.setBounds(120, 290, 80,80 );
		two.setFont(new Font("Arial", Font.PLAIN, 40));
		two.addActionListener(this);
		jf.add(two);
		
		three=new JButton("3");
		three.setBounds(220, 290, 80,80 );
		three.setFont(new Font("Arial", Font.PLAIN, 40));
		three.addActionListener(this);
		jf.add(three);
		
		point=new JButton(".");
		point.setBounds(20,390 ,80, 80);
		point.setFont(new Font("Arial", Font.PLAIN, 40));
		point.addActionListener(this);
		jf.add(point);
		
		zero=new JButton("0");
		zero.setBounds(120,390 ,80, 80);
		zero.setFont(new Font("Arial", Font.PLAIN, 40));
		zero.addActionListener(this);
		jf.add(zero);
		
		equalto=new JButton("=");
		equalto.setBounds(220,390 ,80, 80);
		equalto.setFont(new Font("Arial", Font.PLAIN, 40));
		equalto.addActionListener(this);
		jf.add(equalto);
		
		div=new JButton("/");
		div.setBounds(320,90 ,80, 80);
		div.setFont(new Font("Arial", Font.PLAIN, 40));
		div.addActionListener(this);
		jf.add(div);
		
		mul=new JButton("x");
		mul.setBounds(320,190 ,80, 80);
		mul.setFont(new Font("Arial", Font.PLAIN, 40));
		mul.addActionListener(this);
		jf.add(mul);
		
		sub=new JButton("-");
		sub.setBounds(320,290 ,80, 80);
		sub.setFont(new Font("Arial", Font.PLAIN, 40));
		sub.addActionListener(this);
		jf.add(sub);
		
		addition=new JButton("+");
		addition.setBounds(320,390 ,80, 80);
		addition.setFont(new Font("Arial", Font.PLAIN, 40));
		addition.addActionListener(this);
		jf.add(addition);
		
		clear=new JButton("c");
		clear.setBounds(420,390 ,80, 80);
		clear.setFont(new Font("Arial", Font.PLAIN, 40));
		clear.addActionListener(this);
		jf.add(clear);
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
	public static void main(String[] args) {
		Calculator c=new Calculator();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==seven) {
			displaylabel.setText(displaylabel.getText()+"7");
		}
		else if(e.getSource()==eight) {
			displaylabel.setText(displaylabel.getText()+"8");
		}
		else if(e.getSource()==nine) {
			displaylabel.setText(displaylabel.getText()+"9");
		}
		else if(e.getSource()==four) {
			displaylabel.setText(displaylabel.getText()+"4");
		}
		else if(e.getSource()==five) {
			displaylabel.setText(displaylabel.getText()+"5");
		}
		else if(e.getSource()==six) {
			displaylabel.setText(displaylabel.getText()+"6");
		}
		else if(e.getSource()==one) {
			displaylabel.setText(displaylabel.getText()+"1");
		}
		else if(e.getSource()==two) {
			displaylabel.setText(displaylabel.getText()+"2");
		}
		else if(e.getSource()==three) {
			displaylabel.setText(displaylabel.getText()+"3");
		}
		else if(e.getSource()==point) {
			displaylabel.setText(displaylabel.getText()+".");
		}
		else if(e.getSource()==zero) {
			displaylabel.setText(displaylabel.getText()+"0");
		}
		else if(e.getSource()==equalto) {
			displaylabel.setText(displaylabel.getText()+"=");
		}
		else if(e.getSource()==div) {
			displaylabel.setText(displaylabel.getText()+"/");
		}
		else if(e.getSource()==mul) {
			displaylabel.setText(displaylabel.getText()+"x");
		}
		else if(e.getSource()==sub) {
			displaylabel.setText(displaylabel.getText()+"-");
		}
		else if(e.getSource()==addition) {
			displaylabel.setText(displaylabel.getText()+"+");
		}
		else if(e.getSource()==clear){
			
			displaylabel.setText("");
			
		}
	}
	
	


}
