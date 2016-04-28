package GUI;

import coinmachine.Coin;
import coinmachine.CoinMachine;

import javax.swing.*;
import java.awt.event.*;

public class InfoWindow extends JDialog {
	private JPanel contentPane;
	private JProgressBar progressBar1;
	private JButton oneBahtButton;
	private JButton tenBahtButton;
	private JButton fiveBahtButton;
	private JLabel balance;

	private CoinMachine machine;

	public InfoWindow() {
		setContentPane(contentPane);

		oneBahtButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				machine.insert(new Coin(1));
			}
		});
		fiveBahtButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				machine.insert(new Coin(5));
			}
		});
		tenBahtButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				machine.insert(new Coin(10));
			}
		});
	}

	public void setMachine(CoinMachine machine) {
		this.machine = machine;
	}

	public void setBalance(String balance) {
		this.balance.setText(balance);
		pack();
	}

	public void setProgressBar(int progress) {
		this.progressBar1.setValue(progress);
		this.progressBar1.setString(String.valueOf(progress));
		pack();
	}

	public void run() {
		pack();
		setLocation(0, 175);
		setVisible(true);
	}
}
