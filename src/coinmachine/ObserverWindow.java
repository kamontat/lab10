package coinmachine;

import GUI.ShowCoin;

import java.util.*;

/**
 * Created by kamontat on 28/4/59.
 */
public class ObserverWindow implements Observer {
	private ShowCoin dialog = new ShowCoin();

	public ObserverWindow() {
		dialog.run();
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof CoinMachine) {
			CoinMachine machine = (CoinMachine) o;
			dialog.setTextField(String.valueOf(machine.getCoins().size()));
		} else {
			System.err.println("o isn't coinMachine");
		}
	}
}
