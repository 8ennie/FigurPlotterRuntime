/**
 *
 */
package de.thm.plotter.figurimpl;

import java.util.ArrayList;

import de.thm.plotter.figurs.FigurGen;
import processing.core.PApplet;

/**
 * @author Noah Ruben, Benjamin
 */
public abstract class Figur extends FigurGen {

	/**
	 * @param name
	 * @param color
	 * @param filled
	 * @param strokeWeight
	 * @param degree
	 * @param displayName
	 * @param center
	 * @param figures
	 */
	public Figur(String name, String color, boolean filled, int strokeWeight, int degree, boolean displayName,
			Point center, ArrayList<Figur> figures) {
		super(name, color, filled, strokeWeight, degree, displayName, center, figures);
	}
	

	
	public Figur() {
		super();
	}



	/**
	 * This show the Figur on the Processing-App
	 * 
	 * @param sketch the Processing-App to show on
	 */
	abstract public void show(PApplet sketch);

	/**
	 * This Method set all the figure special configs for displaying it on screen<p>
	 * This needs to be called before show is called.
	 * 
	 * @param sketch the processing App on which it is displayed
	 */
	protected void setDisplayConfig(PApplet sketch) {
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
		sketch.strokeWeight(getStrokeWeight());

	}

	/**
	 * This Method resets all the figure special configs which could have been changed
	 * THis needs to be called after show is called.
	 * 
	 * @param sketch the processing App on which it is displayed
	 */
	protected void resetDisplayConfig(PApplet sketch) {
		sketch.noFill();
		sketch.stroke(0);
		sketch.strokeWeight(1);
	}
}
