/*
 * Created on Feb 26, 2006
 *
 */
package com.jbl.garage.domain;

import com.jbl.garage.interfaces.TransmissionIfc;

/**
 * @author James Lawrence
 *
 */
public class Transmission implements TransmissionIfc {

	private int gear = 0;

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

}
