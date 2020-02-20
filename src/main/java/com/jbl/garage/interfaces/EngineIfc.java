/*
 * Created on Feb 26, 2006
 *
 */
package com.jbl.garage.interfaces;

/**
 * @author James Lawrence
 *
 */
public interface EngineIfc {

	public int getThrottle();
	public void setThrottle(int setting);
	public int getTemp();
	public void setTemp(int temp);
	public int getRPM();
	public void setRPM(int rpm);
}
