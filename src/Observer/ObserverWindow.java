package Observer;

import Constant.Status;
import GUI.CoinWindow;
import GUI.InfoWindow;
import coinmachine.CoinMachine;

import java.util.*;

/**
 * Created by kamontat on 28/4/59.
 */
public class ObserverWindow implements Observer {
	private CoinWindow coinDialog = new CoinWindow();
	private InfoWindow infoDialog = new InfoWindow();

	public ObserverWindow() {
		coinDialog.run();
		infoDialog.run();
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o != null) {
			CoinMachine machine = (CoinMachine) o;
			infoDialog.setMachine(machine);

			coinDialog.setTextField(String.valueOf(machine.getCount()));
			infoDialog.setBalance(String.valueOf(machine.getBalance()));
			infoDialog.setProgressBar(machine.getCount());

			if (!machine.isFull()) {
				coinDialog.updateStatus(Status.ACCEPT);
			} else {
				coinDialog.updateStatus(Status.FULL);
			}
		}
	}
}
