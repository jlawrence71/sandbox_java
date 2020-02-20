/*
 * Created on Feb 26, 2006
 *
 */
package com.jbl.garage;


import com.jbl.garage.domain.*;
import com.jbl.garage.facade.CarAccessBean;
import com.jbl.garage.interfaces.*;

/**
 * @author James Lawrence
 *
 */
public class MyGarage {

	public static void main(String[] args) {
		
		CarAccessBeanIfc myCarWorld = CarAccessBean.getInstance();
		
		myCarWorld.setGear(TransmissionIfc.FIRST_GEAR);
		myCarWorld.setSpeed(55);
		
		// Through the GarageIfc
		myCarWorld.setNumberCars(2);
		
		System.out.println("Car Name: "  + myCarWorld.getName());
		System.out.println("Car Speed: " + myCarWorld.getSpeed());
		System.out.println("Num Cars: "  + myCarWorld.getNumberCars());
		
	}
}
