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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GD__CapNhatThuoc extends JFrame {

	private JPanel contentPane;
	private JTable tablecapnhat;
	private JTextField txtMaThuoc;
	private JTextField txtTenThuoc;
	private JTextField txtNhaCungCap;
	private JTextField txtGiaThuoc;
	private JTextField txtCongDung;
	private JTextField txtSoluong;
	private JTextField txtNgaySX;
	private JTextField txtNgayHetHan;
	private DefaultTableModel modelCapNhat;
	private JComboBox<String> cboDonVi; 

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
		setLocationRelativeTo(null);
		
		JPanel pnChinh = new JPanel();
		pnChinh.setBackground(new Color(127, 255, 212));
		pnChinh.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(255, 99, 71)));
		pnChinh.setBounds(0, 0, 1077, 633);
		contentPane.add(pnChinh);
		pnChinh.setLayout(null);
		
		JPanel pNorth = new JPanel();
		pNorth.setBounds(22, 21, 1034, 259);
		pNorth.setBackground(new Color(245, 245, 220));
		pNorth.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 99, 71)));
		pnChinh.add(pNorth);
		pNorth.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
		});
		scrollPane.setBounds(10, 10, 1014, 239);
		pNorth.add(scrollPane);
		
		
		tablecapnhat = new JTable();
		tablecapnhat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = tablecapnhat.getSelectedRow();
				txtMaThuoc.setText(modelCapNhat.getValueAt(row, 0).toString());
				txtTenThuoc.setText(modelCapNhat.getValueAt(row, 1).toString());
				txtNhaCungCap.setText(modelCapNhat.getValueAt(row, 2).toString());
				txtGiaThuoc.setText(modelCapNhat.getValueAt(row, 3).toString());
				txtCongDung.setText(modelCapNhat.getValueAt(row, 4).toString());
				txtSoluong.setText(modelCapNhat.getValueAt(row, 5).toString());
				cboDonVi.setSelectedItem(modelCapNhat.getValueAt(row, 6).toString());
				txtNgaySX.setText(modelCapNhat.getValueAt(row, 7).toString());
				txtNgayHetHan.setText(modelCapNhat.getValueAt(row, 8).toString());
			}
		});
		tablecapnhat.setFont(new Font("Tahoma", Font.BOLD, 18));
		tablecapnhat.setModel(modelCapNhat = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 Thu\u1ED1c", "T\u00EAn Thu\u1ED1c", "Nh\u00E0 cung c\u1EA5p", "Gi\u00E1 thu\u1ED1c", "C\u00F4ng d\u1EE5ng", "S\u1ED1 l\u01B0\u1EE3ng", "\u0110\u01A1n v\u1ECB", "Ng\u00E0y s\u1EA3n xu\u1EA5t", "Ng\u00E0y h\u1EBFt h\u1EA1n"
			}
		));
		scrollPane.setViewportView(tablecapnhat);
		
		JPanel pCenter = new JPanel();
		pCenter.setBackground(new Color(255, 255, 224));
		pCenter.setBounds(22, 290, 1034, 210);
		pCenter.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 99, 71)));
		pnChinh.add(pCenter);
		pCenter.setLayout(null);
		
		JLabel lblTim = new JLabel("Tìm theo mã :");
		lblTim.setBounds(22, 26, 122, 22);
		lblTim.setFont(new Font("Tahoma", Font.BOLD, 16));
		pCenter.add(lblTim);
		
		JComboBox cbTim = new JComboBox();
		cbTim.setBounds(154, 28, 127, 22);
		pCenter.add(cbTim);
		
		JLabel lblMaThuoc = new JLabel("Mã Thuốc :");
		lblMaThuoc.setBounds(23, 65, 111, 13);
		lblMaThuoc.setFont(new Font("Tahoma", Font.BOLD, 16));
		pCenter.add(lblMaThuoc);
		
		txtMaThuoc = new JTextField();
		txtMaThuoc.setBounds(154, 61, 220, 22);
		pCenter.add(txtMaThuoc);
		txtMaThuoc.setColumns(10);
		
		JLabel lblTenThuoc = new JLabel("Tên Thuốc : ");
		lblTenThuoc.setBounds(22, 98, 112, 13);
		lblTenThuoc.setFont(new Font("Tahoma", Font.BOLD, 16));
		pCenter.add(lblTenThuoc);
		
		txtTenThuoc = new JTextField();
		txtTenThuoc.setBounds(154, 93, 516, 23);
		pCenter.add(txtTenThuoc);
		txtTenThuoc.setColumns(10);
		
		JLabel lblNhaCungCap = new JLabel("Nhà cung cấp :");
		lblNhaCungCap.setBounds(22, 124, 121, 22);
		lblNhaCungCap.setFont(new Font("Tahoma", Font.BOLD, 16));
		pCenter.add(lblNhaCungCap);
		
		txtNhaCungCap = new JTextField();
		txtNhaCungCap.setBounds(154, 125, 516, 22);
		pCenter.add(txtNhaCungCap);
		txtNhaCungCap.setColumns(10);
		
		JLabel lblGiaThuoc = new JLabel("Giá thuốc :");
		lblGiaThuoc.setBounds(706, 63, 121, 13);
		lblGiaThuoc.setFont(new Font("Tahoma", Font.BOLD, 16));
		pCenter.add(lblGiaThuoc);
		
		txtGiaThuoc = new JTextField();
		txtGiaThuoc.setBounds(854, 58, 153, 22);
		pCenter.add(txtGiaThuoc);
		txtGiaThuoc.setColumns(10);
		
		JLabel lblCongDung = new JLabel("Công dụng :");
		lblCongDung.setBounds(22, 157, 98, 17);
		lblCongDung.setFont(new Font("Tahoma", Font.BOLD, 16));
		pCenter.add(lblCongDung);
		
		txtCongDung = new JTextField();
		txtCongDung.setBounds(154, 156, 516, 22);
		pCenter.add(txtCongDung);
		txtCongDung.setColumns(10);
		
		JLabel lblSoLuong = new JLabel("Số lượng :");
		lblSoLuong.setBounds(706, 91, 99, 22);
		lblSoLuong.setFont(new Font("Tahoma", Font.BOLD, 16));
		pCenter.add(lblSoLuong);
		
		txtSoluong = new JTextField();
		txtSoluong.setBounds(854, 91, 153, 22);
		pCenter.add(txtSoluong);
		txtSoluong.setColumns(10);
		
		JLabel lblDonVi = new JLabel("Đơn vị :");
		lblDonVi.setBounds(411, 59, 74, 25);
		lblDonVi.setFont(new Font("Tahoma", Font.BOLD, 16));
		pCenter.add(lblDonVi);
		
		JComboBox cboDonVi = new JComboBox();
		cboDonVi.setBounds(517, 62, 153, 22);
		pCenter.add(cboDonVi);
		
		JLabel lblNgaySX = new JLabel("Ngày Sản Xuất :");
		lblNgaySX.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNgaySX.setBounds(706, 122, 135, 25);
		pCenter.add(lblNgaySX);
		
		txtNgaySX = new JTextField();
		txtNgaySX.setBounds(854, 123, 153, 23);
		pCenter.add(txtNgaySX);
		txtNgaySX.setColumns(10);
		
		JLabel lblNgayHetHan = new JLabel("Ngày hết hạn :");
		lblNgayHetHan.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNgayHetHan.setBounds(706, 158, 135, 17);
		pCenter.add(lblNgayHetHan);
		
		txtNgayHetHan = new JTextField();
		txtNgayHetHan.setBounds(854, 156, 153, 23);
		pCenter.add(txtNgayHetHan);
		txtNgayHetHan.setColumns(10);
		
		JPanel pSouth = new JPanel();
		pSouth.setBackground(new Color(250, 250, 210));
		pSouth.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 99, 71)));
		pSouth.setBounds(22, 510, 1034, 102);
		pnChinh.add(pSouth);
		pSouth.setLayout(null);
		
		JButton btnSua = new JButton("Sửa");
		Image img_Sua = new ImageIcon(this.getClass().getResource("/img/sua.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		btnSua.setIcon(new ImageIcon(img_Sua));
		btnSua.setForeground(new Color(199, 21, 133));
		btnSua.setBackground(new Color(255, 240, 245));
		btnSua.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSua.setBounds(78, 32, 152, 34);
		pSouth.add(btnSua);
		
		JButton btnXoa = new JButton("Xóa");
		Image img_Xoa = new ImageIcon(this.getClass().getResource("/img/xoa.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		btnXoa.setIcon(new ImageIcon(img_Xoa));
		btnXoa.setForeground(new Color(199, 21, 133));
		btnXoa.setBackground(new Color(255, 240, 245));
		btnXoa.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnXoa.setBounds(257, 32, 152, 34);
		pSouth.add(btnXoa);
		
		JButton btnXoaRong = new JButton("Xóa Rỗng");
		btnXoaRong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object o = e.getSource();
				if(o.equals(btnXoaRong)) {
					txtMaThuoc.setText("");
					txtTenThuoc.setText("");
					txtNhaCungCap.setText("");
					txtGiaThuoc.setText("");
					txtCongDung.setText("");
					txtSoluong.setText("");
					txtNgaySX.setText("");
					txtNgayHetHan.setText("");
					txtMaThuoc.requestFocus();
				}
			}
		});
		Image img_XoaRong = new ImageIcon(this.getClass().getResource("/img/xoarong.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		btnXoaRong.setIcon(new ImageIcon(img_XoaRong));
		btnXoaRong.setForeground(new Color(199, 21, 133));
		btnXoaRong.setBackground(new Color(255, 240, 245));
		btnXoaRong.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnXoaRong.setBounds(439, 32, 152, 34);
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
		btnLuu.setBounds(621, 32, 152, 34);
		pSouth.add(btnLuu);
		
		JButton btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GD_Chinh chinh = new GD_Chinh();
				chinh.setVisible(true);
				dispose();
			}
		});
		Image img_QuayLai = new ImageIcon(this.getClass().getResource("/img/quaylai.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		btnQuayLai.setIcon(new ImageIcon(img_QuayLai));
		btnQuayLai.setForeground(new Color(199, 21, 133));
		btnQuayLai.setBackground(new Color(255, 240, 245));
		btnQuayLai.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnQuayLai.setBounds(804, 32, 152, 34);
		pSouth.add(btnQuayLai);
	}
}
