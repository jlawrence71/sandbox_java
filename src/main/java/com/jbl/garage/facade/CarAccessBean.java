/*
 * Created on Feb 26, 2006
 *
 */
package com.jbl.garage.facade;

import com.jbl.garage.interfaces.*;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author James Lawrence
 *
 */
public class CarAccessBean implements CarAccessBeanIfc {

	private String SPRING_XML = "garage.spring.xml";

	private ClassPathXmlApplicationContext ctx = null;
	private CarIfc car = null;
	private GarageIfc garage = null;
	
	private static CarAccessBean instance = null;
	
	public static CarAccessBean getInstance(){
		if(null == instance)
			instance = new CarAccessBean();
		return instance;
	}
	
	private CarAccessBean(){
		 ctx = new ClassPathXmlApplicationContext(SPRING_XML);
		 
		 car    = (CarIfc)    ctx.getBean("Car");
		 garage = (GarageIfc) ctx.getBean("Garage");
	}

	// **************************
	// Car Functionality
	// **************************
	
	public void goForward(int speed) {
		car.goForward(speed);
	}

	public void goBackward(int speed) {
		car.goBackward(speed);
	}

	public void goLeft() {
		car.goLeft();
	}

	public void goRight() {
		car.goRight();
	}

	public void goStraight() {
		car.goStraight();
	}

	public int getSpeed() {
		return car.getSpeed();
	}

	public void setSpeed(int speed) {
		car.setSpeed(speed);
	}

	public int getThrottle() {
		return car.getThrottle();
	}

	public void setThrottle(int setting) {
		car.setThrottle(setting);
	}

	public int getTemp() {
		return car.getTemp();
	}

	public void setTemp(int temp) {
		car.setTemp(temp);
	}

	public int getRPM() {
		return car.getRPM();
	}

	public void setRPM(int rpm) {
		car.setRPM(rpm);
	}

	public String getName() {
		return car.getName();
	}

	public void setName(String name) {
		car.setName(name);
	}

	public String getMaker() {
		return car.getMaker();
	}

	public void setMaker(String maker) {
		car.setMaker(maker);
	}

	public void setBlowerSpeed(int speed) {
		car.setBlowerSpeed(speed);
	}

	public int getBlowerSpeed() {
		return car.getBlowerSpeed();
	}

	public void setDesiredTemp(int temp) {
		car.setDesiredTemp(temp);
	}

	public int getDesiredTemp() {
		return car.getDesiredTemp();
	}

	public void setCurrentTemp(int temp) {
		car.setCurrentTemp(temp);
	}

	public int getGear() {
		return car.getGear();
	}

	public void setGear(int gear) {
		car.setGear(gear);
	}

	// **************************
	// Garage Functionality
	// **************************

	public void setGarageState(int state) {
		garage.setGarageState(state);
	}

	public int getGarageState() {
		return garage.getGarageState();
	}

	public void setNumberCars(int num) {
		garage.setNumberCars(num);
	}

	public int getNumberCars() {
		return garage.getNumberCars();
	}

}
