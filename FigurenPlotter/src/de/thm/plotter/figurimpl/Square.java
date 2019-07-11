package de.thm.plotter.figurimpl;

import java.util.ArrayList;

import de.thm.plotter.figurs.SquareGen;
import processing.core.PApplet;

/**
 * @author Noah Ruben, Benjamin
 *
 */
public class Square extends SquareGen {

	/**
	 * @param name
	 * @param color
	 * @param filled
	 * @param strokeWeight
	 * @param degree
	 * @param displayName
	 * @param sizeA
	 * @param center
	 * @param figures
	 */
	public Square(String name, String color, boolean filled, int strokeWeight, int degree, boolean displayName,
			double sizeA, Point center, ArrayList<Figur> figures) {
		super(name, color, filled, strokeWeight, degree, displayName, sizeA, center, figures);
	}

	/**
	 * @param name
	 * @param color
	 * @param filled
	 * @param strokeWeight
	 * @param degree
	 * @param displayName
	 * @param center
	 * @param sizeA
	 * @param figures
	 */
	public Square(String name, String color, boolean filled, int strokeWeight, int degree, boolean displayName,
			Point center, double sizeA, ArrayList<Figur> figures) {
		super(name, color, filled, strokeWeight, degree, displayName, sizeA, center, figures);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see figurenbase.Figur#show()
	 */
	@Override
	public void show(PApplet sketch) {
		super.setDisplayConfig(sketch);
		final Point D = new Point(-(getSizeA() / 2), -(getSizeA() / 2));
		sketch.pushMatrix();
		sketch.translate((float) getCenter().getXPos(), (float) getCenter().getYPos());
		sketch.rotate((float) Math.toRadians(getDegree()));
		sketch.rect((float) D.getXPos(), (float) D.getYPos(), (float) getSizeA(), (float) getSizeA());
		sketch.popMatrix();
		super.resetDisplayConfig(sketch);
	}

}
