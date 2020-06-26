package gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class GDTest extends JPanel {

	/**
	 * Create the panel.
	 */
	public GDTest() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("test");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 38));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "asda");
			}
		});
		btnNewButton.setBounds(102, 76, 226, 151);
		add(btnNewButton);

	}

}
