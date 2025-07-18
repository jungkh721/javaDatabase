package t6_exam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class constellationInput {

	private JFrame frame;
	private JTextField textField_1;

	
	public static void main(String[] args) {
		new constellationInput();
		
	}

	
	public constellationInput() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("별자리 입력하기");
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("별자리명:");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(37, 64, 159, 42);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("설명:");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(37, 116, 159, 42);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(208, 114, 350, 205);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"물병자리", "물고기자리", "양자리", "황소자리", "쌍둥이자리", "게자리", "사자자리", "처녀자리", "친정자리", "전갈자리", "사수자리", "염소자리"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(208, 64, 350, 42);
		panel.add(list);
		
		JButton btnClose_1 = new JButton("입력하기");
		btnClose_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnClose_1.setBounds(458, 485, 143, 42);
		panel.add(btnClose_1);
		
		JButton btnClose = new JButton("나가기");
		btnClose.setFont(new Font("굴림", Font.BOLD, 20));
		btnClose.setBounds(616, 485, 143, 42);
		panel.add(btnClose);
		//---------------------------------------------------------------
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new ConstellationMain();
			}
		});
		
		
		frame.setVisible(true);
	}
}
