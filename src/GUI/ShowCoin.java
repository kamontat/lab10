package GUI;

import Constant.Status;

import javax.swing.*;
import java.awt.*;

public class ShowCoin extends JDialog {
	private JPanel contentPane;
	private JLabel message;
	private JTextField textField1;
	private JLabel status;

	public ShowCoin() {
		setContentPane(contentPane);

		textField1.setEnabled(false);
	}

	public void setTextField(String text) {
		textField1.setText(text);
	}

	public void updateStatus(Status status) {
		if (status == Status.ACCEPT) {
			this.status.setText("Accepting Coins");
			this.status.setForeground(new Color(0, 255, 0, 255));
		} else if (status == Status.REJECT) {
			this.status.setText("Reject Coin");
			this.status.setForeground(new Color(255, 0, 0, 255));
		}
	}

	public void run() {
		pack();
		setVisible(true);
	}
}
