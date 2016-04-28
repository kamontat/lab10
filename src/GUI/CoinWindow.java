package GUI;

import Constant.Status;

import javax.swing.*;
import java.awt.*;

public class CoinWindow extends JDialog {
	private JPanel contentPane;
	private JTextField textField1;
	private JLabel status;

	public CoinWindow() {
		setContentPane(contentPane);
		// set up
		textField1.setEnabled(false);
		updateStatus(Status.REJECT);
	}

	public void setTextField(String text) {
		textField1.setText(text);
	}

	/**
	 * update status label with *status* enum
	 * and set color in every state
	 *
	 * @param status
	 * 		state enum
	 */
	public void updateStatus(Status status) {
		if (status == Status.ACCEPT) {
			this.status.setText("Accepting Coins");
			this.status.setForeground(new Color(0, 255, 0, 255));
		} else if (status == Status.REJECT) {
			this.status.setText("Reject Coin");
			this.status.setForeground(new Color(255, 170, 0, 255));
		} else if (status == Status.FULL) {
			this.status.setText("Machine FULL");
			this.status.setForeground(new Color(255, 0, 0, 255));
		}
	}

	/**
	 * run this GUI
	 */
	public void run() {
		pack();
		setVisible(true);
	}
}
