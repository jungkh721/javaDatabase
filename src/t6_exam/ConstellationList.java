package t6_exam;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class ConstellationList {

	private JFrame frame;

	public static void main(String[] args) {
		new ConstellationList();
			
	}

	
	public ConstellationList() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("별자리정보");
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btn1 = new JButton("");
		btn1.setIcon(new ImageIcon(ConstellationList.class.getResource("/t6_exam/images/화면 캡처 2025-07-18 154404.png")));
		btn1.setBounds(37, 10, 151, 155);
		panel.add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.setIcon(new ImageIcon(ConstellationList.class.getResource("/t6_exam/images/화면 캡처 2025-07-18 154404.png")));
		btn2.setBounds(224, 10, 151, 155);
		panel.add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.setIcon(new ImageIcon(ConstellationList.class.getResource("/t6_exam/images/화면 캡처 2025-07-18 154404.png")));
		btn3.setBounds(411, 10, 151, 155);
		panel.add(btn3);
		
		JButton btn4 = new JButton("");
		btn4.setIcon(new ImageIcon(ConstellationList.class.getResource("/t6_exam/images/화면 캡처 2025-07-18 154404.png")));
		btn4.setBounds(598, 10, 151, 155);
		panel.add(btn4);
		
		JButton btn5 = new JButton("");
		btn5.setIcon(new ImageIcon(ConstellationList.class.getResource("/t6_exam/images/화면 캡처 2025-07-18 154404.png")));
		btn5.setBounds(37, 189, 151, 155);
		panel.add(btn5);
		
		JButton btn6 = new JButton("");
		btn6.setIcon(new ImageIcon(ConstellationList.class.getResource("/t6_exam/images/화면 캡처 2025-07-18 154404.png")));
		btn6.setBounds(224, 189, 151, 155);
		panel.add(btn6);
		
		JButton btn7 = new JButton("");
		btn7.setIcon(new ImageIcon(ConstellationList.class.getResource("/t6_exam/images/화면 캡처 2025-07-18 154404.png")));
		btn7.setBounds(411, 189, 151, 155);
		panel.add(btn7);
		
		JButton btn8 = new JButton("");
		btn8.setIcon(new ImageIcon(ConstellationList.class.getResource("/t6_exam/images/화면 캡처 2025-07-18 154404.png")));
		btn8.setBounds(598, 189, 151, 155);
		panel.add(btn8);
		
		JButton btn9 = new JButton("");
		btn9.setIcon(new ImageIcon(ConstellationList.class.getResource("/t6_exam/images/화면 캡처 2025-07-18 154404.png")));
		btn9.setBounds(37, 368, 151, 155);
		panel.add(btn9);
		
		JButton btn10 = new JButton("");
		btn10.setIcon(new ImageIcon(ConstellationList.class.getResource("/t6_exam/images/화면 캡처 2025-07-18 154404.png")));
		btn10.setBounds(224, 368, 151, 155);
		panel.add(btn10);
		
		JButton btn11 = new JButton("");
		btn11.setIcon(new ImageIcon(ConstellationList.class.getResource("/t6_exam/images/화면 캡처 2025-07-18 154404.png")));
		btn11.setBounds(411, 368, 151, 155);
		panel.add(btn11);
		
		JButton btn12 = new JButton("");
		btn12.setIcon(new ImageIcon(ConstellationList.class.getResource("/t6_exam/images/화면 캡처 2025-07-18 154404.png")));
		btn12.setBounds(598, 368, 151, 155);
		panel.add(btn12);
		
		JLabel lbl1 = new JLabel("01.20~02.18");
		lbl1.setBackground(Color.BLACK);
		lbl1.setEnabled(false);
		lbl1.setFont(new Font("굴림", Font.BOLD, 15));
		lbl1.setBounds(37, 163, 151, 27);
		panel.add(lbl1);
		
		JLabel lbl2 = new JLabel("02.19~03.20");
		lbl2.setFont(new Font("굴림", Font.BOLD, 15));
		lbl2.setBounds(224, 163, 151, 27);
		panel.add(lbl2);
		
		JLabel lbl3 = new JLabel("03.21~04.19");
		lbl3.setFont(new Font("굴림", Font.BOLD, 15));
		lbl3.setBounds(411, 163, 151, 27);
		panel.add(lbl3);
		
		JLabel lbl4 = new JLabel("04.20~05.20");
		lbl4.setFont(new Font("굴림", Font.BOLD, 15));
		lbl4.setBounds(598, 163, 151, 27);
		panel.add(lbl4);
		
		JLabel lbl5 = new JLabel("05.21~06.21");
		lbl5.setFont(new Font("굴림", Font.BOLD, 15));
		lbl5.setBounds(37, 342, 151, 27);
		panel.add(lbl5);
		
		JLabel lbl6 = new JLabel("06.22~07.22");
		lbl6.setFont(new Font("굴림", Font.BOLD, 15));
		lbl6.setBounds(224, 342, 151, 27);
		panel.add(lbl6);
		
		JLabel lbl7 = new JLabel("07.23~08.22");
		lbl7.setFont(new Font("굴림", Font.BOLD, 15));
		lbl7.setBounds(411, 342, 151, 27);
		panel.add(lbl7);
		
		JLabel lbl8 = new JLabel("08.23~09.23");
		lbl8.setFont(new Font("굴림", Font.BOLD, 15));
		lbl8.setBounds(598, 342, 151, 27);
		panel.add(lbl8);
		
		JButton btnNewButton = new JButton("나가기");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 10));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(703, 533, 69, 23);
		panel.add(btnNewButton);
		
		JLabel lbl5_1 = new JLabel("09.24~10.22");
		lbl5_1.setFont(new Font("굴림", Font.BOLD, 15));
		lbl5_1.setBounds(37, 524, 151, 27);
		panel.add(lbl5_1);
		
		JLabel lbl6_1 = new JLabel("10.23~11.22");
		lbl6_1.setFont(new Font("굴림", Font.BOLD, 15));
		lbl6_1.setBounds(224, 524, 151, 27);
		panel.add(lbl6_1);
		
		JLabel lbl7_1 = new JLabel("11.23~12.24");
		lbl7_1.setFont(new Font("굴림", Font.BOLD, 15));
		lbl7_1.setBounds(411, 524, 151, 27);
		panel.add(lbl7_1);
		
		JLabel lbl8_1 = new JLabel("12.25~01.19");
		lbl8_1.setFont(new Font("굴림", Font.BOLD, 15));
		lbl8_1.setBounds(598, 524, 151, 27);
		panel.add(lbl8_1);
		
		//---------------------------------------------------------------------
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new ConstellationMain();
			}
		});
		
		
		
		frame.setVisible(true);
	}
}
