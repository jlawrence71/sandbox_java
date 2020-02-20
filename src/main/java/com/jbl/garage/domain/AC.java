/*
 * Created on Feb 26, 2006
 *
 */
package com.jbl.garage.domain;

import com.jbl.garage.interfaces.ACIfc;

/**
 * @author James Lawrence
 *
 */
public class AC implements ACIfc {

	private int blowerSpeed = 0;
	private int desiredTemp = 0;
	private int currentTemp = 0;
	
	public void setBlowerSpeed(int speed) {
		blowerSpeed = speed;
	}

	public int getBlowerSpeed() {
		return blowerSpeed;
	}

	public void setDesiredTemp(int temp) {
		desiredTemp = temp;
	}

	public int getDesiredTemp() {
		return desiredTemp;
	}

	public void setCurrentTemp(int temp) {
		currentTemp = temp;
	}

}
