package de.thm.plotter.util;

import de.thm.plotter.figurimpl.Point;

/**
 * @author René Gerlach
 * @see <a href= "https://www.matheretter.de/rechner/trigonometrie">
 *      Visualisierung Einheitskreis</a>
 *
 *      Anpassung Noah Ruben Point ==> Point
 */
public class EinheitsKreis{

	/**
	 * @author Rene Gerlach
	 * @see <a href="https://github.com/SirMoM/SoftwaretechnikAufgaben">Github</a>
	 */
	public static class MathHelper{
		public static double getHypothenuse(final Point p1, final Point p2){
			final double deltaX = p1.getXPos() - p2.getXPos();
			final double deltaY = p1.getYPos() - p2.getYPos();
			return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
		}
	}

	/**
	 * Fuehrt Berechnungen ueber den Einheitskreis aus. Hierbei wird von einem
	 * Startwinkel von 0 ausgegangen. Es ist darauf zu achten, dass ein positiver
	 * Winkel eine Drehung im Gegenuhrzeigersinn betrachtet.
	 *
	 * @param winkelInGradImGegenuhrzeigersinn
	 * @param radius
	 * @return neuer Punkt auf den EinheitsKreis
	 */
	public static Point berechnePositionAufKreis(final double winkelInGradImGegenuhrzeigersinn, final double radius){
		final double x = Math.cos(Math.toRadians(winkelInGradImGegenuhrzeigersinn)) * radius;
		final double y = Math.sin(Math.toRadians(winkelInGradImGegenuhrzeigersinn)) * radius;
		return new Point(x, y);
	}

	/**
	 * Fuehrt Berechnungen ueber den Einheitskreis aus. Hier wird von einer
	 * gegebenen Position im Einheitskreis ausgegangen.Es ist darauf zu achten, dass
	 * ein positiver Winkel eine Drehung im Gegenuhrzeigersinn betrachtet.
	 *
	 * @param winkelInGradImGegenuhrzeigersinn
	 * @param radius
	 * @return
	 */
	public static Point berechnePositionAufKreis(final Point positionImEinheitskreis, final double drehungInGradImGegenuhrzeigersinn){
		final double radius = MathHelper.getHypothenuse(new Point(0, 0), positionImEinheitskreis);
		double gradDerPositionImEinheitskreis = Math.toDegrees(Math.acos(positionImEinheitskreis.getXPos() / radius));
		if(positionImEinheitskreis.getYPos() < 0){
			gradDerPositionImEinheitskreis = 360 - gradDerPositionImEinheitskreis;
		}
		final double gradAbsolut = gradDerPositionImEinheitskreis + drehungInGradImGegenuhrzeigersinn;
		// final double gradAbsolut = (gradDerPositionImEinheitskreis +
		// drehungInGradImGegenuhrzeigersinn) % 360;

		final double xBerechnet = Math.cos(Math.toRadians(gradAbsolut)) * radius;
		final double yBerechnet = Math.sin(Math.toRadians(gradAbsolut)) * radius;
		return new Point(xBerechnet, yBerechnet);
	}

}