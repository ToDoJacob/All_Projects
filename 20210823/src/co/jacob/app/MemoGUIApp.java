package co.jacob.app;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MemoGUIApp extends JFrame{
	JTextField txtNo,txtDate,txtContent;
	JButton btnInsert,btnDelete,btnSearch;
	JTextArea txtArea;
	MemoStorage memoStorage;
	public MemoGUIApp() {
		memoStorage = MemoStorage.getInstance();
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
		
		//등록버튼
		btnInsert = new JButton("등록");
		btnInsert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String no = txtNo.getText();
				String date = txtDate.getText();
				String content = txtContent.getText();
				Memo memo = new Memo(no,date,content);
				boolean result = memoStorage.saveDate(memo);
				if(result) {
					JOptionPane.showMessageDialog(panel, "등록완료");
				}
				else {
					JOptionPane.showMessageDialog(panel, "등록실패");
				}
				clearText();
				
			}});
		panel.add(btnInsert);

		//삭제버튼
		btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String no = txtNo.getText();
			
				memoStorage.deleteData(no);
				JOptionPane.showMessageDialog(panel, "삭제완료");
				
			}
		});
		
		panel.add(btnDelete);
		//조회버튼
		btnSearch = new JButton("조회");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<Memo> list = memoStorage.searchData();
				txtArea.setText("");
				for(Memo memo : list) {
					txtArea.append(memo.toString());
				}
			
			}
			
		});
		panel.add(btnSearch);
		
		txtArea = new JTextArea(15,23);
		panel.add(txtArea);
		
		this.setSize(300,400);
		this.setTitle("메모관리");
		this.setVisible(true);
	
	
	//저장버튼
	btnSave = new JButton("저장");
	btnSave.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			List<Memo> list = memoStorage.searchData();
			txtArea.setText("");
			for(Memo memo : list) {
				txtArea.append(memo.toString());
			}
		
		}
		
	});
	panel.add(btnSave);
	}
	public static void main(String[] args) {
		new MemoGUIApp();
	}
	
	private void clearText() {
		txtNo.setText("");
		txtDate.setText("");
		txtContent.setText("");
	}
}
