package de.thm.plotter.figurs;

import java.lang.String;
import java.util.ArrayList;

import de.thm.plotter.figurimpl.*;

/**
* This is the {@link Line} figurs class.
*
*@generated
*/
public abstract class LineGen extends Figur {

	// attributes
	private String name;
	private String color;
	private boolean filled;
	private int strokeWeight;
	private int degree;
	private boolean displayName;
	private double lenght;

	// references
	private Point center;
	private ArrayList<Figur> figures;

	/**
	* Default constructor.
	*/
	public LineGen() {
	}

	/**
	* Constructor for all attributes.
	*/
	public LineGen(String name, String color, boolean filled, int strokeWeight, int degree, boolean displayName,
			double lenght) {
		this.name = name;
		this.color = color;
		this.filled = filled;
		this.strokeWeight = strokeWeight;
		this.degree = degree;
		this.displayName = displayName;
		this.lenght = lenght;
	}

	/**
	* Full constructor.
	*/
	public LineGen(String name, String color, boolean filled, int strokeWeight, int degree, boolean displayName,
			double lenght, Point center, ArrayList<Figur> figures) {
		this.name = name;
		this.color = color;
		this.filled = filled;
		this.strokeWeight = strokeWeight;
		this.degree = degree;
		this.displayName = displayName;
		this.lenght = lenght;
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

	public double getLenght() {
		return this.lenght;
	}

	public void setLenght(double Lenght) {
		this.lenght = Lenght;
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
