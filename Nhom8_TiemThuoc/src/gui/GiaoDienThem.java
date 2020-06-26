package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GiaoDienThem {

	public static void main(String[] args) {
		showWindow();

	}

	public static void showWindow() {
		JFrame frame = new JFrame("GiaoDienThem");
		frame.setBounds(200, 200, 816, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("TR\u1EDF v\u1EC1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				GiaoDienChinh c = new GiaoDienChinh();
				c.showWindow();
			}
		});
		btnNewButton.setBounds(265, 112, 85, 77);
		frame.getContentPane().add(btnNewButton);
		frame.setVisible(true);
		
	}

}
