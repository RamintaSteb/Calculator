package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	//kintamieji
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 288, 444);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(12, 13, 246, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//<-C%
		
		JButton btnc1 = new JButton("<-");
		btnc1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				
				if (textField.getText().length()>0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnc1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnc1.setBounds(12, 76, 91, 60);
		frame.getContentPane().add(btnc1);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnC.setBounds(105, 76, 91, 60);
		frame.getContentPane().add(btnC);
				
		JButton btnPr = new JButton("%");
		btnPr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnPr.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPr.setBounds(198, 76, 60, 60);
		frame.getContentPane().add(btnPr);
		
		//789+
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(12, 138, 60, 60);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(74, 138, 60, 60);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(136, 138, 60, 60);
		frame.getContentPane().add(btn9);
		
		JButton btnP = new JButton("+");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
				
			}
		});
		btnP.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnP.setBounds(198, 138, 60, 60);
		frame.getContentPane().add(btnP);
		
		//456-
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(12, 200, 60, 60);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(74, 200, 60, 60);
		frame.getContentPane().add(btn5);
				
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(136, 200, 60, 60);
		frame.getContentPane().add(btn6);
				
		JButton btnM = new JButton("-");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnM.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnM.setBounds(198, 200, 60, 60);
		frame.getContentPane().add(btnM);
		
		//123*
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(12, 262, 60, 60);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(74, 262, 60, 60);
		frame.getContentPane().add(btn2);
				
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(136, 262, 60, 60);
		frame.getContentPane().add(btn3);
				
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMul.setBounds(198, 262, 60, 60);
		frame.getContentPane().add(btnMul);
		
		//0.=/
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(12, 324, 60, 60);
		frame.getContentPane().add(btn0);
		
		JButton btnD = new JButton(".");
		btnD.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnD.setBounds(74, 324, 60, 60);
		frame.getContentPane().add(btnD);
				
		JButton btnE = new JButton("=");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum=Double.parseDouble(textField.getText());
				
				if (operations=="+")
				{
					result= firstnum+secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations=="-")
				{
					result= firstnum-secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations=="*")
				{
					result= firstnum*secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations=="/")
				{
					result= firstnum/secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations=="%")
				{
					result= firstnum%secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnE.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnE.setBounds(136, 324, 60, 60);
		frame.getContentPane().add(btnE);
				
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDiv.setBounds(198, 324, 60, 60);
		frame.getContentPane().add(btnDiv);
	}
}
