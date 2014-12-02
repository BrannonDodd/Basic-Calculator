import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;


public class Frame1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		//ADD METHOD
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				int fnum, snum, answer;
				try
				{
					fnum=Integer.parseInt(textField.getText());
					snum=Integer.parseInt(textField_1.getText());
					
					answer=fnum+snum;
					JOptionPane.showMessageDialog(null, answer);
					//textField_2.setText(Integer.toString(answer));
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Error Error!!! Not a valid number");
				}
			}
		});
		btnNewButton.setBounds(137, 106, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		//SUBTRACT METHOD	
		JButton btnNewButton_1 = new JButton("Subtract");
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int fnum, snum, answer;
				try
				{
					fnum=Integer.parseInt(textField.getText());
					snum=Integer.parseInt(textField_1.getText());
					
					answer=fnum-snum;
					JOptionPane.showMessageDialog(null, answer);
					//textField_2.setText(Integer.toString(answer));
				}
				catch(Exception e2)
				{
					JOptionPane.showMessageDialog(null, "Error Error!!! Not a valid number");
				}
			}
		});
		btnNewButton_1.setBounds(137, 140, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
		//DIVIDE METHOD
		JButton btnNewButton_2 = new JButton("Divide");
		btnNewButton_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int fnum, snum, answer;
				try
				{
					fnum=Integer.parseInt(textField.getText());
					snum=Integer.parseInt(textField_1.getText());
					
					answer=fnum/snum;
					JOptionPane.showMessageDialog(null, answer);
					//textField_2.setText(Integer.toString(answer));
				}
				catch(Exception e2)
				{
					JOptionPane.showMessageDialog(null, "Error Error!!! Not a valid number");
				}
			}
		});
		btnNewButton_2.setBounds(137, 174, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		
		//MULTIPLY
		JButton btnNewButton_3 = new JButton("Multiply");
		btnNewButton_3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int fnum, snum, answer;
				try
				{
					fnum=Integer.parseInt(textField.getText());
					snum=Integer.parseInt(textField_1.getText());
					
					answer=fnum*snum;
					JOptionPane.showMessageDialog(null, answer);
					//textField_2.setText(Integer.toString(answer));
				}
				catch(Exception e2)
				{
					JOptionPane.showMessageDialog(null, "Error Error!!! Not a valid number");
				}
			}
		});
		btnNewButton_3.setBounds(137, 208, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		
		//TEXT METHODS
		JLabel lblNumber1 = new JLabel("Number 2");
		lblNumber1.setBounds(189, 11, 68, 15);
		frame.getContentPane().add(lblNumber1);
		 	
		//JLabel lblAnwser = new JLabel("Answer");
		//lblAnwser.setBounds(10, 66, 46, 14);
		//frame.getContentPane().add(lblAnwser);
		
		JLabel lblNumber = new JLabel("Number 1");
		lblNumber.setBounds(10, 11, 89, 14);
		frame.getContentPane().add(lblNumber);
		
		//textField_2 = new JTextField();
		//textField_2.setBounds(66, 66, 86, 20);
		//frame.getContentPane().add(textField_2);
		//textField_2.setColumns(10);
		
		textField = new JTextField("");
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBounds(10, 25, 160, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField("");
		textField_1.setBounds(189, 25, 160, 30);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
	}
}
