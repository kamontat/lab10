package GUI;

import javax.swing.*;

public class ShowCoin extends JDialog {
	private JPanel contentPane;
	private JLabel message;
	private JTextField textField1;
	private JLabel status;
	private JButton buttonOK;

	public ShowCoin() {
		setContentPane(contentPane);

		textField1.setEnabled(false);
	}

	public void setTextField(String text) {
		textField1.setText(text);
	}

	public void run() {
		pack();
		setVisible(true);
	}
}
