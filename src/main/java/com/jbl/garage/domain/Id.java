/*
 * Created on Feb 26, 2006
 *
 */
package com.jbl.garage.domain;

import com.jbl.garage.interfaces.IdIfc;

/**
 * @author James Lawrence
 *
 */
public class Id implements IdIfc {

	private String name;
	private String maker;
	
	/**
	 * @return
	 */
	public String getMaker() {
		return maker;
	}

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param string
	 */
	public void setMaker(String string) {
		maker = string;
	}

	/**
	 * @param string
	 */
	public void setName(String string) {
		name = string;
	}

}
