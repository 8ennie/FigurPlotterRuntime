package de.thm.plotter.figurimpl;

import de.thm.plotter.figurs.PointGen;

/**
 * @author Noah Ruben
 * @see <a href="https://github.com/SirMoM/FigurenPlotterBase">Github</a>
 */
public class Point extends PointGen{

	/**
	 * @param xPos X-Position of the point on the canvas
	 * @param yPos Y-Position of the point on the canvas
	 */
	public Point(final double xPos, final double yPos){
		super(xPos, yPos);
	}

	public Point move(final Point p){
		return new Point(this.getXPos() + p.getXPos(), this.getYPos() + p.getYPos());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		final StringBuilder builder = new StringBuilder();
		builder.append("Point [ X =");
		builder.append(this.getXPos());
		builder.append(", Y=");
		builder.append(this.getYPos());
		builder.append("]");
		return builder.toString();
	}

}
