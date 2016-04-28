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

	public InfoWindow(CoinMachine machine) {
		this.machine = machine;

		setContentPane(contentPane);

		progressBar1.setMaximum(machine.getCapacity());

		oneBahtButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				insert(1);
			}
		});
		fiveBahtButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				insert(5);
			}
		});
		tenBahtButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				insert(10);
			}
		});
	}

	/**
	 * insert coin to machine,
	 * If coin is full return Error pop-up
	 *
	 * @param num
	 * 		Which coin to insert
	 */
	public void insert(int num) {
		if (machine != null) {
			machine.insert(new Coin(num));
			if (machine.isFull()) {
				JOptionPane.showMessageDialog(null, "The machine is FULL", "Error input Coin", JOptionPane.ERROR_MESSAGE);
			}
		}
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

	/**
	 * run this GUI
	 */
	public void run() {
		pack();
		setLocation(0, 175);
		setVisible(true);
	}
}
