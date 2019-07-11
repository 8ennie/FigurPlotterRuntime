/**
 * 
 */
package de.thm.plotter.figurimpl;

import java.util.ArrayList;

import de.thm.plotter.figurs.CircleGen;
import processing.core.PApplet;

/**
 * @author Noah Ruben, Benjamin
 *
 */
public class Circle extends CircleGen {

	final double radius;

	/**
	 * @param name
	 * @param color
	 * @param filled
	 * @param strokeWeight
	 * @param degree
	 * @param displayName
	 * @param radius
	 * @param center
	 * @param figures
	 */
	public Circle(String name, String color, boolean filled, int strokeWeight, int degree, boolean displayName,
			double radius, Point center, ArrayList<Figur> figures) {
		super(name, color, filled, strokeWeight, degree, displayName, radius, center, null);
		this.radius = radius;
	}

	/**
	 * @param name
	 * @param color
	 * @param filled
	 * @param strokeWeight
	 * @param degree
	 * @param displayName
	 * @param center
	 * @param radius
	 * @param figures
	 */
	public Circle(String name, String color, boolean filled, int strokeWeight, int degree, boolean displayName,
			Point center, double radius, ArrayList<Figur> figures) {
		super(name, color, filled, strokeWeight, degree, displayName, radius, center, null);
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
