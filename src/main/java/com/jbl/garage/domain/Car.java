/*
 * Created on Feb 26, 2006
 *
 */
package com.jbl.garage.domain;

import com.jbl.garage.interfaces.*;

/**
 * @author James Lawrence
 *
 */
public class Car implements CarIfc{

	private ACIfc ac = null;
	private TransmissionIfc transmission = null;
	private DirectionIfc direction = null;
	private EngineIfc engine = null;
	private IdIfc id = null;
	
	public Car(){
		// Attributes injected by Spring
	}
	
	// Direction stuff
	
	public void goForward(int speed) {
		direction.goForward(speed);
	}

	public void goBackward(int speed) {
		direction.goBackward(speed);
	}

	public void goLeft() {
		direction.goLeft();
	}

	public void goRight() {
		direction.goRight();
	}

	public void goStraight() {
		direction.goStraight();
	}

	public int getSpeed() {
		return direction.getSpeed();
	}

	public void setSpeed(int speed) {
		direction.setSpeed(speed);
	}

	// Transmission Stuff

	public int getGear() {
		return transmission.getGear();
	}

	public void setGear(int setting) {
		transmission.setGear(setting);
	}

	// ID Stuff
	
	public String getName() {
		return id.getName();
	}

	public String getMaker() {
		return id.getMaker();
	}

	public void setMaker(String maker) {
		id.setMaker(maker);
	}

	public void setName(String name) {
		id.setName(name);
	}

	// Engine Stuff

	public int getThrottle() {
		return engine.getThrottle();
	}

	public void setThrottle(int setting) {
		engine.setThrottle(setting);
	}

	public int getTemp() {
		return engine.getTemp();
	}

	public void setTemp(int temp) {
		engine.setTemp(temp);
	}

	public int getRPM() {
		return engine.getRPM();
	}

	public void setRPM(int rpm) {
		engine.setRPM(rpm);
	}

	// A/C Stuff

	public void setBlowerSpeed(int speed) {
		ac.setBlowerSpeed(speed);
	}

	public int getBlowerSpeed() {
		return ac.getBlowerSpeed();
	}

	public void setDesiredTemp(int temp) {
		ac.setDesiredTemp(temp);
	}

	public int getDesiredTemp() {
		return ac.getDesiredTemp();
	}

	public void setCurrentTemp(int temp) {
		ac.setCurrentTemp(temp);
	}

	/**
	 * @param ifc
	 */
	public void setAc(ACIfc ifc) {
		ac = ifc;
	}

	/**
	 * @param ifc
	 */
	public void setDirection(DirectionIfc ifc) {
		direction = ifc;
	}

	/**
	 * @param ifc
	 */
	public void setEngine(EngineIfc ifc) {
		engine = ifc;
	}

	/**
	 * @param ifc
	 */
	public void setId(IdIfc ifc) {
		id = ifc;
	}

	/**
	 * @param ifc
	 */
	public void setTransmission(TransmissionIfc ifc) {
		transmission = ifc;
	}

	/**
	 * @return
	 */
	public ACIfc getAc() {
		return ac;
	}

	/**
	 * @return
	 */
	public DirectionIfc getDirection() {
		return direction;
	}

	/**
	 * @return
	 */
	public EngineIfc getEngine() {
		return engine;
	}

	/**
	 * @return
	 */
	public IdIfc getId() {
		return id;
	}

	/**
	 * @return
	 */
	public TransmissionIfc getTransmission() {
		return transmission;
	}

}
