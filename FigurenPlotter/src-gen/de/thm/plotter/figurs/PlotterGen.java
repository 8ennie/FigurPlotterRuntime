package de.thm.plotter.figurs;

import java.lang.Integer;
import java.util.ArrayList;

import de.thm.plotter.figurimpl.*;

/**
* This is the {@link Plotter} figurs class.
*
*@generated
*/
public abstract class PlotterGen {

	// attributes
	private Integer canvasLength;
	private Integer canvasWidth;

	// references
	private ArrayList<Figur> figures;

	/**
	* Default constructor.
	*/
	public PlotterGen() {
	}

	/**
	* Constructor for all attributes.
	*/
	public PlotterGen(Integer canvasLength, Integer canvasWidth) {
		this.canvasLength = canvasLength;
		this.canvasWidth = canvasWidth;
	}

	/**
	* Full constructor.
	*/
	public PlotterGen(Integer canvasLength, Integer canvasWidth, ArrayList<Figur> figures) {
		this.canvasLength = canvasLength;
		this.canvasWidth = canvasWidth;
		this.figures = figures;
	}

	public Integer getCanvasLength() {
		return this.canvasLength;
	}

	public void setCanvasLength(Integer CanvasLength) {
		this.canvasLength = CanvasLength;
	}

	public Integer getCanvasWidth() {
		return this.canvasWidth;
	}

	public void setCanvasWidth(Integer CanvasWidth) {
		this.canvasWidth = CanvasWidth;
	}

	public ArrayList<Figur> getFigures() {
		return this.figures;
	}

	public void setFigures(ArrayList<Figur> Figures) {
		this.figures = Figures;
	}

}
