package GUI;

import javax.swing.*;
import java.awt.event.*;

public class InfoWindow extends JDialog {
	private JPanel contentPane;
	private JLabel message1;
	private JLabel message2;
	private JProgressBar progressBar1;
	private JLabel message3;
	private JButton button1;
	private JButton button2;
	private JButton button3;

	public InfoWindow() {
		setContentPane(contentPane);
	}

	public void run() {
		pack();
		setLocation(0, 175);
		setVisible(true);
	}
}
