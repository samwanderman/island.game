/**
 * @author Potapov Sergei (sam-wanderman@yandex.ru)
 */
package ru.swg.island.view;

import java.util.Comparator;

import ru.swg.wheelframework.view.Point2D;

/**
 * GuiTile comparator
 */
public final class GuiTileComparator implements Comparator<GuiTile> {
	public final int compare(final GuiTile o1, final GuiTile o2) {
		final Point2D p1 = o1.getPoint(), p2 = o2.getPoint();

		// Layer sorting
		if (o1.getZ() > o2.getZ()) {
			return 1;
		}
		
		if (o1.getZ() < o2.getZ()) {
			return -1;
		}

		// If same layer - tile pos sorting
		if ((p1.getX() >= p2.getX()) && (p1.getY() >= p2.getY())) {
			return 1;
		}
		
		if ((p1.getX() <= p2.getX()) && (p1.getY() <= p2.getY())) {
			return -1;
		}
		
		return 0;
	}
}
