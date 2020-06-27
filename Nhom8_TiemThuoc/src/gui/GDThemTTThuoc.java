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

public class GDThemTTThuoc {
	private static JTable table;

	public static void main(String[] args) {
		showWindow();

	}

	public static void showWindow() {
		JFrame frame = new JFrame("GiaoDienThem");
		frame.setBounds(200, 200, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel pnChinh = new JPanel();
		pnChinh.setBackground(new Color(127, 255, 212));
		pnChinh.setBounds(10, 0, 976, 603);
		frame.getContentPane().add(pnChinh);
		pnChinh.setLayout(null);
		
		JPanel pnNorth = new JPanel();
		pnNorth.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(250, 128, 114)));
		pnNorth.setBounds(0, 0, 986, 613);
		pnChinh.add(pnNorth);
		pnNorth.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(305, 247, 541, 235);
		pnNorth.add(panel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 Thu\u1ED1c", "T\u00EAn thu\u1ED1c", "Nh\u00E0 cung c\u1EA5p", "Gi\u00E1 thu\u1ED1c", "C\u00F4ng d\u1EE5ng", "S\u1ED1 l\u01B0\u1EE3ng", "\u0110\u01A1n v\u1ECB t\u00EDnh", "Ng\u00E0y s\u1EA3n xu\u1EA5t", "Ng\u00E0y h\u1EBFt h\u1EA1n"
			}
		));
		table.setBounds(0, 612, 976, -356);
		pnChinh.add(table);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(SystemColor.text);
		scrollPane.setBounds(0, 603, 986, -346);
		pnChinh.add(scrollPane);
		6);
		pnChinh.add(table);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
	}
}
