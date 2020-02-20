/*
 * Created on Feb 26, 2006
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.jbl.garage.interfaces;

/**
 * @author James Lawrence
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public interface TransmissionIfc {

	public static final int FIRST_GEAR  = 1;
	public static final int SECOND_GEAR = 2;
	public static final int THIRD_GEAR  = 3;
	public static final int FOURTH_GEAR = 4;
	public static final int FIFTH_GEAR  = 5;

	// Transmission
	public int getGear();
	public void setGear(int i);

}
