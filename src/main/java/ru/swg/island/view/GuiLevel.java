/**
 * @author Potapov Sergei (sam-wanderman@yandex.ru)
 */
package ru.swg.island.view;

import java.awt.Graphics2D;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ru.swg.island.core.object.Tile;
import ru.swg.wheelframework.io.ImageCache;
import ru.swg.wheelframework.io.Resources;
import ru.swg.wheelframework.view.DisplayObject;

/**
 * Simple level class
 */
public final class GuiLevel extends DisplayObject {
	private final List<Tile> tiles = new ArrayList<>();
	
	/**
	 * Constructor
	 */
	public GuiLevel() {
		final Tile tile = new Tile("./tiles/empty.png");
		tiles.add(tile);
		
		try {
			ImageCache.set(tile.getImage(), Resources.loadImage(tile.getImage()));
		} catch (IOException e) { }
	}
	
	@Override
	public final void paint(final Graphics2D graphics) {
		for (final Tile tile: tiles) {
			graphics.drawImage(ImageCache.get(tile.getImage()), 0, 0, null);
		}
	}
}
