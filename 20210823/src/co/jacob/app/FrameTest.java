package co.jacob.app;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameTest extends JFrame implements ActionListener {
	
	JButton btn1, btn2, btn3;
	
	public FrameTest() {
		JPanel panel = (JPanel)this.getContentPane();
		
		//컴포넌트를 창크기에따라 자동으로 배치를 해주는것
		panel.setLayout(new FlowLayout());
		
		//프레임 컴포넌트 추가
		//.1 컴포넌트 생성
		btn1 = new JButton("버튼1");
		//2.컴포넌트 속성을 변경
		btn1.setBackground(Color.CYAN);
		//3. 이벤트핸들러
		btn1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				btn1.setText("익명객체");
				
			}} );
			
	
		//4. 패널(부모)에 연결
		panel.add(btn1);
		
		
		
		btn2 = new JButton("버튼2");
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btn2.setText("바꼈다");
			}
		});
		btn2.setBackground(Color.CYAN);
		panel.add(btn2);
		
		
		btn3 = new JButton("버튼3");
		btn3.addActionListener(this);
		btn3.setBackground(Color.CYAN);
		panel.add(btn3);
		
		
		this.setSize(400, 300);
		this.setTitle("프레임연습");
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
	
		new FrameTest();
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


//이벤트 핸들러(구현클래스)
//중첩클래스(내부클래스 - 외부클래스의 필드에 접근가능)
//class MyActionListener implements ActionListener{
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("클릭됨");
//		System.out.println(((JButton)e.getSource()).getX());
//		btn2.setText("변경됨");
//		
//	}
//}
}
