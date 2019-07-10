package de.thm.plotter.main;

import de.thm.plotter.figurimpl.*;
import de.thm.plotter.figurs.*;
import processing.core.PApplet;

@SuppressWarnings("serial")
public class MainGen extends PApplet {
	public static void main(final String[] args) {
		PApplet.main(MainGen.class.getName());
	}

	private Line firstLine;
	private Circle testCircle;

	@Override
	public void draw() {
		this.firstLine.show();
		this.testCircle.show();
	}

	public void settings() {
		this.size(500, 500);
	}

	@Override
	public void setup() {
		this.fill(120, 50, 240);
		this.strokeWeight(1);

		this.firstLine = new Line(this, "firstLine", "00cc2c", false, 1, 0, new Point(50.0, 50.0), 50.0, false);

		this.testCircle = new Circle(this, "testCircle", "FF00cc2c", false, 1, 0, new Point(50.0, 75.0), 50.0, false);

	}

}
