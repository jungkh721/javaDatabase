package t5_insa;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Vector;
import java.util.concurrent.locks.Condition;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
@SuppressWarnings({ "unchecked","unused", "rawtypes" })
public class InsaList {

	private JFrame frame;
	private JTable table;
	private Vector title ,vData;
	private DefaultTableModel dtm;
	
	InsaDAO dao = new InsaDAO();
	private JTextField txtCondition;


	//public static void main(String[] args) {
	//	new InsaList();
			
	//}

	
	public InsaList() {
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
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 0, 784, 80);
		frame.getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JButton btnClose = new JButton("종료");
		btnClose.setFont(new Font("굴림", Font.PLAIN, 20));
		btnClose.setBounds(635, 26, 137, 44);
		pn1.add(btnClose);
		
		JButton btnList = new JButton("전체검색");
		btnList.setFont(new Font("굴림", Font.PLAIN, 20));
		btnList.setBounds(492, 26, 137, 44);
		pn1.add(btnList);
		
		JComboBox cbCondition = new JComboBox();
		cbCondition.setModel(new DefaultComboBoxModel(new String[] {"성명", "나이", "성별", "인사일"}));
		cbCondition.setBounds(12, 32, 153, 37);
		pn1.add(cbCondition);
		
		txtCondition = new JTextField();
		txtCondition.setFont(new Font("굴림", Font.PLAIN, 18));
		txtCondition.setBounds(165, 32, 130, 38);
		pn1.add(txtCondition);
		txtCondition.setColumns(10);
		
		JButton btnCondition = new JButton("조건검색");
		btnCondition.setFont(new Font("굴림", Font.PLAIN, 20));
		btnCondition.setBounds(295, 26, 137, 44);
		pn1.add(btnCondition);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(0, 79, 784, 404);
		frame.getContentPane().add(pn2);
		pn2.setLayout(null);
		
		//JScrollPane scrollPane = new JScrollPane();
		//scrollPane.setBounds(12, 21, 760, 373);
		//pn2.add(scrollPane);
		
		//table = new JTable();
		//scrollPane.setViewportView(table);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(0, 481, 784, 80);
		frame.getContentPane().add(pn3);
		pn3.setLayout(null);
		
		JButton btnInsailAsc = new JButton("입사일 오름차순");
		btnInsailAsc.setFont(new Font("굴림", Font.PLAIN, 11));
		btnInsailAsc.setBounds(357, 10, 188, 46);
		pn3.add(btnInsailAsc);
		
		JButton btnInsailDesc = new JButton("입사일 내림차순");
		btnInsailDesc.setFont(new Font("굴림", Font.PLAIN, 11));
		btnInsailDesc.setBounds(557, 10, 188, 46);
		pn3.add(btnInsailDesc);
		
	//아래쪽으로 JTable 설계하기
			//JTable 제작시는 '제목'과 데이터를 설게하여 vector 객체 타잊으로 준비
			
			//1. '제목'vector을 저장
			title =new Vector<>();
			title.add("번호");
			title.add("성명");
			title.add("나이");
			title.add("성별");
			title.add("입사일");
			
			//2. 데이터를 vector로 준비
			vData =dao.getInsaList("","");//idx 내침차ㄱ순
			
			//3.DB에서 가져온 자료와 테이블을 DefaltTableModel 객체생성시 할당한다
			dtm =new DefaultTableModel(vData, title);
			
			//4.DefaultTableModel 에 담긴 백터타입의 '데이터/ 타이틀' JTable 객체 생성시 담아준다
			table = new JTable(dtm);
			
			
			//5.자료가 담긴 JTable을 JScrollpane 객체 생성시 담아준다
			JScrollPane scrollPane = new JScrollPane(table);
			scrollPane.setBounds(12, 10, 760, 394);
			pn2.add(scrollPane);
			//6.풀력결과를 화면에 표시한다
			
			frame.setVisible(true);
		
		//-------------------------------------------------------------------------------------------------------
			//조건검색 마우스로 클릭시 수행
			btnCondition.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String condition = cbCondition.getSelectedItem().toString();
					String textCondition = txtCondition.getText();
					
					if(textCondition.trim().equals("")) {
						JOptionPane.showMessageDialog(frame, "검색할 내용을 입력하세요");
						txtCondition.requestFocus();
						return;
							
					}
					if(condition.equals("성명")) vData = dao.getConditionSearch("name",textCondition);
					else if (condition.equals("나이")) {
						if(!Pattern.matches("^[0-9]+$", textCondition)) {
							JOptionPane.showMessageDialog(frame, "나이는 숫자로 입력하세요");
							txtCondition.requestFocus();
						}
						else vData = dao.getConditionSearch("age",textCondition);
						
					}
					else if(condition.equals("성별")) vData = dao.getConditionSearch("gender",textCondition);
					else if(condition.equals("입사일")) vData = dao.getConditionSearch("ipsail",textCondition);
					
					dtm.setDataVector(vData, title);
				}
			});
			
			//전체검색버튼을 마우스 클릭시 수행
			btnList.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					vData =dao.getInsaList("","");
					dtm.setDataVector(vData, title);
					
				}
			});	
			//임사일 내람차순 정렬버튼 마우스 클릭시 수행
			btnInsailDesc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					vData =dao.getInsaList("ipsail","desc");
					dtm.setDataVector(vData, title);
					
				}
			});	
			
			//임사일 오름차순 정렬버튼 마우스 클릭시 수행
			btnInsailAsc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					vData =dao.getInsaList("ipsail","asc");
					dtm.setDataVector(vData, title);
					
				}
			});	
			
		
		
			btnClose.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					new InsaMain();
				}
			});
		
	}
}
