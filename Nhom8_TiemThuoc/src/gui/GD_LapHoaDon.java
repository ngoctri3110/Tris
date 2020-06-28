package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GD_LapHoaDon extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaHoaDon;
	private JTextField txtNLHD;
	private JTextField txtTenThuoc;
	private JTextField txtSoLuong;
	private JTextField txtHoTenKH;
	private JTextField txtNamSinh;
	private JTextField txtDiaChi;
	private JTextField txtHoTenNV;
	private JTable tableCTHD;
	private JTextField txtTongTien;
	private JTable tableHD;
	private DefaultTableModel modelHD;
	private DefaultTableModel modelCTHD;
	private JComboBox<String> cboGioiTinh;
	private JComboBox<String> cboDonViTinh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GD_LapHoaDon frame = new GD_LapHoaDon();
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
	public GD_LapHoaDon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 670);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		JPanel pnChinh = new JPanel();
		pnChinh.setBackground(new Color(127, 255, 212));
		pnChinh.setBounds(0, 0, 1186, 633);
		contentPane.add(pnChinh);
		pnChinh.setLayout(null);
		
		JPanel pnHoaDon = new JPanel();
		pnHoaDon.setBorder(new TitledBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 99, 71)), "H\u00F3a \u0110\u01A1n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnHoaDon.setBounds(10, 10, 1166, 134);
		pnChinh.add(pnHoaDon);
		pnHoaDon.setLayout(null);
		
		JLabel lblMaHoaDon = new JLabel("M\u00E3 h\u00F3a \u0111\u01A1n:");
		lblMaHoaDon.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMaHoaDon.setBounds(27, 23, 80, 30);
		pnHoaDon.add(lblMaHoaDon);
		
		txtMaHoaDon = new JTextField();
		txtMaHoaDon.setBounds(117, 24, 143, 26);
		pnHoaDon.add(txtMaHoaDon);
		txtMaHoaDon.setColumns(10);
		
		JLabel lblNLHD = new JLabel("Ng\u00E0y l\u1EADp h\u00F3a \u0111\u01A1n:");
		lblNLHD.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNLHD.setBounds(814, 80, 124, 26);
		pnHoaDon.add(lblNLHD);
		
		txtNLHD = new JTextField();
		txtNLHD.setBounds(940, 80, 203, 26);
		pnHoaDon.add(txtNLHD);
		txtNLHD.setColumns(10);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setBounds(86, 80, 346, 26);
		pnHoaDon.add(txtDiaChi);
		txtDiaChi.setColumns(10);
		
		JLabel lblDiaChi = new JLabel("\u0110\u1ECBa ch\u1EC9:");
		lblDiaChi.setBounds(27, 80, 49, 26);
		pnHoaDon.add(lblDiaChi);
		lblDiaChi.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblHoTenNV = new JLabel("H\u1ECD t\u00EAn nh\u00E2n vi\u00EAn:");
		lblHoTenNV.setBounds(460, 80, 115, 26);
		pnHoaDon.add(lblHoTenNV);
		lblHoTenNV.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		txtHoTenNV = new JTextField();
		txtHoTenNV.setBounds(585, 80, 219, 26);
		pnHoaDon.add(txtHoTenNV);
		txtHoTenNV.setColumns(10);
		
		JLabel lblHoTenKH = new JLabel("H\u1ECD t\u00EAn kh\u00E1ch h\u00E0ng:");
		lblHoTenKH.setBounds(300, 22, 132, 30);
		pnHoaDon.add(lblHoTenKH);
		lblHoTenKH.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		txtHoTenKH = new JTextField();
		txtHoTenKH.setBounds(450, 25, 183, 26);
		pnHoaDon.add(txtHoTenKH);
		txtHoTenKH.setColumns(10);
		
		JLabel lblNamSinh = new JLabel("N\u0103m sinh:");
		lblNamSinh.setBounds(670, 22, 76, 30);
		pnHoaDon.add(lblNamSinh);
		lblNamSinh.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		txtNamSinh = new JTextField();
		txtNamSinh.setBounds(760, 25, 121, 26);
		pnHoaDon.add(txtNamSinh);
		txtNamSinh.setColumns(10);
		
		JLabel lblGioiTinh = new JLabel("Gi\u1EDBi t\u00EDnh:");
		lblGioiTinh.setBounds(920, 22, 68, 30);
		pnHoaDon.add(lblGioiTinh);
		lblGioiTinh.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JComboBox cboGioiTinh = new JComboBox();
		cboGioiTinh.setBounds(1000, 23, 100, 26);
		pnHoaDon.add(cboGioiTinh);
		
		JPanel pnCTHD = new JPanel();
		pnCTHD.setBorder(new TitledBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 99, 71)), "Chi Ti\u1EBFt H\u00F3a \u0110\u01A1n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnCTHD.setBounds(10, 154, 1166, 66);
		pnChinh.add(pnCTHD);
		pnCTHD.setLayout(null);
		
		txtTenThuoc = new JTextField();
		txtTenThuoc.setColumns(10);
		txtTenThuoc.setBounds(119, 22, 183, 26);
		pnCTHD.add(txtTenThuoc);
		
		JLabel lblTenThuoc = new JLabel("T\u00EAn thu\u1ED1c:");
		lblTenThuoc.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTenThuoc.setBounds(33, 22, 76, 26);
		pnCTHD.add(lblTenThuoc);
		
		JLabel lblSoLuong = new JLabel("S\u1ED1 l\u01B0\u1EE3ng:");
		lblSoLuong.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSoLuong.setBounds(590, 22, 62, 26);
		pnCTHD.add(lblSoLuong);
		
		txtSoLuong = new JTextField();
		txtSoLuong.setBounds(662, 22, 90, 26);
		pnCTHD.add(txtSoLuong);
		txtSoLuong.setColumns(10);
		
		JLabel lblDonViTinh = new JLabel("\u0110\u01A1n v\u1ECB t\u00EDnh:");
		lblDonViTinh.setBounds(339, 22, 81, 26);
		pnCTHD.add(lblDonViTinh);
		lblDonViTinh.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JComboBox cboDonViTinh = new JComboBox();
		cboDonViTinh.setEditable(true);
		cboDonViTinh.setBounds(430, 22, 121, 26);
		pnCTHD.add(cboDonViTinh);
		
		JLabel lblTongTien = new JLabel("Tổng tiền:");
		lblTongTien.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTongTien.setBounds(812, 22, 76, 26);
		pnCTHD.add(lblTongTien);
		
		txtTongTien = new JTextField();
		txtTongTien.setEditable(false);
		txtTongTien.setBounds(899, 22, 128, 26);
		pnCTHD.add(txtTongTien);
		txtTongTien.setColumns(10);
		
		
		JPanel pnBangHD = new JPanel();
		pnBangHD.setBorder(new TitledBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 99, 71)), "H\u00F3a \u0110\u01A1n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnBangHD.setBounds(10, 306, 628, 317);
		pnChinh.add(pnBangHD);
		pnBangHD.setLayout(null);
		
		JScrollPane scrollPaneHD = new JScrollPane();
		scrollPaneHD.setBounds(10, 14, 608, 295);
		pnBangHD.add(scrollPaneHD);
		
		tableHD = new JTable();
		tableHD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = tableHD.getSelectedRow();
				txtMaHoaDon.setText(modelHD.getValueAt(row, 0).toString());
				txtHoTenKH.setText(modelHD.getValueAt(row, 1).toString());
				txtNamSinh.setText(modelHD.getValueAt(row, 2).toString());
				cboGioiTinh.setSelectedItem(modelHD.getValueAt(row, 3).toString());
				txtDiaChi.setText(modelHD.getValueAt(row, 4).toString());
				txtHoTenNV.setText(modelHD.getValueAt(row, 5).toString());
				txtNLHD.setText(modelHD.getValueAt(row, 6).toString());
			}
		});
		tableHD.setModel(modelHD = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 h\u00F3a \u0111\u01A1n", "T\u00EAn kh\u00E1ch h\u00E0ng", "N\u0103m sinh", "Gi\u1EDBi t\u00EDnh", "\u0110\u1ECBa ch\u1EC9", "T\u00EAn nh\u00E2n vi\u00EAn", "Ng\u00E0y l\u1EADp"
			}
		));
		tableHD.getColumnModel().getColumn(1).setPreferredWidth(92);
		tableHD.getColumnModel().getColumn(2).setPreferredWidth(57);
		tableHD.getColumnModel().getColumn(3).setPreferredWidth(54);
		tableHD.getColumnModel().getColumn(4).setPreferredWidth(104);
		tableHD.getColumnModel().getColumn(5).setPreferredWidth(83);
		tableHD.getColumnModel().getColumn(6).setPreferredWidth(88);
		scrollPaneHD.setViewportView(tableHD);
		
		JPanel pnChucNang = new JPanel();
		pnChucNang.setBorder(new TitledBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 99, 71)), "Ch\u1EE9c N\u0103ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnChucNang.setBounds(10, 230, 1166, 66);
		pnChinh.add(pnChucNang);
		pnChucNang.setLayout(null);
		
		JButton btnThemHoaDon = new JButton("Thêm hóa đơn");
		btnThemHoaDon.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnThemHoaDon.setBounds(63, 18, 174, 33);
		Image img_ThemHD= new ImageIcon(this.getClass().getResource("/img/themhd.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		btnThemHoaDon.setIcon(new ImageIcon(img_ThemHD));
		pnChucNang.add(btnThemHoaDon);
		
		JButton btnLuu = new JButton("L\u01B0u");
		btnLuu.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLuu.setBounds(755, 18, 120, 33);
		Image img_Luu = new ImageIcon(this.getClass().getResource("/img/luu.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		btnLuu.setIcon(new ImageIcon(img_Luu));
		pnChucNang.add(btnLuu);
		
		JButton btnQuayLai = new JButton("Quay L\u1EA1i");
		btnQuayLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GD_Chinh chinh = new GD_Chinh();
				chinh.setVisible(true);
				dispose();
			}
		});
		btnQuayLai.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnQuayLai.setBounds(934, 18, 132, 33);
		Image img_QuayLai = new ImageIcon(this.getClass().getResource("/img/quaylai.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		btnQuayLai.setIcon(new ImageIcon(img_QuayLai));
		pnChucNang.add(btnQuayLai);
		
		JButton btnThemCTHD = new JButton("Thêm chi tiết hóa đơn");
		btnThemCTHD.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnThemCTHD.setBounds(288, 18, 214, 33);
		Image img_ThemCTHD= new ImageIcon(this.getClass().getResource("/img/themcthd.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		btnThemCTHD.setIcon(new ImageIcon(img_ThemCTHD));
		pnChucNang.add(btnThemCTHD);
		
		JButton btnXoaTrang = new JButton("Xóa trắng");
		btnXoaTrang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object o = e.getSource();
				if(o.equals(btnXoaTrang)) {
					txtMaHoaDon.setText("");
					txtHoTenKH.setText("");
					txtNamSinh.setText("");
					txtDiaChi.setText("");
					txtHoTenNV.setText("");
					txtNLHD.setText("");
					txtTenThuoc.setText("");
					txtSoLuong.setText("");
					txtTongTien.setText("");
					txtMaHoaDon.requestFocus();
				}
			}
		});
		btnXoaTrang.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnXoaTrang.setBounds(559, 18, 135, 33);
		Image img_XoaTrang = new ImageIcon(this.getClass().getResource("/img/xoatrang.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		btnXoaTrang.setIcon(new ImageIcon(img_XoaTrang));
		pnChucNang.add(btnXoaTrang);
		
		JPanel pnBangCTHD = new JPanel();
		pnBangCTHD.setBorder(new TitledBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 99, 71)), "Chi Ti\u1EBFt H\u00F3a \u0110\u01A1n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnBangCTHD.setBounds(646, 306, 530, 317);
		pnChinh.add(pnBangCTHD);
		pnBangCTHD.setLayout(null);
		
		JScrollPane scrollPaneCTHD = new JScrollPane();
		scrollPaneCTHD.setBounds(10, 14, 510, 295);
		pnBangCTHD.add(scrollPaneCTHD);
		
		tableCTHD = new JTable();
		tableCTHD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = tableCTHD.getSelectedRow();
				txtTenThuoc.setText(modelCTHD.getValueAt(row, 0).toString());
				cboDonViTinh.setSelectedItem(modelCTHD.getValueAt(row, 1).toString());
				txtSoLuong.setText(modelCTHD.getValueAt(row, 2).toString());
				txtTongTien.setText(modelCTHD.getValueAt(row, 4).toString());
			}
		});
		tableCTHD.setModel(modelCTHD = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"T\u00EAn thu\u1ED1c", "\u0110\u01A1n v\u1ECB t\u00EDnh", "S\u1ED1 l\u01B0\u1EE3ng", "T\u1ED5ng ti\u1EC1n"
			}
		));
		tableCTHD.getColumnModel().getColumn(0).setPreferredWidth(106);
		tableCTHD.getColumnModel().getColumn(1).setPreferredWidth(60);
		tableCTHD.getColumnModel().getColumn(2).setPreferredWidth(60);
		scrollPaneCTHD.setViewportView(tableCTHD);
		setLocationRelativeTo(null);
	}
}
