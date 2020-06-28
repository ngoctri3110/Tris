package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GD_XemTTThuoc extends JFrame {

	private JPanel contentPane;
	private JTable tableTimKiem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GD_XemTTThuoc frame = new GD_XemTTThuoc();
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
	public GD_XemTTThuoc() {
		setTitle("TÌM KIẾM THÔNG TIN THUỐC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 670);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel pnChinh = new JPanel();
		pnChinh.setBackground(new Color(127, 255, 212));
		pnChinh.setBounds(0, 0, 1184, 631);
		contentPane.add(pnChinh);
		pnChinh.setLayout(null);
		
		JPanel pNorth = new JPanel();
		pNorth.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(250, 128, 114)));
		pNorth.setBackground(new Color(255, 228, 181));
		pNorth.setBounds(10, 11, 1164, 172);
		pnChinh.add(pNorth);
		pNorth.setLayout(null);
		
		JLabel lblTimKiem = new JLabel("Chọn mục cần tìm kiếm:");
		lblTimKiem.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTimKiem.setBounds(10, 11, 191, 25);
		pNorth.add(lblTimKiem);
		
		JComboBox cboTimMaThuoc = new JComboBox();
		cboTimMaThuoc.setBounds(10, 76, 88, 22);
		pNorth.add(cboTimMaThuoc);
		cboTimMaThuoc.setEditable(true);
		
		JComboBox cboTimTenThuoc = new JComboBox();
		cboTimTenThuoc.setBounds(108, 76, 154, 22);
		pNorth.add(cboTimTenThuoc);
		cboTimTenThuoc.setEditable(true);
		
		JComboBox cboTimNCC = new JComboBox();
		cboTimNCC.setBounds(272, 76, 143, 22);
		pNorth.add(cboTimNCC);
		cboTimNCC.setEditable(true);
		
		JComboBox cboTimGiaThuoc = new JComboBox();
		cboTimGiaThuoc.setBounds(425, 76, 103, 22);
		pNorth.add(cboTimGiaThuoc);
		cboTimGiaThuoc.setEditable(true);
		
		JComboBox cboTimCongDung = new JComboBox();
		cboTimCongDung.setBounds(538, 76, 167, 22);
		pNorth.add(cboTimCongDung);
		cboTimCongDung.setEditable(true);
		
		JComboBox cboTimDonVi = new JComboBox();
		cboTimDonVi.setBounds(813, 76, 103, 22);
		pNorth.add(cboTimDonVi);
		cboTimDonVi.setEditable(true);
		
		JComboBox cboTimSL = new JComboBox();
		cboTimSL.setBounds(715, 76, 88, 22);
		pNorth.add(cboTimSL);
		cboTimSL.setEditable(true);
		
		JComboBox cboTimNSX = new JComboBox();
		cboTimNSX.setBounds(926, 76, 103, 22);
		pNorth.add(cboTimNSX);
		cboTimNSX.setEditable(true);
		
		JComboBox cboTimNHH = new JComboBox();
		cboTimNHH.setBounds(1039, 76, 115, 22);
		pNorth.add(cboTimNHH);
		cboTimNHH.setEditable(true);
		
		JLabel lblMaThuoc = new JLabel("Mã thuốc");
		lblMaThuoc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMaThuoc.setBounds(10, 51, 69, 14);
		pNorth.add(lblMaThuoc);
		
		JLabel lblTenThuoc = new JLabel("Tên thuốc");
		lblTenThuoc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTenThuoc.setBounds(108, 51, 69, 14);
		pNorth.add(lblTenThuoc);
		
		JLabel lblNhCungCp = new JLabel("Nhà cung cấp");
		lblNhCungCp.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNhCungCp.setBounds(272, 46, 88, 25);
		pNorth.add(lblNhCungCp);
		
		JLabel lblGiaThuoc = new JLabel("Giá thuốc");
		lblGiaThuoc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGiaThuoc.setBounds(425, 51, 69, 14);
		pNorth.add(lblGiaThuoc);
		
		JLabel lblCngDng = new JLabel("Công dụng");
		lblCngDng.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCngDng.setBounds(538, 48, 69, 20);
		pNorth.add(lblCngDng);
		
		JLabel lblSLng = new JLabel("Số lượng");
		lblSLng.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSLng.setBounds(715, 48, 69, 20);
		pNorth.add(lblSLng);
		
		JLabel lblDonVi = new JLabel("Đơn vị");
		lblDonVi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDonVi.setBounds(813, 51, 69, 14);
		pNorth.add(lblDonVi);
		
		JLabel lblNSX = new JLabel("Ngày sản xuất");
		lblNSX.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNSX.setBounds(926, 49, 88, 19);
		pNorth.add(lblNSX);
		
		JLabel lblNHH = new JLabel("Ngày hết hạn");
		lblNHH.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNHH.setBounds(1039, 49, 88, 19);
		pNorth.add(lblNHH);
		
		JButton btnTimKiem = new JButton("Tìm");
		btnTimKiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTimKiem.setBackground(new Color(0, 255, 255));
		btnTimKiem.setForeground(new Color(199, 21, 133));
		btnTimKiem.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnTimKiem.setBounds(813, 11, 154, 33);
		pNorth.add(btnTimKiem);
		Image img_TK = new ImageIcon(this.getClass().getResource("/img/search.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		btnTimKiem.setIcon(new ImageIcon(img_TK));
		
		JLabel lblH1 = new JLabel("");
		lblH1.setBounds(30, 109, 52, 52);
		pNorth.add(lblH1);
		Image H1 = new ImageIcon(this.getClass().getResource("/img/qr-code.png")).getImage().getScaledInstance(52, 52, Image.SCALE_SMOOTH);
		lblH1.setIcon(new ImageIcon(H1));
		
		JLabel lblH2 = new JLabel("");
		lblH2.setBounds(158, 109, 52, 52);
		pNorth.add(lblH2);
		Image H2 = new ImageIcon(this.getClass().getResource("/img/pill.png")).getImage().getScaledInstance(52, 52, Image.SCALE_SMOOTH);
		lblH2.setIcon(new ImageIcon(H2));
		
		JLabel lblH3 = new JLabel("");
		lblH3.setBounds(320, 109, 52, 52);
		pNorth.add(lblH3);
		Image H3 = new ImageIcon(this.getClass().getResource("/img/product.png")).getImage().getScaledInstance(52, 52, Image.SCALE_SMOOTH);
		lblH3.setIcon(new ImageIcon(H3));
		
		JLabel lblH4 = new JLabel("");
		lblH4.setBounds(452, 109, 52, 52);
		pNorth.add(lblH4);
		Image H4 = new ImageIcon(this.getClass().getResource("/img/money.png")).getImage().getScaledInstance(52, 52, Image.SCALE_SMOOTH);
		lblH4.setIcon(new ImageIcon(H4));
		
		JLabel lblH5 = new JLabel("");
		lblH5.setBounds(597, 109, 52, 52);
		pNorth.add(lblH5);
		Image H5 = new ImageIcon(this.getClass().getResource("/img/medicine.png")).getImage().getScaledInstance(52, 52, Image.SCALE_SMOOTH);
		lblH5.setIcon(new ImageIcon(H5));
		
		JLabel lblH6 = new JLabel("");
		lblH6.setBounds(732, 109, 52, 52);
		pNorth.add(lblH6);
		Image H6 = new ImageIcon(this.getClass().getResource("/img/overflow.png")).getImage().getScaledInstance(52, 52, Image.SCALE_SMOOTH);
		lblH6.setIcon(new ImageIcon(H6));
		
		JLabel lblH7 = new JLabel("");
		lblH7.setBounds(838, 109, 52, 52);
		pNorth.add(lblH7);
		Image H7 = new ImageIcon(this.getClass().getResource("/img/star.png")).getImage().getScaledInstance(52, 52, Image.SCALE_SMOOTH);
		lblH7.setIcon(new ImageIcon(H7));
		
		JLabel lblH10 = new JLabel("");
		lblH10.setBounds(956, 109, 52, 52);
		pNorth.add(lblH10);
		Image H10 = new ImageIcon(this.getClass().getResource("/img/calendar.png")).getImage().getScaledInstance(52, 52, Image.SCALE_SMOOTH);
		lblH10.setIcon(new ImageIcon(H10));
		
		JLabel lblH9 = new JLabel("");
		lblH9.setBounds(1075, 109, 52, 52);
		pNorth.add(lblH9);
		Image H9 = new ImageIcon(this.getClass().getResource("/img/cancel.png")).getImage().getScaledInstance(52, 52, Image.SCALE_SMOOTH);
		lblH9.setIcon(new ImageIcon(H9));
		
		JButton btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.setBackground(new Color(0, 255, 255));
		btnQuayLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GD_Chinh().setVisible(true);
				dispose();
			}
		});
		btnQuayLai.setForeground(new Color(199, 21, 133));
		btnQuayLai.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnQuayLai.setBounds(1000, 11, 154, 33);
		pNorth.add(btnQuayLai);
		Image h_quaylai = new ImageIcon(this.getClass().getResource("/img/trove.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		btnQuayLai.setIcon(new ImageIcon(h_quaylai));
		
		JButton btnLamMoiDS = new JButton("Làm mới danh sách");
		btnLamMoiDS.setForeground(new Color(199, 21, 133));
		btnLamMoiDS.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnLamMoiDS.setBackground(new Color(0, 255, 255));
		btnLamMoiDS.setBounds(507, 11, 268, 33);
		pNorth.add(btnLamMoiDS);
		Image h_LamMoi = new ImageIcon(this.getClass().getResource("/img/lammoids.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		btnLamMoiDS.setIcon(new ImageIcon(h_LamMoi));
		
		JPanel pCenter = new JPanel();
		pCenter.setBackground(new Color(255, 255, 0));
		pCenter.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 127, 80)));
		pCenter.setBounds(10, 194, 1164, 426);
		pnChinh.add(pCenter);
		pCenter.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 1144, 404);
		pCenter.add(scrollPane);
		
		tableTimKiem = new JTable();
		tableTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tableTimKiem.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 thu\u1ED1c", "T\u00EAn thu\u1ED1c", "Nh\u00E0 cung c\u1EA5p", "Gi\u00E1 thu\u1ED1c", "C\u00F4ng d\u1EE5ng", "S\u1ED1 l\u01B0\u1EE3ng", "\u0110\u01A1n v\u1ECB", "Ng\u00E0y s\u1EA3n xu\u1EA5t", "Ng\u00E0y h\u1EBFt h\u1EA1n"
			}
		));
		tableTimKiem.getColumnModel().getColumn(0).setPreferredWidth(55);
		tableTimKiem.getColumnModel().getColumn(1).setPreferredWidth(119);
		tableTimKiem.getColumnModel().getColumn(2).setPreferredWidth(110);
		tableTimKiem.getColumnModel().getColumn(4).setPreferredWidth(134);
		tableTimKiem.getColumnModel().getColumn(5).setPreferredWidth(53);
		scrollPane.setViewportView(tableTimKiem);
	}
}
