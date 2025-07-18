package t6_exam;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;

import t5_insa.InsaList;
import t5_insa.InsaMain;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConstellationMain {

	private JFrame frame;

	
	public static void main(String[] args) {
		new ConstellationMain();
	
	}

	
	public ConstellationMain() {
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
		
		JPanel pn1 = new JPanel();
		pn1.setBackground(Color.DARK_GRAY);
		pn1.setBounds(0, 0, 784, 67);
		frame.getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblTitle = new JLabel("CONSTELLATION");
		lblTitle.setForeground(Color.BLACK);
		lblTitle.setFont(new Font("Baskerville Old Face", Font.BOLD | Font.ITALIC, 45));
		lblTitle.setBounds(27, 10, 745, 57);
		pn1.add(lblTitle);
		
		JPanel pn2 = new JPanel();
		pn2.setBackground(Color.DARK_GRAY);
		pn2.setBounds(0, 65, 784, 404);
		frame.getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(ConstellationMain.class.getResource("/t6_exam/images/main.jpg")));
		lblImage.setBounds(12, 10, 760, 384);
		pn2.add(lblImage);
		
		JPanel pn3 = new JPanel();
		pn3.setBackground(Color.DARK_GRAY);
		pn3.setBounds(0, 468, 784, 93);
		frame.getContentPane().add(pn3);
		pn3.setLayout(null);
		
		JButton btnInput = new JButton("별자리 입력하기");
		btnInput.setForeground(Color.WHITE);
		btnInput.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		btnInput.setBackground(Color.BLACK);
		btnInput.setBounds(48, 24, 197, 43);
		pn3.add(btnInput);
		
		JButton btnList = new JButton("별자리보기");
		btnList.setForeground(Color.WHITE);
		btnList.setBackground(Color.BLACK);
		btnList.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		btnList.setBounds(293, 24, 197, 43);
		pn3.add(btnList);
		
		JButton btnExit = new JButton("종료");
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		btnExit.setBackground(Color.BLACK);
		btnExit.setBounds(538, 24, 197, 43);
		pn3.add(btnExit);
		
		
		
		
		frame.setVisible(true);
		//--------------------------------------------------------------------------------------
		//별자리 입력시 수행
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new constellationInput();
			}
		});
		//별자리보기 수행
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new ConstellationList();
			}
		});
		
		//종료시 수행
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
