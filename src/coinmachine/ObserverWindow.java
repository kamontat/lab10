package coinmachine;

import Constant.Status;
import GUI.AllInfo;
import GUI.ShowCoin;

import java.util.*;

/**
 * Created by kamontat on 28/4/59.
 */
public class ObserverWindow implements Observer {
	private ShowCoin dialog1 = new ShowCoin();
	private AllInfo dialog2 = new AllInfo();

	public ObserverWindow() {
		dialog1.updateStatus(Status.REJECT);

		dialog1.run();
		dialog2.run();
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof CoinMachine) {
			CoinMachine machine = (CoinMachine) o;
			dialog1.setTextField(String.valueOf(machine.getCoins().size()));
			dialog1.updateStatus(Status.ACCEPT);
		}
	}
}
