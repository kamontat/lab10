package Observer;

import Constant.Status;
import GUI.CoinWindow;
import GUI.InfoWindow;
import coinmachine.CoinMachine;

import java.util.*;

/**
 * run 2 window of coin display and infomation of coin machine
 * Created by kamontat on 28/4/59.
 */
public class ObserverWindow implements Observer {
	private CoinWindow coinDialog;
	private InfoWindow infoDialog;

	// constructor
	public ObserverWindow(CoinMachine machine) {
		coinDialog = new CoinWindow();
		infoDialog = new InfoWindow(machine);

		coinDialog.run();
		infoDialog.run();
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o != null) {
			// observable
			CoinMachine machine = (CoinMachine) o;

			// count coin in the machine and set into JtextField
			coinDialog.setTextField(String.valueOf(machine.getCount()));
			// set balance of machine into JLabel
			infoDialog.setBalance(String.valueOf(machine.getBalance()));
			// set progress of machine
			infoDialog.setProgressBar(machine.getCount());

			if (!machine.isFull()) {
				coinDialog.updateStatus(Status.ACCEPT);
			} else {
				coinDialog.updateStatus(Status.FULL);
			}
		}
	}
}
