package GUI;

import javax.swing.*;

public class ShowCoin extends JDialog {
	private JPanel contentPane;
	private JLabel message;
	private JTextField textField1;
	private JButton buttonOK;

	public ShowCoin() {
		setContentPane(contentPane);
		setModal(true);


	}

	public void run() {
		pack();
		setVisible(true);
		System.exit(0);
	}

	public static void main(String[] args) {
		ShowCoin dialog = new ShowCoin();
		dialog.run();
	}
}
