/**
 * 
 */
package de.thm.plotter.figurimpl;

import de.thm.plotter.figurs.CircleGen;
import processing.core.PApplet;

/**
 * @author Noah Ruben, Benjamin
 *
 */
public class Circle extends CircleGen {

	final double radius;

	/**
	 * @param sketch
	 * @param name
	 * @param color
	 * 
	 * @param filled
	 * @param strokeWeight
	 * @param degree
	 * @param center
	 */
	public Circle(PApplet sketch, String name, String color, boolean filled, int strokeWeight, int degree, Point center, double radius, boolean displayName) {
		super(name, color, filled, strokeWeight, degree, displayName,radius,center,null);
		this.radius = radius;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see figurenbase.Figur#show()
	 */
	@Override
	public void show(PApplet sketch) {
		super.setDisplayConfig(sketch);
		sketch.ellipse((float) getCenter().getXPos(), (float) getCenter().getYPos(), (float) radius, (float) radius);
		super.resetDisplayConfig(sketch);
	}
}
