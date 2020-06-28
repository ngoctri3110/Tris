package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.border.MatteBorder;

public class GD_Chinh extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GD_Chinh frame = new GD_Chinh();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GD_Chinh() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 128, 0)));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);

		JPanel pnChinh = new JPanel();
		pnChinh.setBackground(new Color(47, 79, 79));
		pnChinh.setBounds(0, 0, 886, 563);
		getContentPane().add(pnChinh);
		pnChinh.setLayout(null);

		JPanel pnChucNang = new JPanel();
		pnChucNang.setBackground(new Color(0, 128, 128));
		pnChucNang.setBounds(0, 0, 338, 563);
		pnChinh.add(pnChucNang);
		pnChucNang.setLayout(null);

		JPanel pnQuanLyThuoc = new JPanel();
		pnQuanLyThuoc.setBounds(0, 248, 338, 52);
		pnQuanLyThuoc.setBackground(SystemColor.controlHighlight);
		pnChucNang.add(pnQuanLyThuoc);
		pnQuanLyThuoc.setLayout(null);

		JButton btnCapNhatThuoc = new JButton("  CẬP NHẬT THUỐC");
		btnCapNhatThuoc.setHorizontalAlignment(SwingConstants.LEFT);
		Image img_CapNhatThuoc = new ImageIcon(this.getClass().getResource("/img/capnhat.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		btnCapNhatThuoc.setIcon(new ImageIcon(img_CapNhatThuoc));
		btnCapNhatThuoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GD__CapNhatThuoc c = new GD__CapNhatThuoc();
				c.setVisible(true);
				dispose();
			}
		});
		btnCapNhatThuoc.setBounds(0, 0, 338, 52);
		pnQuanLyThuoc.add(btnCapNhatThuoc);
		btnCapNhatThuoc.setFont(new Font("Tahoma", Font.BOLD, 16));

		JPanel pnXemThongTinThuoc = new JPanel();
		pnXemThongTinThuoc.setBounds(0, 329, 338, 52);
		pnXemThongTinThuoc.setBackground(SystemColor.controlHighlight);
		pnChucNang.add(pnXemThongTinThuoc);
		pnXemThongTinThuoc.setLayout(null);

		JButton btnXemThongTinThuoc = new JButton("  XEM THÔNG TIN THUỐC");
		btnXemThongTinThuoc.setHorizontalAlignment(SwingConstants.LEFT);
		Image img_XemThongTinThuoc = new ImageIcon(this.getClass().getResource("/img/xem.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		btnXemThongTinThuoc.setIcon(new ImageIcon(img_XemThongTinThuoc));
		btnXemThongTinThuoc.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnXemThongTinThuoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GD_XemTTThuoc().setVisible(true);
				dispose();
			}
		});
		btnXemThongTinThuoc.setBounds(0, 0, 338, 52);
		pnXemThongTinThuoc.add(btnXemThongTinThuoc);

		JPanel pnLapHoaDon = new JPanel();
		pnLapHoaDon.setBounds(0, 413, 338, 52);
		pnLapHoaDon.setBackground(SystemColor.controlHighlight);
		pnChucNang.add(pnLapHoaDon);
		pnLapHoaDon.setLayout(null);

		JButton btnLapHoaDon = new JButton("  LẬP HÓA ĐƠN");
		btnLapHoaDon.setHorizontalAlignment(SwingConstants.LEFT);
		Image img_LapHoaDon = new ImageIcon(this.getClass().getResource("/img/hoadon.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		btnLapHoaDon.setIcon(new ImageIcon(img_LapHoaDon));
		btnLapHoaDon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GD_LapHoaDon l = new GD_LapHoaDon();
				l.setVisible(true);
				dispose();
			}
		});
		btnLapHoaDon.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLapHoaDon.setBounds(0, 0, 338, 52);
		pnLapHoaDon.add(btnLapHoaDon);

		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(90, 10, 150, 146);
		pnChucNang.add(lblLogo);
		Image img = new ImageIcon(this.getClass().getResource("/img/tiemthuoc.png")).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		lblLogo.setIcon(new ImageIcon(img));
		lblLogo.setHorizontalAlignment(SwingConstants.TRAILING);

		JPanel pnThemTTThuoc = new JPanel();
		pnThemTTThuoc.setBounds(0, 166, 338, 52);
		pnThemTTThuoc.setBackground(SystemColor.controlHighlight);
		pnChucNang.add(pnThemTTThuoc);
		pnThemTTThuoc.setLayout(new CardLayout(0, 0));

		JButton btnThemTTThuoc = new JButton("  THÊM THÔNG TIN THUỐC");
		btnThemTTThuoc.setHorizontalAlignment(SwingConstants.LEFT);
		pnThemTTThuoc.add(btnThemTTThuoc, "name_386875696912900");
		btnThemTTThuoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GD_ThemTTThuoc them = new GD_ThemTTThuoc();
				them.setVisible(true);
				dispose();

			}	
		});
		btnThemTTThuoc.setFont(new Font("Tahoma", Font.BOLD, 16));
		Image img_IconThem = new ImageIcon(this.getClass().getResource("/img/themthuoc.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		btnThemTTThuoc.setIcon(new ImageIcon(img_IconThem));
		JLabel lblTieuDe = new JLabel("TI\u1EC6M THU\u1ED0C 3T");
		lblTieuDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblTieuDe.setForeground(new Color(222, 184, 135));
		lblTieuDe.setBackground(new Color(255, 255, 255));
		lblTieuDe.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblTieuDe.setBounds(372, 0, 476, 96);
		pnChinh.add(lblTieuDe);

		JLabel lblHinhChinh = new JLabel("");
		lblHinhChinh.setBounds(337, 0, 547, 563);
		pnChinh.add(lblHinhChinh);
		Image img1 = new ImageIcon(this.getClass().getResource("/img/bacsi.jpg")).getImage().getScaledInstance(500, 400, Image.SCALE_SMOOTH);
		lblHinhChinh.setIcon(new ImageIcon(img1));
		lblHinhChinh.setHorizontalAlignment(SwingConstants.CENTER);
	}

}
