/**
 * @author Potapov Sergei (sam-wanderman@yandex.ru)
 */
package ru.swg.island.view;

import java.io.IOException;
import java.util.LinkedList;

import ru.swg.island.core.object.Tile;
import ru.swg.wheelframework.log.Log;
import ru.swg.wheelframework.view.Point2D;

/**
 * Gui object tile
 */
public class GuiObjectTile extends GuiTile {
	/**
	 * Constructor
	 * 
	 * @param tile
	 * @param point
	 */
	public GuiObjectTile(final Tile tile, final Point2D point) 
			throws IOException {
		super(tile, point);
	}
	
	/**
	 * Set animation path
	 * 
	 * @param path
	 */
	public final void setPath(final LinkedList<Point2D> path) {
		// TODO
		Log.info("Path is:");
		for (Point2D point: path) {
			Log.info(point.getX() + " " + point.getY());
		}
		Log.info("---");
	}
}
