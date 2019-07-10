/**
 *
 */
package de.thm.plotter.figurimpl;

import java.util.ArrayList;

import de.thm.plotter.figurs.FigurGen;
import processing.core.PApplet;

/**
 * @author Noah Ruben
 * @see <a href="https://github.com/SirMoM/FigurenPlotterBase">Github</a>
 */
public abstract class Figur extends FigurGen{

	/**
	 * This ist the processing renderer which is uses to display all "Figur's"
	 */
	private PApplet sketch;

	/**
	 * @param sketch
	 * @param name
	 * @param color
	 * @param filled
	 * @param strokeWeight
	 * @param degree
	 * @param center
	 */
	public Figur(final PApplet sketch, final String name, final String color, final boolean filled, final int strokeWeight, final int degree, final Point center) {
		this.sketch = sketch;
		// for DEBUGING
		sketch.stroke(255);
		sketch.ellipse((float) center.getXPos(), (float) center.getYPos(), 7, 7);
		sketch.stroke(0);

	}

	
	
	public Figur() {
	}



	public void addFigur(final Figur figur) {
		this.getFigures().add(figur);
	}

	public PApplet getSketch() {
		return sketch;
	}
	
	public void setSketch(PApplet sketch) {
		this.sketch = sketch;
	}



	abstract public void show();

	protected void setDisplayConfig() {

		if (getColor() != null) {
			int colorInt;
			if (this.getColor().length() <= 6) {
				colorInt = PApplet.unhex("FF" + this.getColor());
			} else {
				colorInt = PApplet.unhex(this.getColor());
			}
			System.out.println(colorInt);
			sketch.fill(colorInt);
			if (!getFilled()) {
				sketch.stroke(colorInt);
				sketch.noFill();
			}
		}

		this.sketch.strokeWeight(getStrokeWeight());

	}

	protected void resetDisplayConfig() {
		this.sketch.noFill();
		this.sketch.stroke(0);
		this.sketch.strokeWeight(1);

	}
}
