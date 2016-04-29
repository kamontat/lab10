package GUI;

import coinmachine.Coin;
import coinmachine.CoinMachine;

import javax.swing.*;

public class HistoryWindow extends JDialog {
	private JPanel contentPane;
	private JList list1;
	private JLabel amount;

	public HistoryWindow() {
		setContentPane(contentPane);
	}

	public void updateAmount(String text) {
		amount.setText(text);
	}

	public void addToList(CoinMachine coinMachine) {
		list1.setListData(coinMachine.coinToString());
	}

	public void run() {
		setLocation(375, 0);
		pack();
		setVisible(true);
	}
}