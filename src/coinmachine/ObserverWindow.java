package coinmachine;

import java.util.*;

/**
 * Created by kamontat on 28/4/59.
 */
public class ObserverWindow implements Observer {
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("hi");
	}
}
