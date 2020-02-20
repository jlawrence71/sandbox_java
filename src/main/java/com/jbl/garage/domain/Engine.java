/*
 * Created on Feb 26, 2006
 *
 */
package com.jbl.garage.domain;

import com.jbl.garage.interfaces.EngineIfc;

/**
 * @author James Lawrence
 *
 */
public class Engine implements EngineIfc {

	private int throttle = 0;
	private int rpm = 0;
	private int temp = 0;
	
	public int getThrottle() {
		return throttle;
	}

	public void setThrottle(int setting) {
		throttle = setting;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public int getRPM() {
		return rpm;
	}

	public void setRPM(int rpm) {
		this.rpm = rpm;
	}

}
