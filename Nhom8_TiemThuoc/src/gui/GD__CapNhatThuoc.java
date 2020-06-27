package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GD__CapNhatThuoc extends JFrame {

	private JPanel contentPane;
	private JTable tablecapnhat;
	private JTextField txtMaThuoc;
	private JTextField txtTenThuoc;
	private JTextField txtNhaCungCap;
	private JTextField txtGiaThuoc;
	private JTextField txtCongDung;
	private JTextField txtSoluong;
	private JTextField txtDonVi;
	private JTextField txtNgaySX;
	private JTextField txtNgayHetHan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GD__CapNhatThuoc frame = new GD__CapNhatThuoc();
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
	public GD__CapNhatThuoc() {
		setTitle("CẬP NHẬT THÔNG TIN THUỐC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1091, 670);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnChinh = new JPanel();
		pnChinh.setBackground(new Color(127, 255, 212));
		pnChinh.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(255, 99, 71)));
		pnChinh.setBounds(0, 0, 1077, 633);
		contentPane.add(pnChinh);
		pnChinh.setLayout(null);
		
		JPanel pNorth = new JPanel();
		pNorth.setBounds(22, 21, 1034, 259);
		pNorth.setBackground(new Color(255, 192, 203));
		pNorth.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(255, 99, 71)));
		pnChinh.add(pNorth);
		pNorth.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 21, 992, 215);
		pNorth.add(scrollPane);
		
		tablecapnhat = new JTable();
		tablecapnhat.setFont(new Font("Tahoma", Font.BOLD, 18));
		tablecapnhat.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 Thu\u1ED1c", "T\u00EAn Thu\u1ED1c", "Nh\u00E0 cung c\u1EA5p", "Gi\u00E1 thu\u1ED1c", "C\u00F4ng d\u1EE5ng", "S\u1ED1 l\u01B0\u1EE3ng", "\u0110\u01A1n v\u1ECB", "Ng\u00E0y s\u1EA3n xu\u1EA5t", "Ng\u00E0y h\u1EBFt h\u1EA1n"
			}
		));
		scrollPane.setViewportView(tablecapnhat);
		
		JPanel pCenter = new JPanel();
		pCenter.setBackground(new Color(255, 192, 203));
		pCenter.setBounds(22, 290, 1034, 210);
		pCenter.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(255, 99, 71)));
		pnChinh.add(pCenter);
		pCenter.setLayout(null);
		
		JLabel lblTim = new JLabel("Tìm :");
		lblTim.setBounds(22, 24, 47, 22);
		lblTim.setFont(new Font("Tahoma", Font.BOLD, 16));
		pCenter.add(lblTim);
		
		JComboBox cbTim = new JComboBox();
		cbTim.setBounds(144, 26, 127, 22);
		pCenter.add(cbTim);
		
		JLabel lblMaThuoc = new JLabel("Mã Thuốc :");
		lblMaThuoc.setBounds(23, 72, 111, 13);
		lblMaThuoc.setFont(new Font("Tahoma", Font.BOLD, 16));
		pCenter.add(lblMaThuoc);
		
		txtMaThuoc = new JTextField();
		txtMaThuoc.setBounds(144, 70, 220, 22);
		pCenter.add(txtMaThuoc);
		txtMaThuoc.setColumns(10);
		
		JLabel lblTenThuoc = new JLabel("Tên Thuốc : ");
		lblTenThuoc.setBounds(22, 107, 99, 13);
		lblTenThuoc.setFont(new Font("Tahoma", Font.BOLD, 16));
		pCenter.add(lblTenThuoc);
		
		txtTenThuoc = new JTextField();
		txtTenThuoc.setBounds(144, 102, 220, 23);
		pCenter.add(txtTenThuoc);
		txtTenThuoc.setColumns(10);
		
		JLabel lblNhaCungCap = new JLabel("Nhà cung cấp :");
		lblNhaCungCap.setBounds(22, 137, 121, 22);
		lblNhaCungCap.setFont(new Font("Tahoma", Font.BOLD, 16));
		pCenter.add(lblNhaCungCap);
		
		txtNhaCungCap = new JTextField();
		txtNhaCungCap.setBounds(144, 138, 220, 22);
		pCenter.add(txtNhaCungCap);
		txtNhaCungCap.setColumns(10);
		
		JLabel lblGiaThuoc = new JLabel("Giá thuốc :");
		lblGiaThuoc.setBounds(22, 174, 121, 13);
		lblGiaThuoc.setFont(new Font("Tahoma", Font.BOLD, 16));
		pCenter.add(lblGiaThuoc);
		
		txtGiaThuoc = new JTextField();
		txtGiaThuoc.setBounds(144, 169, 220, 22);
		pCenter.add(txtGiaThuoc);
		txtGiaThuoc.setColumns(10);
		
		JLabel lblCongDung = new JLabel("Công dụng :");
		lblCongDung.setBounds(399, 70, 98, 17);
		lblCongDung.setFont(new Font("Tahoma", Font.BOLD, 16));
		pCenter.add(lblCongDung);
		
		txtCongDung = new JTextField();
		txtCongDung.setBounds(547, 66, 465, 19);
		pCenter.add(txtCongDung);
		txtCongDung.setColumns(10);
		
		JLabel lblSoLuong = new JLabel("Số lượng :");
		lblSoLuong.setBounds(399, 98, 99, 22);
		lblSoLuong.setFont(new Font("Tahoma", Font.BOLD, 16));
		pCenter.add(lblSoLuong);
		
		txtSoluong = new JTextField();
		txtSoluong.setBounds(547, 95, 153, 22);
		pCenter.add(txtSoluong);
		txtSoluong.setColumns(10);
		
		JLabel lblDonVi = new JLabel("Đơn vị :");
		lblDonVi.setBounds(710, 95, 74, 25);
		lblDonVi.setFont(new Font("Tahoma", Font.BOLD, 16));
		pCenter.add(lblDonVi);
		
		txtDonVi = new JTextField();
		txtDonVi.setBounds(783, 95, 229, 22);
		pCenter.add(txtDonVi);
		txtDonVi.setColumns(10);
		
		JLabel lblNgaySX = new JLabel("Ngày Sản Xuất :");
		lblNgaySX.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNgaySX.setBounds(399, 134, 135, 25);
		pCenter.add(lblNgaySX);
		
		txtNgaySX = new JTextField();
		txtNgaySX.setBounds(547, 137, 229, 23);
		pCenter.add(txtNgaySX);
		txtNgaySX.setColumns(10);
		
		JLabel lblNgayHetHan = new JLabel("Ngày hết hạn :");
		lblNgayHetHan.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNgayHetHan.setBounds(399, 174, 135, 17);
		pCenter.add(lblNgayHetHan);
		
		txtNgayHetHan = new JTextField();
		txtNgayHetHan.setBounds(547, 169, 229, 23);
		pCenter.add(txtNgayHetHan);
		txtNgayHetHan.setColumns(10);
		
		JPanel pSouth = new JPanel();
		pSouth.setBackground(new Color(255, 192, 203));
		pSouth.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(255, 99, 71)));
		pSouth.setBounds(22, 510, 1034, 102);
		pnChinh.add(pSouth);
		pSouth.setLayout(null);
		
		JButton btnSua = new JButton("Sửa");
		Image img_Sua = new ImageIcon(this.getClass().getResource("/img/sua.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		btnSua.setIcon(new ImageIcon(img_Sua));
		btnSua.setForeground(new Color(199, 21, 133));
		btnSua.setBackground(new Color(255, 240, 245));
		btnSua.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSua.setBounds(43, 32, 112, 34);
		pSouth.add(btnSua);
		
		JButton btnXoa = new JButton("Xóa");
		Image img_Xoa = new ImageIcon(this.getClass().getResource("/img/xoa.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		btnXoa.setIcon(new ImageIcon(img_Xoa));
		btnXoa.setForeground(new Color(199, 21, 133));
		btnXoa.setBackground(new Color(255, 240, 245));
		btnXoa.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnXoa.setBounds(175, 32, 112, 34);
		pSouth.add(btnXoa);
		
		JButton btnXoaRong = new JButton("Xóa Rỗng");
		Image img_XoaRong = new ImageIcon(this.getClass().getResource("/img/xoarong.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		btnXoaRong.setIcon(new ImageIcon(img_XoaRong));
		btnXoaRong.setForeground(new Color(199, 21, 133));
		btnXoaRong.setBackground(new Color(255, 240, 245));
		btnXoaRong.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnXoaRong.setBounds(310, 32, 152, 34);
		pSouth.add(btnXoaRong);
		
		JButton btnLuu = new JButton("Lưu");
		Image img_Luu = new ImageIcon(this.getClass().getResource("/img/luu.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		btnLuu.setIcon(new ImageIcon(img_Luu));
		btnLuu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
			}
		});
		btnLuu.setForeground(new Color(199, 21, 133));
		btnLuu.setBackground(new Color(255, 240, 245));
		btnLuu.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLuu.setBounds(485, 32, 105, 34);
		pSouth.add(btnLuu);
		
		JButton btnQuayLai = new JButton("Quay Lại");
		Image img_QuayLai = new ImageIcon(this.getClass().getResource("/img/quaylai.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		btnQuayLai.setIcon(new ImageIcon(img_QuayLai));
		btnQuayLai.setForeground(new Color(199, 21, 133));
		btnQuayLai.setBackground(new Color(255, 240, 245));
		btnQuayLai.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnQuayLai.setBounds(861, 32, 144, 34);
		pSouth.add(btnQuayLai);
	}
}
