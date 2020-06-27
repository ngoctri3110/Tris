package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class GDChinh {
	public GDChinh() {
	}

	public static void main(String[] args) {
		showWindow();

	}

	public static void showWindow() {
		JFrame frame = new JFrame("GiaoDienChinh");
		frame.setBounds(200, 200, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		JPanel pnChinh = new JPanel();
		pnChinh.setBackground(new Color(47, 79, 79));
		pnChinh.setBounds(0, 0, 886, 563);
		frame.getContentPane().add(pnChinh);
		pnChinh.setLayout(null);

		JPanel pnChucNang = new JPanel();
		pnChucNang.setBackground(new Color(0, 128, 128));
		pnChucNang.setBounds(0, 0, 338, 563);
		pnChinh.add(pnChucNang);
		pnChucNang.setLayout(null);

		JPanel pnQuanLyThuoc = new JPanel();
		pnQuanLyThuoc.setBackground(SystemColor.controlHighlight);
		pnQuanLyThuoc.setBounds(0, 248, 338, 52);
		pnChucNang.add(pnQuanLyThuoc);
		pnQuanLyThuoc.setLayout(null);

		JButton btnCapNhatThuoc = new JButton("C\u1EACP NH\u1EACT THU\u1ED0C");
		btnCapNhatThuoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				GDThemTTThuoc ql = new GDThemTTThuoc();
				ql.showWindow();
			}
		});
		btnCapNhatThuoc.setHorizontalAlignment(SwingConstants.LEFT);
		btnCapNhatThuoc.setBounds(92, 0, 246, 52);
		pnQuanLyThuoc.add(btnCapNhatThuoc);
		btnCapNhatThuoc.setFont(new Font("Tahoma", Font.BOLD, 16));

		JPanel pnXemThongTinThuoc = new JPanel();
		pnXemThongTinThuoc.setBackground(SystemColor.controlHighlight);
		pnXemThongTinThuoc.setBounds(0, 329, 338, 52);
		pnChucNang.add(pnXemThongTinThuoc);
		pnXemThongTinThuoc.setLayout(null);

		JButton btnXemThongTinThuoc = new JButton("XEM TH\u00D4NG TIN THU\u1ED0C");
		btnXemThongTinThuoc.setHorizontalAlignment(SwingConstants.LEFT);
		btnXemThongTinThuoc.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnXemThongTinThuoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnXemThongTinThuoc.setBounds(93, 0, 245, 52);
		pnXemThongTinThuoc.add(btnXemThongTinThuoc);

		JPanel pnLapHoaDon = new JPanel();
		pnLapHoaDon.setBackground(SystemColor.controlHighlight);
		pnLapHoaDon.setBounds(0, 413, 338, 52);
		pnChucNang.add(pnLapHoaDon);
		pnLapHoaDon.setLayout(null);

		JButton btnLapHoaDon = new JButton("L\u1EACP H\u00D3A \u0110\u01A0N");
		btnLapHoaDon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLapHoaDon.setHorizontalAlignment(SwingConstants.LEFT);
		btnLapHoaDon.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLapHoaDon.setBounds(93, 0, 245, 52);
		pnLapHoaDon.add(btnLapHoaDon);

		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(39, 24, 224, 121);
		pnChucNang.add(lblLogo);
		lblLogo.setHorizontalAlignment(SwingConstants.TRAILING);

		JPanel pnThemTTThuoc = new JPanel();
		pnThemTTThuoc.setBackground(SystemColor.controlHighlight);
		pnThemTTThuoc.setBounds(0, 166, 338, 52);
		pnChucNang.add(pnThemTTThuoc);
		pnThemTTThuoc.setLayout(null);

		JButton btnThemTTThuoc = new JButton("TH\u00CAM TH\u00D4NG TIN THU\u1ED0C");
		btnThemTTThuoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.setVisible(false);
				GDThemTTThuoc ql = new GDThemTTThuoc();
				ql.showWindow();
			}	
		});
		btnThemTTThuoc.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnThemTTThuoc.setBounds(89, 0, 249, 52);
		pnThemTTThuoc.add(btnThemTTThuoc);

		JLabel lblTieuDe = new JLabel("TI\u1EC6M THU\u1ED0C 3T");
		lblTieuDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblTieuDe.setForeground(new Color(222, 184, 135));
		lblTieuDe.setBackground(new Color(255, 255, 255));
		lblTieuDe.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblTieuDe.setBounds(336, 46, 476, 96);
		pnChinh.add(lblTieuDe);

		JLabel lblHinhChinh = new JLabel("");
		lblHinhChinh.setBounds(577, 163, 235, 321);
		pnChinh.add(lblHinhChinh);

	}
}
