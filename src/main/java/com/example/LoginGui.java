package com.example;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LoginGui {
	
	public void run() {
		// JFrame 객체 생성
		JFrame frame = new JFrame();
		// 창 닫기 버튼 클릭 시 프로그램 종료 설정
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창 사이즈 설정
		frame.setSize(300, 300);
		// 창 제목 설정
		frame.setTitle("네이버 자동 로그인");

		// 생성 버튼 객체 생성
		JButton loginButton = new JButton("자동 로그인");
		loginButton.addActionListener(new AutoLogin());

		// JPanel 객체 생성
		JPanel panel = new JPanel();
		panel.add(loginButton);

		// JFrame 객체에 panel 추가
		frame.add(panel);
		// JFrame을 보이도록 설정
		frame.setVisible(true);
		// JFrame을 중앙에 배치하도록 설정
		frame.setLocationRelativeTo(null);
	}

}
