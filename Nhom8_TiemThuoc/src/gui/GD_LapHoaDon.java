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

public class GD_LapHoaDon extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaHoaDon;
	private JTextField txtNCC;
	private JTextField txtNLHD;
	private JTextField txtSTT;
	private JTextField textField;
	private JTextField txtHoTenKH;
	private JTextField txtNamSinh;
	private JTextField txtDiaChi;
	private JTextField txtHoTenNV;

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
		
		JPanel pnChinh = new JPanel();
		pnChinh.setBackground(new Color(127, 255, 212));
		pnChinh.setBounds(0, 0, 1186, 633);
		contentPane.add(pnChinh);
		pnChinh.setLayout(null);
		
		JPanel pnHoaDon = new JPanel();
		pnHoaDon.setBorder(new TitledBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 99, 71)), "H\u00F3a \u0110\u01A1n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnHoaDon.setBounds(10, 10, 1166, 66);
		pnChinh.add(pnHoaDon);
		pnHoaDon.setLayout(null);
		
		JLabel lblMaHoaDon = new JLabel("M\u00E3 h\u00F3a \u0111\u01A1n:");
		lblMaHoaDon.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMaHoaDon.setBounds(27, 22, 80, 26);
		pnHoaDon.add(lblMaHoaDon);
		
		txtMaHoaDon = new JTextField();
		txtMaHoaDon.setBounds(151, 23, 183, 26);
		pnHoaDon.add(txtMaHoaDon);
		txtMaHoaDon.setColumns(10);
		
		JLabel lblNCC = new JLabel("Nh\u00E0 cung c\u1EA5p:");
		lblNCC.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNCC.setBounds(353, 22, 96, 26);
		pnHoaDon.add(lblNCC);
		
		txtNCC = new JTextField();
		txtNCC.setBounds(470, 24, 208, 26);
		pnHoaDon.add(txtNCC);
		txtNCC.setColumns(10);
		
		JLabel lblNLHD = new JLabel("Ng\u00E0y l\u1EADp h\u00F3a \u0111\u01A1n:");
		lblNLHD.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNLHD.setBounds(728, 22, 124, 26);
		pnHoaDon.add(lblNLHD);
		
		txtNLHD = new JTextField();
		txtNLHD.setBounds(874, 23, 263, 26);
		pnHoaDon.add(txtNLHD);
		txtNLHD.setColumns(10);
		
		JPanel pnCTHD = new JPanel();
		pnCTHD.setBorder(new TitledBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 99, 71)), "Chi Ti\u1EBFt H\u00F3a \u0110\u01A1n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnCTHD.setBounds(10, 81, 1166, 139);
		pnChinh.add(pnCTHD);
		pnCTHD.setLayout(null);
		
		txtSTT = new JTextField();
		txtSTT.setColumns(10);
		txtSTT.setBounds(151, 25, 183, 26);
		pnCTHD.add(txtSTT);
		
		JLabel lblTenThuoc = new JLabel("T\u00EAn thu\u1ED1c:");
		lblTenThuoc.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTenThuoc.setBounds(26, 24, 76, 26);
		pnCTHD.add(lblTenThuoc);
		
		JLabel lblSoLuong = new JLabel("S\u1ED1 l\u01B0\u1EE3ng:");
		lblSoLuong.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSoLuong.setBounds(344, 24, 62, 26);
		pnCTHD.add(lblSoLuong);
		
		textField = new JTextField();
		textField.setBounds(422, 26, 76, 26);
		pnCTHD.add(textField);
		textField.setColumns(10);
		
		JLabel lblDonViTinh = new JLabel("\u0110\u01A1n v\u1ECB t\u00EDnh:");
		lblDonViTinh.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDonViTinh.setBounds(508, 25, 81, 24);
		pnCTHD.add(lblDonViTinh);
		
		JComboBox cboDonViTinh = new JComboBox();
		cboDonViTinh.setBounds(594, 25, 121, 26);
		pnCTHD.add(cboDonViTinh);
		
		JLabel lblHoTenKH = new JLabel("H\u1ECD t\u00EAn kh\u00E1ch h\u00E0ng:");
		lblHoTenKH.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHoTenKH.setBounds(732, 24, 132, 26);
		pnCTHD.add(lblHoTenKH);
		
		txtHoTenKH = new JTextField();
		txtHoTenKH.setBounds(874, 26, 263, 24);
		pnCTHD.add(txtHoTenKH);
		txtHoTenKH.setColumns(10);
		
		JLabel lblNamSinh = new JLabel("N\u0103m sinh:");
		lblNamSinh.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNamSinh.setBounds(508, 86, 76, 13);
		pnCTHD.add(lblNamSinh);
		
		txtNamSinh = new JTextField();
		txtNamSinh.setBounds(594, 82, 121, 24);
		pnCTHD.add(txtNamSinh);
		txtNamSinh.setColumns(10);
		
		JLabel lblGioiTinh = new JLabel("Gi\u1EDBi t\u00EDnh:");
		lblGioiTinh.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGioiTinh.setBounds(344, 79, 68, 26);
		pnCTHD.add(lblGioiTinh);
		
		JComboBox cboGioiTinh = new JComboBox();
		cboGioiTinh.setBounds(422, 81, 76, 26);
		pnCTHD.add(cboGioiTinh);
		
		JLabel lblDiaChi = new JLabel("\u0110\u1ECBa ch\u1EC9:");
		lblDiaChi.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDiaChi.setBounds(732, 79, 49, 26);
		pnCTHD.add(lblDiaChi);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setBounds(791, 81, 346, 24);
		pnCTHD.add(txtDiaChi);
		txtDiaChi.setColumns(10);
		
		JLabel lblHoTenNV = new JLabel("H\u1ECD t\u00EAn nh\u00E2n vi\u00EAn:");
		lblHoTenNV.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHoTenNV.setBounds(26, 79, 115, 26);
		pnCTHD.add(lblHoTenNV);
		
		txtHoTenNV = new JTextField();
		txtHoTenNV.setBounds(151, 79, 183, 25);
		pnCTHD.add(txtHoTenNV);
		txtHoTenNV.setColumns(10);
		
		
		JPanel pnBangHD = new JPanel();
		pnBangHD.setBorder(new TitledBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 99, 71)), "H\u00F3a \u0110\u01A1n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnBangHD.setBounds(10, 306, 434, 317);
		pnChinh.add(pnBangHD);
		
		JPanel pnChucNang = new JPanel();
		pnChucNang.setBorder(new TitledBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 99, 71)), "Ch\u1EE9c N\u0103ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnChucNang.setBounds(10, 230, 1166, 66);
		pnChinh.add(pnChucNang);
		pnChucNang.setLayout(null);
		
		JButton btnThem = new JButton("Th\u00EAm");
		btnThem.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnThem.setBounds(115, 20, 120, 30);
		pnChucNang.add(btnThem);
		
		JButton btnLuu = new JButton("L\u01B0u");
		btnLuu.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLuu.setBounds(504, 20, 120, 30);
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
		btnQuayLai.setBounds(924, 20, 120, 30);
		pnChucNang.add(btnQuayLai);
		
		JPanel pnBangCTHD = new JPanel();
		pnBangCTHD.setBorder(new TitledBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 99, 71)), "Chi Ti\u1EBFt H\u00F3a \u0110\u01A1n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnBangCTHD.setBounds(454, 306, 722, 317);
		pnChinh.add(pnBangCTHD);
		setLocationRelativeTo(null);
	}
}
