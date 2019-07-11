package de.thm.plotter.figurimpl;

import java.util.ArrayList;

import de.thm.plotter.figurs.ArrowGen;
import de.thm.plotter.util.EinheitsKreis;
import processing.core.PApplet;

/**
 * @author Noah Ruben, Benjamin
 *
 */
public class Arrow extends ArrowGen {

	private Point A;
	private Point B;

	float coeff = 1.5f;
	float headSize = 5;

	/**
	 * @param name
	 * @param color
	 * @param filled
	 * @param strokeWeight
	 * @param degree
	 * @param displayName
	 * @param lenght
	 * @param arrowheadRight
	 * @param arrowheadLeft
	 * @param center
	 * @param figures
	 */
	public Arrow(String name, String color, boolean filled, int strokeWeight, int degree, boolean displayName,
			double lenght, boolean arrowheadRight, boolean arrowheadLeft, Point center, ArrayList<Figur> figures) {
		super(name, color, filled, strokeWeight, degree, displayName, lenght, arrowheadRight, arrowheadLeft, center,
				figures);
		A = center.move(EinheitsKreis.berechnePositionAufKreis(degree, getLenght() / 2));
		B = center.move(EinheitsKreis.berechnePositionAufKreis(degree + 180, getLenght() / 2));
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
	 * @param arrowheadRight
	 * @param arrowheadLeft
	 * @param figures
	 */
	public Arrow(String name, String color, boolean filled, int strokeWeight, int degree, boolean displayName,
			Point center, double lenght, boolean arrowheadRight, boolean arrowheadLeft, ArrayList<Figur> figures) {
		super(name, color, filled, strokeWeight, degree, displayName, lenght, arrowheadRight, arrowheadLeft, center,
				figures);
		A = center.move(EinheitsKreis.berechnePositionAufKreis(degree, getLenght() / 2));
		B = center.move(EinheitsKreis.berechnePositionAufKreis(degree + 180, getLenght() / 2));
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see figurenbase.Line#show()
	 */
	@Override // TODO EIGENE IMPL ARROW
	public void show(PApplet sketch) {
		final float x0 = (float) A.getXPos();
		final float y0 = (float) A.getYPos();
		final float x1 = (float) B.getXPos();
		final float y1 = (float) B.getYPos();

		final int angle = getDegree();

		sketch.line((float) this.A.getXPos(), (float) this.A.getYPos(), (float) this.B.getXPos(),
				(float) this.B.getYPos());

		if (getFilled()) {
			// begin head
			sketch.pushMatrix();
			sketch.translate(x1, y1);
			sketch.rotate((float) (angle + Math.PI));
			sketch.triangle(-headSize * coeff, -headSize, -headSize * coeff, headSize, 0, 0);
			sketch.popMatrix();
			// end head
			sketch.pushMatrix();
			sketch.translate(x0, y0);
			sketch.rotate(angle);
			sketch.triangle(-headSize * coeff, -headSize, -headSize * coeff, headSize, 0, 0);
			sketch.popMatrix();
		} else {
			// begin head
			sketch.pushMatrix();
			sketch.translate(x1, y1);
			sketch.rotate((float) (angle + Math.PI));
			sketch.strokeCap(PApplet.ROUND);
			sketch.line(-headSize * coeff, -headSize, 0, 0);
			sketch.line(-headSize * coeff, headSize, 0, 0);
			sketch.popMatrix();
			// end head
			sketch.pushMatrix();
			sketch.translate(x0, y0);
			sketch.rotate(angle);
			sketch.strokeCap(PApplet.ROUND);
			sketch.line(-headSize * coeff, -headSize, 0, 0);
			sketch.line(-headSize * coeff, headSize, 0, 0);
			sketch.popMatrix();
		}

	}
}
