package Observer;

import Constant.Status;
import GUI.CoinWindow;
import coinmachine.CoinMachine;

import java.util.*;

/**
 * Created by kamontat on 28/4/59.
 */
public class ObserverCoinWindow implements Observer {
	private CoinWindow dialog = new CoinWindow();

	public ObserverCoinWindow() {
		dialog.updateStatus(Status.REJECT);
		dialog.run();
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o != null) {
			CoinMachine machine = (CoinMachine) o;
			dialog.setTextField(String.valueOf(machine.getCount()));
			if (!machine.isFull()) {
				dialog.updateStatus(Status.ACCEPT);
			} else {
				dialog.updateStatus(Status.FULL);
			}
		}
	}
}
