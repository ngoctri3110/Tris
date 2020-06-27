package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;

public class GDThemTTThuoc {

	public static void main(String[] args) {
		showWindow();

	}

	public static void showWindow() {
		JFrame frame = new JFrame("GiaoDienThem");
		frame.setBounds(200, 200, 936, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel pnChinh = new JPanel();
		pnChinh.setBackground(new Color(127, 255, 212));
		pnChinh.setBounds(0, 0, 922, 506);
		frame.getContentPane().add(pnChinh);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

}
