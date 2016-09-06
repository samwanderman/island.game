/**
 * @author Potapov Sergei (sam-wanderman@yandex.ru)
 */
package ru.swg.island.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ru.swg.island.core.object.Level;
import ru.swg.island.core.object.TilePoint;
import ru.swg.island.io.IO;
import ru.swg.wheelframework.view.DisplayContainerInterface;
import ru.swg.wheelframework.view.DisplayObject;

/**
 * Gui level
 */
public class GuiLevel extends DisplayObject implements DisplayContainerInterface {
	// level base info
	private final Level info;
	// gui representation of tiles
	private final List<GuiTile> tiles = new ArrayList<>();
	
	/**
	 * Constructor
	 * 
	 * @param info
	 */
	public GuiLevel(final Level info) 
			throws IOException {
		this.info = info;
		
		for (final TilePoint tilePoint: info.getTiles()) {
			final GuiTile tile = new GuiTile(IO.loadTile(tilePoint.getTile()), tilePoint.getPoint());
			tile.setParent(this);
			tiles.add(tile);
		}
	}

	@Override
	public List<GuiTile> getChildren() {
		return tiles;
	}
}
