package gcloud.kdt.overriding;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class North implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("North");
	}

}
