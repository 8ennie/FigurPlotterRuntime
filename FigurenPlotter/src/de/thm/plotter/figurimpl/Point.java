package de.thm.plotter.figurimpl;

import de.thm.plotter.figurs.PointGen;

/**
 * @author Noah Ruben, Benjamin
 *
 */
public class Point extends PointGen{

	/**
	 * @param xPos X-Position of the point on the canvas
	 * @param yPos Y-Position of the point on the canvas
	 */
	public Point(final double xPos, final double yPos){
		this.setXPos(xPos);
		this.setYPos(yPos);
	}

	/**
	 * Treats the incoming Point as a Vector and creates a new Point an the new Position 
	 * 
	 * @param vector the "Vector" disguised as a Point 
	 * @return a new Point moved by a Vector
	 */
	public Point move(final Point vector){
		return new Point(this.getXPos() + vector.getXPos(), this.getYPos() + vector.getYPos());
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
