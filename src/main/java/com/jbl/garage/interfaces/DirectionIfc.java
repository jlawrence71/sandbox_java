/*
 * Created on Feb 26, 2006
 *
 */
package com.jbl.garage.interfaces;

/**
 * @author James Lawrence
 *
 */
public interface DirectionIfc {

	// Directional Control
	public void goForward(int speed);
	public void goBackward(int speed);
	public void goLeft();
	public void goRight();
	public void goStraight();
	public int  getSpeed();
	public void setSpeed(int i);

}
