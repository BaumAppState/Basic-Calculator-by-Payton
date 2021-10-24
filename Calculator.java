package solution;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener
{
	private JFrame calculatorFrame;
	private JPanel buttonPanel = new JPanel();
	private JButton addButton = new JButton();
	private JButton subButton = new JButton();
	private JButton multButton = new JButton();
	private JButton divButton = new JButton();
	private JPanel resultPanel = new JPanel();
	private JLabel resultLabel = new JLabel();
	private JPanel textFieldPanel = new JPanel();
	private JTextField text1 = new JTextField(10);
	private JTextField text2 = new JTextField(10);
	private String s1;
	private String s2;
	private double answer;
	
	public Calculator()
	{
		buildCalculatorFrame();
		buildPanels();
	}
	
	public void buildCalculatorFrame()
	{
		calculatorFrame = new JFrame("Calculator Frame");
		calculatorFrame.setLocation(100,100);
		calculatorFrame.setSize(350, 150);
		calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculatorFrame.setTitle("Basic Calculator");
		initializeComponents();
		calculatorFrame.setVisible(true);
	}
	
	public void buildPanels()
	{
		addButton.setName("addButton");
		addButton.setText("ADD");
		//subButton = new JButton();
		subButton.setName("subButton");
		subButton.setText("SUB");
	    //multButton = new JButton();
	    multButton.setName("multButton");
	    multButton.setText("MULT");
	    //divButton = new JButton();
	    divButton.setName("divButton");
	    divButton.setText("DIV");
		buttonPanel.add(addButton);
		buttonPanel.add(subButton);
		buttonPanel.add(multButton);
		buttonPanel.add(divButton);
		calculatorFrame.add(buttonPanel, BorderLayout.PAGE_END);
		
		
		resultLabel.setName("resultLabel");
		resultLabel.setText("Result = ");
		resultPanel.add(resultLabel);
		calculatorFrame.add(resultPanel, BorderLayout.CENTER);
		
		text1.setName("leftOperand");
		text2.setName("rightOperand");
		textFieldPanel.add(text1);
		textFieldPanel.add(text2);
		calculatorFrame.add(textFieldPanel, BorderLayout.PAGE_START);
	}
	
	public void initializeComponents()
	{
		addButton.addActionListener(this);
		subButton.addActionListener(this);
		multButton.addActionListener(this);
		divButton.addActionListener(this);
		
	addButton.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent a)
		{
			s1 = text1.getText();
			s2 = text2.getText();
			try
			{
				if (s1 == null || s2 == null)
				{
					resultLabel.setText("Result = Error");
				} 
				else
				{
				answer = Double.parseDouble(s1) + Double.parseDouble(s2);
				resultLabel.setText("Result = " + answer);
				}
			}
			catch(NumberFormatException p)
			{
				resultLabel.setText("Result = Error");
				System.out.println("Number Format Exception Occured");
			}
		}
	}
	);
	
	subButton.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent b)
		{
			s1 = text1.getText();
			s2 = text2.getText();
			try
			{
				if (s1 == null || s2 == null)
				{
					resultLabel.setText("Result = Error");
				} 
				else
				{
				answer = Double.parseDouble(s1) - Double.parseDouble(s2);
				resultLabel.setText("Result = " + answer);
				}
			}
			catch(NumberFormatException p)
			{
				resultLabel.setText("Result = Error");
				System.out.println("Number Format Exception Occured");
			}
		}
	}
	);
	
	multButton.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent c)
		{
			s1 = text1.getText();
			s2 = text2.getText();
			try
			{
				if (s1 == null || s2 == null)
				{
					resultLabel.setText("Result = Error");
				} 
				else
				{
				answer = Double.parseDouble(s1) * Double.parseDouble(s2);
				resultLabel.setText("Result = " + answer);
				}
			}
			catch(NumberFormatException p)
			{
				resultLabel.setText("Result = Error");
				System.out.println("Number Format Exception Occured");
			}
		}
	}
	);
	
	divButton.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent d)
		{
			s1 = text1.getText();
			s2 = text2.getText();
			try
			{
				if (s1 == null || s2 == null || Double.parseDouble(s2) == 0)
				{
					resultLabel.setText("Result = Error");
				} 
				else
				{
				answer = Double.parseDouble(s1) / Double.parseDouble(s2);
				resultLabel.setText("Result = " + answer);
				}
			}
			catch(NumberFormatException p)
			{
				resultLabel.setText("Result = Error");
				System.out.println("Number Format Exception Occurred");
			}
		}
	}
	);
	
	}
	
	public JFrame getFrame()
	{
		return calculatorFrame;
	}
	
	public static void main(String[] args)
	{
		Calculator calc = new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 //TODO Auto-generated method stub
		
	}
}
