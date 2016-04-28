package GUI;

import javax.swing.*;
import java.awt.event.*;

public class InfoWindow extends JDialog {
	private JPanel contentPane;
	private JProgressBar progressBar1;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JLabel balance;

	public InfoWindow() {
		setContentPane(contentPane);
	}

	public void setBalance(String balance) {
		this.balance.setText(balance);
	}

	public void setProgressBar(int progress) {
		this.progressBar1.setValue(progress);
		this.progressBar1.setString(String.valueOf(progress));
	}

	public void run() {
		pack();
		setLocation(0, 175);
		setVisible(true);
	}
}
