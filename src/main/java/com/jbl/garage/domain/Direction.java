/*
 * Created on Feb 26, 2006
 *
 */
package com.jbl.garage.domain;

import com.jbl.garage.interfaces.DirectionIfc;

/**
 * @author James Lawrence
 *
 */
public class Direction implements DirectionIfc {

	private int speed = 0;
	private String direction = "";
	
	public void goForward(int speed) {
		direction = "forward";
		this.speed = speed;
	}

	public void goBackward(int speed) {
		direction = "backward";
		this.speed = speed;
	}

	public void goLeft() {
		direction = "left";
	}

	public void goRight() {
		direction = "right";
	}

	public void goStraight() {
		direction = "straight";
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
