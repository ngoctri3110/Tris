package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GD_ThemTTThuoc extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaThuoc;
	private JTextField txtTenThuoc;
	private JTextField txtNCC;
	private JTextField txtGiaThuoc;
	private JTextField txtCongDung;
	private JTextField txtSoLuong;
	private JTextField txtNSX;
	private JTextField txtNHH;
	private JComboBox cboDonVi;
	private JTable tableNhapTTThuoc;
	private DefaultTableModel modelNhapTTThuoc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GD_ThemTTThuoc frame = new GD_ThemTTThuoc();
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
	public GD_ThemTTThuoc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 670);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		setTitle("NHẬP THÔNG TIN THUỐC");
		setResizable(false);


		JPanel pnChinh = new JPanel();
		pnChinh.setBackground(new Color(127, 255, 212));
		pnChinh.setBounds(0, 0, 1186, 633);
		getContentPane().add(pnChinh);
		pnChinh.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(250, 128, 114)));
		pnChinh.setLayout(null);

		JPanel pnTieuDe = new JPanel();
		pnTieuDe.setBounds(18, 15, 1140, 61);
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
		pnNhapThongTin.setBounds(18, 85, 428, 441);
		pnChinh.add(pnNhapThongTin);
		pnNhapThongTin.setLayout(null);

		JLabel lblMaThuoc = new JLabel("M\u00E3 thu\u1ED1c:");
		lblMaThuoc.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMaThuoc.setBounds(24, 48, 77, 34);
		pnNhapThongTin.add(lblMaThuoc);

		txtMaThuoc = new JTextField();
		txtMaThuoc.setBounds(127, 53, 273, 27);
		pnNhapThongTin.add(txtMaThuoc);
		txtMaThuoc.setColumns(10);

		JLabel lblTenThuoc = new JLabel("T\u00EAn thu\u1ED1c:");
		lblTenThuoc.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTenThuoc.setBounds(24, 90, 77, 27);
		pnNhapThongTin.add(lblTenThuoc);

		txtTenThuoc = new JTextField();
		txtTenThuoc.setBounds(127, 90, 273, 28);
		pnNhapThongTin.add(txtTenThuoc);
		txtTenThuoc.setColumns(10);

		JLabel lblNCC = new JLabel("Nh\u00E0 cung c\u1EA5p:");
		lblNCC.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNCC.setBounds(24, 128, 93, 27);
		pnNhapThongTin.add(lblNCC);

		txtNCC = new JTextField();
		txtNCC.setColumns(10);
		txtNCC.setBounds(127, 128, 273, 28);
		pnNhapThongTin.add(txtNCC);

		txtGiaThuoc = new JTextField();
		txtGiaThuoc.setColumns(10);
		txtGiaThuoc.setBounds(127, 167, 273, 28);
		pnNhapThongTin.add(txtGiaThuoc);

		txtCongDung = new JTextField();
		txtCongDung.setColumns(10);
		txtCongDung.setBounds(127, 206, 273, 28);
		pnNhapThongTin.add(txtCongDung);

		txtSoLuong = new JTextField();
		txtSoLuong.setColumns(10);
		txtSoLuong.setBounds(127, 245, 273, 28);
		pnNhapThongTin.add(txtSoLuong);

		txtNSX = new JTextField();
		txtNSX.setColumns(10);
		txtNSX.setBounds(127, 322, 273, 28);
		pnNhapThongTin.add(txtNSX);

		txtNHH = new JTextField();
		txtNHH.setColumns(10);
		txtNHH.setBounds(127, 361, 273, 28);
		pnNhapThongTin.add(txtNHH);

		JLabel lblGiaThuoc = new JLabel("Gi\u00E1 thu\u1ED1c:");
		lblGiaThuoc.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGiaThuoc.setBounds(24, 165, 77, 31);
		pnNhapThongTin.add(lblGiaThuoc);

		JLabel lblCongDung = new JLabel("C\u00F4ng d\u1EE5ng:");
		lblCongDung.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCongDung.setBounds(24, 206, 93, 27);
		pnNhapThongTin.add(lblCongDung);

		JLabel lblSoLuong = new JLabel("S\u1ED1 l\u01B0\u1EE3ng:");
		lblSoLuong.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSoLuong.setBounds(24, 245, 93, 27);
		pnNhapThongTin.add(lblSoLuong);

		JLabel lblDonVi = new JLabel("\u0110\u01A1n v\u1ECB:");
		lblDonVi.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDonVi.setBounds(24, 283, 93, 27);
		pnNhapThongTin.add(lblDonVi);

		JLabel lblNSX = new JLabel("Ng\u00E0y s\u1EA3n xu\u1EA5t:");
		lblNSX.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNSX.setBounds(24, 322, 105, 27);
		pnNhapThongTin.add(lblNSX);

		JLabel lblNHH = new JLabel("Ng\u00E0y h\u1EBFt h\u1EA1n:");
		lblNHH.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNHH.setBounds(24, 361, 105, 27);
		pnNhapThongTin.add(lblNHH);

		cboDonVi = new JComboBox();
		cboDonVi.setBounds(127, 284, 273, 27);
		pnNhapThongTin.add(cboDonVi);

		JPanel pnBangDuLieu = new JPanel();
		pnBangDuLieu.setBackground(new Color(127, 255, 212));
		pnBangDuLieu.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(250, 128, 114)));
		pnBangDuLieu.setBounds(458, 85, 700, 441);
		pnChinh.add(pnBangDuLieu);
		pnBangDuLieu.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(192, 192, 192));
		scrollPane.setBounds(10, 11, 680, 420);
		pnBangDuLieu.add(scrollPane);

		tableNhapTTThuoc = new JTable();
		tableNhapTTThuoc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = tableNhapTTThuoc.getSelectedRow();
				txtMaThuoc.setText(modelNhapTTThuoc.getValueAt(row, 0).toString());
				txtTenThuoc.setText(modelNhapTTThuoc.getValueAt(row, 1).toString());
				txtNCC.setText(modelNhapTTThuoc.getValueAt(row, 2).toString());
				txtGiaThuoc.setText(modelNhapTTThuoc.getValueAt(row, 3).toString());
				txtCongDung.setText(modelNhapTTThuoc.getValueAt(row, 4).toString());
				txtSoLuong.setText(modelNhapTTThuoc.getValueAt(row, 5).toString());
				cboDonVi.setSelectedItem(modelNhapTTThuoc.getValueAt(row, 6).toString());
				txtNSX.setText(modelNhapTTThuoc.getValueAt(row, 7).toString());
				txtNHH.setText(modelNhapTTThuoc.getValueAt(row, 8).toString());
			}
		});
		tableNhapTTThuoc.setModel(modelNhapTTThuoc = new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"M\u00E3 thu\u1ED1c", "T\u00EAn thu\u1ED1c", "Nh\u00E0 cung c\u1EA5p", "Gi\u00E1 thu\u1ED1c", "C\u00F4ng d\u1EE5ng", "S\u1ED1 l\u01B0\u1EE3ng", "\u0110\u01A1n v\u1ECB", "Ng\u00E0y s\u1EA3n xu\u1EA5t", "Ng\u00E0y h\u1EBFt h\u1EA1n"
				}
				));
		tableNhapTTThuoc.getColumnModel().getColumn(1).setPreferredWidth(94);
		tableNhapTTThuoc.getColumnModel().getColumn(3).setPreferredWidth(58);
		tableNhapTTThuoc.getColumnModel().getColumn(4).setPreferredWidth(81);
		tableNhapTTThuoc.getColumnModel().getColumn(5).setPreferredWidth(51);
		tableNhapTTThuoc.getColumnModel().getColumn(6).setPreferredWidth(46);
		scrollPane.setViewportView(tableNhapTTThuoc);

		JPanel pnChucNang = new JPanel();
		pnChucNang.setBackground(new Color(127, 255, 212));
		pnChucNang.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(250, 128, 114)));
		pnChucNang.setBounds(18, 535, 1140, 68);
		pnChinh.add(pnChucNang);
		pnChucNang.setLayout(null);

		JButton btnThem = new JButton("Th\u00EAm ");
		btnThem.setForeground(new Color(153, 50, 204));
		btnThem.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnThem.setBounds(89, 15, 138, 35);
		Image img_Them= new ImageIcon(this.getClass().getResource("/img/them.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		btnThem.setIcon(new ImageIcon(img_Them));
		pnChucNang.add(btnThem);

		JButton btnQuayLai = new JButton("Quay L\u1EA1i");
		btnQuayLai.setForeground(new Color(153, 50, 204));
		btnQuayLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GD_Chinh chinh = new GD_Chinh();
				chinh.setVisible(true);
				dispose();
			}
		});
		btnQuayLai.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnQuayLai.setBounds(904, 15, 138, 35);
		Image img_QuayLai = new ImageIcon(this.getClass().getResource("/img/quaylai.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		btnQuayLai.setIcon(new ImageIcon(img_QuayLai));
		pnChucNang.add(btnQuayLai);

		JButton btnXoaTrang = new JButton("X\u00F3a Tr\u1EAFng");
		btnXoaTrang.setForeground(new Color(153, 50, 204));
		Image img_XoaTrang = new ImageIcon(this.getClass().getResource("/img/xoarong.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		btnXoaTrang.setIcon(new ImageIcon(img_XoaTrang));
		btnXoaTrang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object o = e.getSource();
				if(o.equals(btnXoaTrang)) {
					txtMaThuoc.setText("");
					txtTenThuoc.setText("");
					txtNCC.setText("");
					txtGiaThuoc.setText("");
					txtCongDung.setText("");
					txtSoLuong.setText("");
					txtNSX.setText("");
					txtNHH.setText("");
					txtMaThuoc.requestFocus();
				}

			}
		});
		btnXoaTrang.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnXoaTrang.setBounds(344, 15, 145, 35);
		pnChucNang.add(btnXoaTrang);

		JButton btnLuu = new JButton("L\u01B0u");
		btnLuu.setForeground(new Color(153, 50, 204));
		btnLuu.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLuu.setBounds(635, 15, 138, 35);
		Image img_Luu = new ImageIcon(this.getClass().getResource("/img/luu.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		btnLuu.setIcon(new ImageIcon(img_Luu));
		pnChucNang.add(btnLuu);

		JPanel panel = new JPanel();
		panel.setBounds(42, 123, 541, 434);

	}

}
