import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
    public Rechner rechner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
	}
	
	public void InitRechner() {
		rechner = new Rechner();
	}
	
	public void setText(String number) {
		String shown = textField.getText();
		
		if (shown.length() > 10){
			return;
		}
		
		if (Integer.parseInt(shown) == 0) {
			shown = "";
		}
		
		textField.setText(shown.concat(number));
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 335, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(5, 6, 305, 49);
		contentPane.add(textField);
		textField.setColumns(10);
		InitRechner();
		
		JLabel label = new JLabel("");
		label.setBounds(193, 6, 188, 49);
		contentPane.add(label);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setText("1");
			}
		});
		btn_1.setBounds(5, 55, 80, 49);
		contentPane.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setText("2");
			}
		});
		btn_2.setBounds(90, 55, 80, 49);
		contentPane.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setText("3");
			}
		});
		btn_3.setBounds(175, 55, 80, 49);
		contentPane.add(btn_3);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setText("5");
			}
		});
		btn_5.setBounds(90, 104, 80, 49);
		contentPane.add(btn_5);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setText("4");
			}
		});
		btn_4.setBounds(5, 104, 80, 49);
		contentPane.add(btn_4);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setText("6");
			}
		});
		btn_6.setBounds(175, 104, 80, 49);
		contentPane.add(btn_6);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setText("8");
			}
		});
		btn_8.setBounds(90, 153, 80, 49);
		contentPane.add(btn_8);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setText("7");
			}
		});
		btn_7.setBounds(5, 153, 80, 49);
		contentPane.add(btn_7);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setText("9");
			}
		});
		btn_9.setBounds(175, 153, 80, 49);
		contentPane.add(btn_9);
		
		JButton btn_mal = new JButton("X");
		btn_mal.setBounds(265, 202, 45, 49);
		contentPane.add(btn_mal);
		
		JButton btn_minus = new JButton("-");
		btn_minus.setBounds(265, 153, 45, 49);
		contentPane.add(btn_minus);
		
		JButton btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(rechner.setOperator("+", textField.getText()));
			}
		});
		btn_plus.setBounds(265, 104, 45, 49);
		contentPane.add(btn_plus);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setText("0");
			}
		});
		btn_0.setBounds(90, 204, 80, 49);
		contentPane.add(btn_0);
		
		JButton btn_summe = new JButton("=");
		btn_summe.setBounds(175, 204, 80, 49);
		contentPane.add(btn_summe);
		
		JButton btn_durch = new JButton("/");
		btn_durch.setBounds(265, 253, 45, 49);
		contentPane.add(btn_durch);
		
		JButton btn_clear = new JButton("C");
		btn_clear.setBounds(265, 55, 45, 49);
		contentPane.add(btn_clear);
		
		JButton btn_punkt = new JButton(".");
		btn_punkt.setBounds(5, 204, 80, 49);
		contentPane.add(btn_punkt);
	}
}
