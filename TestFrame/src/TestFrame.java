import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class TestFrame implements ActionListener {

	JButton seven,eight,clear,addition,equalto,sub;
	JLabel display;
	boolean operationclicked=false;
	String oldValue;
	public TestFrame() {
		
		JFrame frame=new JFrame();
		frame.setBounds(200,20, 600, 540);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		display=new JLabel("");
		display.setBounds(20, 20, 560, 50);
		display.setBackground(Color.gray);
		frame.add(display);
		display.setOpaque(true);
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setForeground(Color.white);
		
		seven=new JButton("7");
		seven.setBounds(20, 90, 80, 80);
		seven.addActionListener(this);
		seven.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(seven);
		
		eight=new JButton("8");
		eight.setBounds(120, 90, 80, 80);
		eight.setFont(new Font("Arial", Font.PLAIN, 40));
		eight.addActionListener(this);
		frame.add(eight);
		
		clear=new JButton("c");
		clear.setBounds(220, 90, 80, 80);
		clear.setFont(new Font("Arial", Font.PLAIN, 40));
		clear.addActionListener(this);
		frame.add(clear);
		
		addition=new JButton("+");
		addition.setBounds(20, 190, 80, 80);
		addition.setFont(new Font("Arial", Font.PLAIN, 40));
		addition.addActionListener(this);
		frame.add(addition);
		
		sub=new JButton("-");
		sub.setBounds(120, 190, 80, 80);
		sub.setFont(new Font("Arial", Font.PLAIN, 40));
		sub.addActionListener(this);
		frame.add(sub);
		
		equalto=new JButton("=");
		equalto.setBounds(220, 190, 80, 80);
		equalto.setFont(new Font("Arial", Font.PLAIN, 40));
		equalto.addActionListener(this);
		frame.add(equalto);
		
		
	}
	
	public static void main(String[] args) {
		TestFrame ts=new TestFrame();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==seven) {
			
			if(operationclicked) {
				display.setText("7");
				operationclicked=false;
				
			}else {
				
			display.setText(display.getText()+"7");
			
			}
		}
		if(e.getSource()==eight) {
			if(operationclicked) {
				display.setText("8");
				operationclicked=false;
			
			}else {
			display.setText(display.getText()+"8");
		}
		}
		if(e.getSource()==clear) {
			display.setText("");
		}
		if(e.getSource()==addition) {
			operationclicked=true;
			oldValue=display.getText();
			display.setText("");
			
		}
		if(e.getSource()==sub) {
			operationclicked=true;
			oldValue=display.getText();
			display.setText("");
			
			
		}
		if(e.getSource()==equalto) {
			String newValue=display.getText();
			float oldValuef=Float.parseFloat(oldValue);
			float newValuef=Float.parseFloat(newValue);
			float result=oldValuef+newValuef;
			display.setText(result+"");
		}
	}
}
