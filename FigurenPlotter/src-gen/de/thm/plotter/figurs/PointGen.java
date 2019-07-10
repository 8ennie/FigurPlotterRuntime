package de.thm.plotter.figurs;

import de.thm.plotter.figurimpl.*;

/**
* This is the {@link Point} figurs class.
*
*@generated
*/
public abstract class PointGen {

	// attributes
	private double xPos;
	private double yPos;

	// references

	/**
	* Default constructor.
	*/
	public PointGen() {
	}

	/**
	* Constructor for all attributes.
	*/
	public PointGen(double xPos, double yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}

	public double getXPos() {
		return this.xPos;
	}

	public void setXPos(double XPos) {
		this.xPos = XPos;
	}

	public double getYPos() {
		return this.yPos;
	}

	public void setYPos(double YPos) {
		this.yPos = YPos;
	}

}
