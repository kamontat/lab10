package GUI;

import coinmachine.Coin;
import coinmachine.CoinMachine;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class HistoryWindow extends JDialog {
	private JPanel contentPane;
	private JList list1;
	private JLabel amount;

	public HistoryWindow() {
		setContentPane(contentPane);
	}

	/**
	 * update amount in amount label
	 *
	 * @param text
	 * 		amount
	 */
	public void updateAmount(String text) {
		amount.setText(text);
	}

	/**
	 * make coin in machine into JList
	 *
	 * @param coinMachine
	 * 		machine
	 */
	public void addToList(CoinMachine coinMachine) {
		list1.setListData(coinMachine.coinToString());
	}

	/**
	 * run this GUI
	 */
	public void run() {
		setLocation(410, 0);
		pack();
		setVisible(true);
	}
}