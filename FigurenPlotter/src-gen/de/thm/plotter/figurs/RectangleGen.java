package de.thm.plotter.figurs;

import java.lang.String;
import java.util.ArrayList;

import de.thm.plotter.figurimpl.*;

/**
* This is the {@link Rectangle} figurs class.
*
*@generated
*/
public abstract class RectangleGen extends Figur {

	// attributes
	private String name;
	private String color;
	private boolean filled;
	private int strokeWeight;
	private int degree;
	private boolean displayName;
	private double sizeA;
	private double sizeB;

	// references
	private Point center;
	private ArrayList<Figur> figures;

	/**
	* Default constructor.
	*/
	public RectangleGen() {
	}

	/**
	* Constructor for all attributes.
	*/
	public RectangleGen(String name, String color, boolean filled, int strokeWeight, int degree, boolean displayName,
			double sizeA, double sizeB) {
		this.name = name;
		this.color = color;
		this.filled = filled;
		this.strokeWeight = strokeWeight;
		this.degree = degree;
		this.displayName = displayName;
		this.sizeA = sizeA;
		this.sizeB = sizeB;
	}

	/**
	* Full constructor.
	*/
	public RectangleGen(String name, String color, boolean filled, int strokeWeight, int degree, boolean displayName,
			double sizeA, double sizeB, Point center, ArrayList<Figur> figures) {
		this.name = name;
		this.color = color;
		this.filled = filled;
		this.strokeWeight = strokeWeight;
		this.degree = degree;
		this.displayName = displayName;
		this.sizeA = sizeA;
		this.sizeB = sizeB;
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

	public double getSizeA() {
		return this.sizeA;
	}

	public void setSizeA(double SizeA) {
		this.sizeA = SizeA;
	}

	public double getSizeB() {
		return this.sizeB;
	}

	public void setSizeB(double SizeB) {
		this.sizeB = SizeB;
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
