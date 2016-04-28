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
	private CoinWindow dialog1 = new CoinWindow();
	private InfoWindow dialog2 = new InfoWindow();

	public ObserverWindow() {
		dialog1.updateStatus(Status.REJECT);
		dialog1.run();

		dialog2.run();
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o != null) {
			CoinMachine machine = (CoinMachine) o;
			dialog1.setTextField(String.valueOf(machine.getCount()));
			if (!machine.isFull()) {
				dialog1.updateStatus(Status.ACCEPT);

				dialog2.setBalance(String.valueOf(machine.getBalance()));
				dialog2.setProgressBar(machine.getCount());
			} else {
				dialog1.updateStatus(Status.FULL);
			}
		}
	}
}
