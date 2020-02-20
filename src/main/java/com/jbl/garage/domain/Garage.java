/*
 * Created on Feb 26, 2006
 *
 */
package com.jbl.garage.domain;

import com.jbl.garage.interfaces.GarageIfc;

/**
 * @author James Lawrence
 *
 */
public class Garage  implements GarageIfc{

	private int NumberCars;
	private int garageState;

	/**
	 * @return
	 */
	public int getGarageState() {
		return garageState;
	}

	/**
	 * @return
	 */
	public int getNumberCars() {
		return NumberCars;
	}

	/**
	 * @param i
	 */
	public void setGarageState(int i) {
		garageState = i;
	}

	/**
	 * @param i
	 */
	public void setNumberCars(int i) {
		NumberCars = i;
	}

}
