package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GiaoDienChinh {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaoDienChinh window = new GiaoDienChinh();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GiaoDienChinh() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 914, 592);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTieuDe = new JLabel("Ti\u1EC7m Thu\u1ED1c 3T");
		lblTieuDe.setForeground(Color.RED);
		lblTieuDe.setBackground(Color.WHITE);
		lblTieuDe.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblTieuDe.setBounds(330, 55, 213, 42);
		frame.getContentPane().add(lblTieuDe);
		
		JButton btnQLThuoc = new JButton("Qu\u1EA3n L\u00FD Thu\u1ED1c");
		btnQLThuoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				GiaodienQLThuoc g = new GiaodienQLThuoc();
				g.setVisible(true);
			}
		});
		btnQLThuoc.setBackground(new Color(153, 255, 255));
		btnQLThuoc.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnQLThuoc.setBounds(35, 191, 270, 99);
		frame.getContentPane().add(btnQLThuoc);
		
		JButton btnTaoHoaDon = new JButton("T\u1EA1o H\u00F3a \u0110\u01A1n");
		btnTaoHoaDon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hahaha");
			}
		});
		btnTaoHoaDon.setBackground(new Color(51, 255, 255));
		btnTaoHoaDon.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnTaoHoaDon.setBounds(573, 191, 244, 99);
		frame.getContentPane().add(btnTaoHoaDon);
	}
}
