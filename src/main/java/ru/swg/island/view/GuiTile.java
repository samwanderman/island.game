/**
 * @author Potapov Sergei (sam-wanderman@yandex.ru)
 */
package ru.swg.island.view;

import java.awt.Graphics2D;
import java.io.IOException;

import ru.swg.island.core.Const;
import ru.swg.island.core.object.Point2D;
import ru.swg.island.core.object.Tile;
import ru.swg.wheelframework.io.ImageCache;
import ru.swg.wheelframework.io.Resources;
import ru.swg.wheelframework.view.DisplayObject;

/**
 * Gui tile
 */
public class GuiTile extends DisplayObject {
	private final Tile tile;
	private final Point2D point;
	
	/**
	 * Constructor
	 * 
	 * @param path
	 * @throws IOException
	 */
	public GuiTile(final Tile tile, final Point2D point) 
			throws IOException {
		this.tile = tile;
		this.point = point;
		ImageCache.set(tile.getImage(), Resources.loadImage(tile.getImage()));
		setX(point.getX() * Const.TILE_WIDTH);
		setY(point.getY() * Const.TILE_HEIGHT);
	}
	
	@Override
	public final void paint(Graphics2D graphics) {
		super.paint(graphics);
		graphics.drawImage(ImageCache.get(tile.getImage()), getAbsoluteX(), getAbsoluteY(), null);
	}
}
