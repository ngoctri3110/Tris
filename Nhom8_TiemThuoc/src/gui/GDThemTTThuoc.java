package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class GDThemTTThuoc {
	private static JTable table;
	private static JTextField txtMaThuoc;
	private static JTextField txtTenThuoc;
	private static JTextField txtNCC;
	private static JTextField txtGiaThuoc;
	private static JTextField txtCongDung;
	private static JTextField txtSoLuong;
	private static JTextField txtNSX;
	private static JTextField txtNHH;
	private static JComboBox cboDonVi;

	public static void main(String[] args) {
		showWindow();

	}

	public static void showWindow() {
		JFrame frame = new JFrame("GiaoDienThem");
		frame.setBounds(200, 200, 1200, 670);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel pnChinh = new JPanel();
		pnChinh.setBackground(new Color(127, 255, 212));
		pnChinh.setBounds(0, 0, 1186, 633);
		frame.getContentPane().add(pnChinh);
		pnChinh.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(250, 128, 114)));
		pnChinh.setLayout(null);
		
		JPanel pnTieuDe = new JPanel();
		pnTieuDe.setBounds(21, 22, 1140, 61);
		pnChinh.add(pnTieuDe);
		pnTieuDe.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(250, 128, 114)));
		pnTieuDe.setBackground(new Color(127, 255, 212));
		pnTieuDe.setLayout(null);
		
		JLabel lblTieuDe = new JLabel("NH\u1EACP TH\u00D4NG TIN THU\u1ED0C");
		lblTieuDe.setForeground(new Color(138, 43, 226));
		lblTieuDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblTieuDe.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTieuDe.setBounds(373, 10, 432, 41);
		pnTieuDe.add(lblTieuDe);
		
		JPanel pnNhapThongTin = new JPanel();
		pnNhapThongTin.setBackground(new Color(46, 139, 87));
		pnNhapThongTin.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(250, 128, 114)));
		pnNhapThongTin.setBounds(21, 93, 428, 441);
		pnChinh.add(pnNhapThongTin);
		pnNhapThongTin.setLayout(null);
		
		JLabel lblMaThuoc = new JLabel("M\u00E3 thu\u1ED1c:");
		lblMaThuoc.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMaThuoc.setBounds(24, 26, 77, 34);
		pnNhapThongTin.add(lblMaThuoc);
		
		txtMaThuoc = new JTextField();
		txtMaThuoc.setBounds(129, 31, 273, 27);
		pnNhapThongTin.add(txtMaThuoc);
		txtMaThuoc.setColumns(10);
		
		JLabel lblTenThuoc = new JLabel("T\u00EAn thu\u1ED1c:");
		lblTenThuoc.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTenThuoc.setBounds(24, 67, 77, 27);
		pnNhapThongTin.add(lblTenThuoc);
		
		txtTenThuoc = new JTextField();
		txtTenThuoc.setBounds(129, 68, 273, 28);
		pnNhapThongTin.add(txtTenThuoc);
		txtTenThuoc.setColumns(10);
		
		JLabel lblNCC = new JLabel("Nh\u00E0 cung c\u1EA5p:");
		lblNCC.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNCC.setBounds(24, 104, 93, 27);
		pnNhapThongTin.add(lblNCC);
		
		txtNCC = new JTextField();
		txtNCC.setColumns(10);
		txtNCC.setBounds(129, 106, 273, 28);
		pnNhapThongTin.add(txtNCC);
		
		txtGiaThuoc = new JTextField();
		txtGiaThuoc.setColumns(10);
		txtGiaThuoc.setBounds(129, 141, 273, 28);
		pnNhapThongTin.add(txtGiaThuoc);
		
		txtCongDung = new JTextField();
		txtCongDung.setColumns(10);
		txtCongDung.setBounds(129, 192, 273, 28);
		pnNhapThongTin.add(txtCongDung);
		
		txtSoLuong = new JTextField();
		txtSoLuong.setColumns(10);
		txtSoLuong.setBounds(129, 230, 273, 28);
		pnNhapThongTin.add(txtSoLuong);
		
		txtNSX = new JTextField();
		txtNSX.setColumns(10);
		txtNSX.setBounds(129, 318, 273, 28);
		pnNhapThongTin.add(txtNSX);
		
		txtNHH = new JTextField();
		txtNHH.setColumns(10);
		txtNHH.setBounds(129, 373, 273, 28);
		pnNhapThongTin.add(txtNHH);
		
		JLabel lblGiaThuoc = new JLabel("Gi\u00E1 thu\u1ED1c:");
		lblGiaThuoc.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGiaThuoc.setBounds(24, 141, 77, 31);
		pnNhapThongTin.add(lblGiaThuoc);
		
		JLabel lblCongDung = new JLabel("C\u00F4ng d\u1EE5ng:");
		lblCongDung.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCongDung.setBounds(24, 191, 93, 27);
		pnNhapThongTin.add(lblCongDung);
		
		JLabel lblSoLuong = new JLabel("S\u1ED1 l\u01B0\u1EE3ng:");
		lblSoLuong.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSoLuong.setBounds(24, 229, 93, 27);
		pnNhapThongTin.add(lblSoLuong);
		
		JLabel lblDonVi = new JLabel("\u0110\u01A1n v\u1ECB:");
		lblDonVi.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDonVi.setBounds(24, 280, 93, 27);
		pnNhapThongTin.add(lblDonVi);
		
		JLabel lblNSX = new JLabel("Ng\u00E0y s\u1EA3n xu\u1EA5t:");
		lblNSX.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNSX.setBounds(24, 318, 105, 27);
		pnNhapThongTin.add(lblNSX);
		
		JLabel lblNHH = new JLabel("Ng\u00E0y h\u1EBFt h\u1EA1n:");
		lblNHH.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNHH.setBounds(24, 373, 105, 27);
		pnNhapThongTin.add(lblNHH);
		
		cboDonVi = new JComboBox();
	 	cboDonVi.setBounds(129, 278, 273, 27);
		pnNhapThongTin.add(cboDonVi);
		
		JPanel pnBangDuLieu = new JPanel();
		pnBangDuLieu.setBackground(new Color(127, 255, 212));
		pnBangDuLieu.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(250, 128, 114)));
		pnBangDuLieu.setBounds(461, 93, 700, 441);
		pnChinh.add(pnBangDuLieu);
		pnBangDuLieu.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 20, 656, 399);
		pnBangDuLieu.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 thu\u1ED1c", "T\u00EAn thu\u1ED1c", "Nh\u00E0 cung c\u1EA5p", "Gi\u00E1 thu\u1ED1c", "C\u00F4ng d\u1EE5ng", "S\u1ED1 l\u01B0\u1EE3ng", "\u0110\u01A1n v\u1ECB", "Ng\u00E0y s\u1EA3n xu\u1EA5t", "Ng\u00E0y h\u1EBFt h\u1EA1n"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(94);
		table.getColumnModel().getColumn(3).setPreferredWidth(58);
		table.getColumnModel().getColumn(4).setPreferredWidth(81);
		table.getColumnModel().getColumn(5).setPreferredWidth(51);
		table.getColumnModel().getColumn(6).setPreferredWidth(46);
		scrollPane.setViewportView(table);
		
		JPanel pnChucNang = new JPanel();
		pnChucNang.setBackground(new Color(127, 255, 212));
		pnChucNang.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(250, 128, 114)));
		pnChucNang.setBounds(21, 544, 1140, 68);
		pnChinh.add(pnChucNang);
		pnChucNang.setLayout(null);
		
		JButton btnThem = new JButton("Th\u00EAm ");
		btnThem.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnThem.setBounds(256, 10, 111, 35);
		pnChucNang.add(btnThem);
		
		JButton btnNewButton = new JButton("Quay L\u1EA1i");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				GDChinh c = new GDChinh();
				c.showWindow();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(939, 10, 127, 35);
		pnChucNang.add(btnNewButton);
		
		JButton btnXoaTrang = new JButton("X\u00F3a Tr\u1EAFng");
		btnXoaTrang.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnXoaTrang.setBounds(428, 10, 138, 34);
		pnChucNang.add(btnXoaTrang);
		
		JButton btnLuu = new JButton("L\u01B0u");
		btnLuu.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLuu.setBounds(687, 10, 103, 30);
		pnChucNang.add(btnLuu);
		
		JPanel panel = new JPanel();
		panel.setBounds(42, 123, 541, 434);

		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
	}
}
