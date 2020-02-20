/*
 * Created on Feb 26, 2006
 *
 */
package com.jbl.garage.interfaces;

/**
 * @author James Lawrence
 *
 */
public interface ACIfc {

	// A/C Settings
	public void setBlowerSpeed(int speed);
	public int getBlowerSpeed();
	public void setDesiredTemp(int temp);
	public int getDesiredTemp();
	public void setCurrentTemp(int temp);
}
