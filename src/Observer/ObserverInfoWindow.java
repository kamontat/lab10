package Observer;

import GUI.InfoWindow;
import coinmachine.CoinMachine;

import java.util.*;

/**
 * Created by kamontat on 28/4/59.
 */
public class ObserverInfoWindow implements Observer {
	private InfoWindow dialog = new InfoWindow();

	public ObserverInfoWindow() {
		dialog.run();
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o != null) {
			CoinMachine machine = (CoinMachine) o;
			dialog.setBalance(String.valueOf(machine.getBalance()));
			dialog.setProgressBar(machine.getCount());
		}
	}
}
