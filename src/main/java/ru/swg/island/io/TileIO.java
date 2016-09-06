/**
 * @author Potapov Sergei (sam-wanderman@yandex.ru)
 */
package ru.swg.island.io;

import java.io.IOException;

import ru.swg.island.core.object.Tile;
import ru.swg.wheelframework.io.Resources;

/**
 * Class for tiles I/O
 */
public final class TileIO {
	/**
	 * Load tile
	 * 
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public static final Tile load(final String path) 
			throws IOException {
		return Resources.loadObject("./tiles/" + path + ".json", Tile.class);
	}
}
