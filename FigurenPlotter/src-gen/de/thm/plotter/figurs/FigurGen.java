package de.thm.plotter.figurs;

import java.lang.String;
import java.util.ArrayList;

import de.thm.plotter.figurimpl.*;

/**
* This is the {@link Figur} figurs class.
*
*@generated
*/
public abstract class FigurGen {

	// attributes
	private String name;
	private String color;
	private boolean filled;
	private int strokeWeight;
	private int degree;
	private boolean displayName;

	// references
	private Point center;
	private ArrayList<Figur> figures;

	/**
	* Default constructor.
	*/
	public FigurGen() {
	}

	/**
	* Constructor for all attributes.
	*/
	public FigurGen(String name, String color, boolean filled, int strokeWeight, int degree, boolean displayName) {
		this.name = name;
		this.color = color;
		this.filled = filled;
		this.strokeWeight = strokeWeight;
		this.degree = degree;
		this.displayName = displayName;
	}

	/**
	* Full constructor.
	*/
	public FigurGen(String name, String color, boolean filled, int strokeWeight, int degree, boolean displayName,
			Point center, ArrayList<Figur> figures) {
		this.name = name;
		this.color = color;
		this.filled = filled;
		this.strokeWeight = strokeWeight;
		this.degree = degree;
		this.displayName = displayName;
		this.center = center;
		this.figures = figures;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String Name) {
		this.name = Name;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String Color) {
		this.color = Color;
	}

	public boolean getFilled() {
		return this.filled;
	}

	public void setFilled(boolean Filled) {
		this.filled = Filled;
	}

	public int getStrokeWeight() {
		return this.strokeWeight;
	}

	public void setStrokeWeight(int StrokeWeight) {
		this.strokeWeight = StrokeWeight;
	}

	public int getDegree() {
		return this.degree;
	}

	public void setDegree(int Degree) {
		this.degree = Degree;
	}

	public boolean getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(boolean DisplayName) {
		this.displayName = DisplayName;
	}

	public Point getCenter() {
		return this.center;
	}

	public void setCenter(Point Center) {
		this.center = Center;
	}

	public ArrayList<Figur> getFigures() {
		return this.figures;
	}

	public void setFigures(ArrayList<Figur> Figures) {
		this.figures = Figures;
	}

}
