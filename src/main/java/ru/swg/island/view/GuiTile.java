/**
 * @author Potapov Sergei (sam-wanderman@yandex.ru)
 */
package ru.swg.island.view;

import java.io.IOException;

import ru.swg.island.core.Const;
import ru.swg.island.core.object.Point2D;
import ru.swg.island.core.object.Tile;
import ru.swg.wheelframework.event.event.MouseEvent;
import ru.swg.wheelframework.io.ImageCache;
import ru.swg.wheelframework.io.Resources;
import ru.swg.wheelframework.log.Log;
import ru.swg.wheelframework.view.MouseEventInterface;
import ru.swg.wheelframework.view.ui.GuiImage;

/**
 * Gui tile
 */
public class GuiTile extends GuiImage implements MouseEventInterface {
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
		super(tile.getImage());
		this.tile = tile;
		this.point = point;
		ImageCache.set(tile.getImage(), Resources.loadImage(tile.getImage()));
		setX(point.getX() * Const.TILE_WIDTH);
		setY(point.getY() * Const.TILE_HEIGHT);
		setWidth(Const.TILE_WIDTH);
		setHeight(Const.TILE_HEIGHT);
	}

	@Override
	public void mouseClick(MouseEvent event) {
		Log.info("Tile " + tile.getName() + " " + point.getX() + " " + point.getY() + " click");
	}

	@Override
	public void mousePressed(MouseEvent event) {
		Log.info("Tile " + tile.getName() + " " + point.getX() + " " + point.getY() + " pressed");
	}

	@Override
	public void mouseReleased(MouseEvent event) {
		Log.info("Tile " + tile.getName() + " " + point.getX() + " " + point.getY() + " released");
	}
}
