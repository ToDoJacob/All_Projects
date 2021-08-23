package co.jacob.app;

import java.awt.FlowLayout;

import javax.swing.*;

public class MemoGUIApp extends JFrame{
	JTextField txtNo,txtDate,txtContent;
	JButton btnInsert,btnDelete,btnSearch;
	JTextArea txtArea;
	public MemoGUIApp() {
		JPanel panel = (JPanel)this.getContentPane();
		panel.setLayout(new FlowLayout());
		
		panel.add(new JLabel("번호"));
		txtNo = new JTextField(20);
		panel.add(txtNo);
		
		panel.add(new JLabel("날짜"));
		txtDate = new JTextField(20);
		panel.add(txtDate);
		
		panel.add(new JLabel("내용"));
		txtContent = new JTextField(20);
		panel.add(txtContent);
		
		
		btnInsert = new JButton("등록");
		panel.add(btnInsert);
		btnDelete = new JButton("삭제");
		panel.add(btnDelete);
		btnSearch = new JButton("조회");
		panel.add(btnSearch);
		
		this.setSize(300,400);
		this.setTitle("메모관리");
		this.setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new MemoGUIApp();
	}
}
