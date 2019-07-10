package de.thm.plotter.figurimpl;

import java.util.ArrayList;

import de.thm.plotter.figurs.RectangleGen;
import processing.core.PApplet;

/**
 * @author Noah Ruben, Benjamin
 *
 */
public class Rectangle extends RectangleGen {

	/**
	 * @param name
	 * @param color
	 * @param filled
	 * @param strokeWeight
	 * @param degree
	 * @param displayName
	 * @param sizeA
	 * @param sizeB
	 * @param center
	 * @param figures
	 */
	public Rectangle(String name, String color, boolean filled, int strokeWeight, int degree, boolean displayName,
			double sizeA, double sizeB, Point center, ArrayList<Figur> figures) {
		super(name, color, filled, strokeWeight, degree, displayName, sizeA, sizeB, center, figures);
	}

	@Override
	public void show(PApplet sketch) {
		super.setDisplayConfig(sketch);
		final Point D = new Point(-(getSizeA() / 2), -(getSizeB() / 2));
		sketch.pushMatrix();
		sketch.translate((float) getCenter().getXPos(), (float) getCenter().getYPos());
		sketch.rotate((float) Math.toRadians(getDegree()));
		sketch.rect((float) D.getXPos(), (float) D.getYPos(), (float) getSizeA(), (float) getSizeB());
		sketch.popMatrix();
		super.resetDisplayConfig(sketch);
	}
}
