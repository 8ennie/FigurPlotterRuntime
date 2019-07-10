package de.thm.plotter.figurimpl;

import java.util.ArrayList;

import de.thm.plotter.figurs.SquareGen;
import processing.core.PApplet;

/**
 * @author Noah Ruben, Benjamin
 *
 */
public class Square extends SquareGen {

	public Square(String name, String color, boolean filled, int strokeWeight, int degree, boolean displayName,
			double sizeA, Point center, ArrayList<Figur> figures) {
		super(name, color, filled, strokeWeight, degree, displayName, sizeA, center, figures);
	}

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
