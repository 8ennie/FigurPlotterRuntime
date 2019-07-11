/**
 *
 */
package de.thm.plotter.figurimpl;

import de.thm.plotter.figurs.LineGen;
import de.thm.plotter.util.EinheitsKreis;
import processing.core.PApplet;

/**
 * @author Noah Ruben, Benjamin
 *
 */
public class Line extends LineGen {

	final protected Point A;
	final protected Point B;

	/**
	 * @param name
	 * @param color
	 * @param filled
	 * @param strokeWeight
	 * @param degree
	 * @param displayName
	 * @param lenght
	 * @param center
	 * @param figur
	 */
	public Line(final String name, final String color, final boolean filled, final int strokeWeight, final int degree,
			final boolean displayName, final double lenght, final Point center, Figur figur) {
		super(name, color, filled, strokeWeight, degree, displayName, lenght, center, null);
		this.A = center.move(EinheitsKreis.berechnePositionAufKreis(degree, this.getLenght() / 2));
		this.B = center.move(EinheitsKreis.berechnePositionAufKreis(degree + 180, this.getLenght() / 2));
	}

	/**
	 * @param name
	 * @param color
	 * @param filled
	 * @param strokeWeight
	 * @param degree
	 * @param displayName
	 * @param center
	 * @param lenght
	 * @param figur
	 */
	public Line(final String name, final String color, final boolean filled, final int strokeWeight, final int degree,
			final boolean displayName, final Point center, final double lenght, Figur figur) {
		super(name, color, filled, strokeWeight, degree, displayName, lenght, center, null);
		this.A = center.move(EinheitsKreis.berechnePositionAufKreis(degree, this.getLenght() / 2));
		this.B = center.move(EinheitsKreis.berechnePositionAufKreis(degree + 180, this.getLenght() / 2));
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see figurenbase.Figur#show()
	 */
	public void show(final PApplet sketch) {
		super.setDisplayConfig(sketch);
		sketch.line((float) this.A.getXPos(), (float) this.A.getYPos(), (float) this.B.getXPos(),
				(float) this.B.getYPos());
		super.resetDisplayConfig(sketch);
	}

}
