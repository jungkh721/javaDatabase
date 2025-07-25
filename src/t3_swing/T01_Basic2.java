package t3_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class T01_Basic2 extends JFrame {
	
	public T01_Basic2() {
		super("스윙연습");
		designView();
	}
	
	
	private void designView() {
		//setBounds(300, 300, 400, 350);
		setSize(400, 350);
		setLocationRelativeTo(null);//윈도우 화면 중앙에 배치*****
		//setDefaultCloseOperation(3);//윈도우 닫기 버튼을 클릭해서 창 닫기수행3
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//윈도우 닫기 버튼을 클릭해서 창 닫기수행3
		setResizable(false);//윈도우창 크기 조절
		
		
		
		
		JButton btnExit = new JButton("종료");
		add(btnExit);	
		
		setVisible(true);//**필수
		
	// ------------------- 위쪽은 사용자 인터페이스구현(UI) , 아래쪽은 method(동작) 처리 -----------------

		
		// 종료버튼 클릭시 수행
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		

	}

	public static void main(String[] args) {
		new T01_Basic2();
	}
}
