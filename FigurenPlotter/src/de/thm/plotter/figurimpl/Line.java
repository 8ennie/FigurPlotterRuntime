/**
 *
 */
package de.thm.plotter.figurimpl;

import de.thm.plotter.figurs.LineGen;
import de.thm.plotter.util.EinheitsKreis;
import processing.core.PApplet;

/**
 * @author Admin
 * @see <a href="https://github.com/SirMoM/FigurenPlotterBase">Github</a>
 */
public class Line extends LineGen {

	final Point A;
	final Point B;
	/**
	 * @param sketch
	 * @param name
	 * @param color
	 * @param filled
	 * @param strokeWeight
	 * @param degree
	 * @param center
	 */
	public Line(final PApplet sketch, final String name, final String color, final boolean filled, final int strokeWeight, final int degree, final Point center, final double lenght,final boolean displayName) {
		super(name, color,filled,strokeWeight,degree,displayName,lenght,center,null);
		this.A = center.move(EinheitsKreis.berechnePositionAufKreis(degree, this.getLenght() / 2));
		this.B = center.move(EinheitsKreis.berechnePositionAufKreis(degree + 180, this.getLenght() / 2));
		System.out.println("A: " + this.A + " B: " + this.B);
		this.setSketch(sketch);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see figurenbase.Figur#show()
	 */

	public void show() {
		super.setDisplayConfig();
		this.getSketch().line((float) this.A.getXPos(), (float) this.A.getYPos(), (float) this.B.getXPos(), (float) this.B.getYPos());
		super.resetDisplayConfig();
	}

}
