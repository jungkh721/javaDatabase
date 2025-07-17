package t4_WindowBuilder;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.event.ActionListener;
import java.io.FilenameFilter;
import java.awt.event.ActionEvent;

public class T06_file {

	private JFrame frame;

	
	public static void main(String[] args) {
		new T06_file();
				
	}

	
	public T06_file() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setTitle("파일 연습");
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnimages = new JButton("이미지 선택");
		btnimages.setFont(new Font("굴림", Font.BOLD, 20));
		btnimages.setBounds(23, 30, 194, 55);
		frame.getContentPane().add(btnimages);
		
		JLabel lblImage = new JLabel("이곳에 이미지가 출력됩니다");
		lblImage.setBounds(12, 90, 760, 273);
		frame.getContentPane().add(lblImage);
		
		JTextArea tAmasage = new JTextArea();
		tAmasage.setBounds(12, 416, 772, 145);
		frame.getContentPane().add(tAmasage);
		
		frame.setVisible(true);
		//---------------------------------------------
		
		//이미선택 버튼을 클릭하면 출력(lblImage 그림파일 출력)
		
		btnimages.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				
				FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF & PND Images","jpg","gif","pnd");
				chooser.setFileFilter(filter);
				
				int res =chooser.showOpenDialog(null);
				
				if(res != chooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(frame, "파일을 선택해 주세요","경고",JOptionPane.WARNING_MESSAGE);
					
				}
				else {
					String filePath =	chooser.getSelectedFile().getPath();
					String fileName =	chooser.getSelectedFile().getPath();
					
					//lblImage.setIcon(null);
					//String fileImof = "경로명과 파일명:"+ filePath +" +"\n 파일명 :" + fileName ;
					//tAmasage.setText(fileImof);
				}
				
			}
		});
	}
}
