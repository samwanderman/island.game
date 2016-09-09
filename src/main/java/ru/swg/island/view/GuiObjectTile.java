/**
 * @author Potapov Sergei (sam-wanderman@yandex.ru)
 */
package ru.swg.island.view;

import java.awt.Graphics2D;
import java.io.IOException;
import java.util.LinkedList;

import ru.swg.island.animation.SimpleChangePositionAnimation;
import ru.swg.island.core.object.Tile;
import ru.swg.wheelframework.view.Point2D;

/**
 * Gui object tile
 */
public class GuiObjectTile extends GuiTile {
	private SimpleChangePositionAnimation animChangePos = null;
	
	@Override
	public void paint(final Graphics2D graphics) {
		if (animChangePos != null) {
			animChangePos.run();
		}
		super.paint(graphics);
	}
	
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
		animChangePos = new SimpleChangePositionAnimation(this, path, 500);
	}
}
