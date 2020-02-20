/*
 * Created on Feb 26, 2006
 *
 */
package com.jbl.garage.interfaces;

/**
 * @author James Lawrence
 *
 */
public interface GarageIfc {

	public static int OPEN  = 1;
	public static int CLOSE = 2;
	
	public void setGarageState(int state);
	public int getGarageState();
	
	public void setNumberCars(int num);
	public int getNumberCars();
	
}
