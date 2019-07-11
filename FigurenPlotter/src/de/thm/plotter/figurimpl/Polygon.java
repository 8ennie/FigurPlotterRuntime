package de.thm.plotter.figurimpl;

import java.util.ArrayList;

import de.thm.plotter.figurs.PolygonGen;
import processing.core.PApplet;

/**
 * @author Noah Ruben, Benjamin
 *
 */
public class Polygon extends PolygonGen {

	/**
	 * @param name
	 * @param color
	 * @param filled
	 * @param strokeWeight
	 * @param degree
	 * @param displayName
	 * @param radius
	 * @param numberOfVertices
	 * @param center
	 * @param figures
	 */
	public Polygon(String name, String color, boolean filled, int strokeWeight, int degree, boolean displayName,
			double radius, int numberOfVertices, Point center, ArrayList<Figur> figures) {
		super(name, color, filled, strokeWeight, degree, displayName, radius, numberOfVertices, center, figures);
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
	 * @param numberOfVertices
	 * @param figures
	 */
	public Polygon(String name, String color, boolean filled, int strokeWeight, int degree, boolean displayName,
			Point center, double radius, int numberOfVertices, ArrayList<Figur> figures) {
		super(name, color, filled, strokeWeight, degree, displayName, radius, numberOfVertices, center, figures);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see figurenbase.Figur#show()
	 */
	@Override
	public void show(PApplet sketch) {
		super.setDisplayConfig(sketch);
		polygon(sketch, (float) this.getCenter().getXPos(), (float) this.getCenter().getYPos(),
				(float) this.getRadius(), this.getNumberOfVertices(), this.getDegree());
		super.resetDisplayConfig(sketch);
	}

	/**
	 * @param sketch
	 * @param x
	 * @param y
	 * @param radius
	 * @param npoints
	 * @param degree
	 */
	void polygon(PApplet sketch, float x, float y, float radius, int npoints, int degree) {
		float angle = (float) (2 * Math.PI / npoints);
		sketch.pushMatrix();
		sketch.translate((float) getCenter().getXPos(), (float) getCenter().getYPos());
		sketch.rotate((float) Math.toRadians(degree - 360 / npoints / 2));

		sketch.beginShape();
		// 2.1 for unprecise calculations with perfect Math <= 2 would be enough 
		for (float a = 0; a < 2.1 * Math.PI; a += angle) {
			float sx = (float) (Math.cos(a) * radius);
			float sy = (float) (Math.sin(a) * radius);
			sketch.vertex(sx, sy);
		}
		sketch.endShape();
		sketch.popMatrix();
	}
}
