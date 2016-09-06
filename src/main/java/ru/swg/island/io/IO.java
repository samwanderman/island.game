/**
 * @author Potapov Sergei (sam-wanderman@yandex.ru)
 */
package ru.swg.island.io;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

import ru.swg.island.core.object.Level;
import ru.swg.island.core.object.Point2D;
import ru.swg.island.core.object.Tile;
import ru.swg.island.core.object.TilePoint;
import ru.swg.island.view.GuiLevel;
import ru.swg.wheelframework.io.Resources;

/**
 * Level save/load
 */
public class IO {
	/**
	 * Load tile info
	 * 
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public static final Tile loadTile(final String path) 
			throws IOException {
		return Resources.loadObject("./tiles/" + path + ".json", Tile.class);
	}
	
	/**
	 * Load level info
	 * 
	 * @param path
	 * @return
	 * @throws IOException
	 */
	private static final Level loadLevelInfo(final String path)
			throws IOException {
		final JsonNode json = Resources.loadJSON("./levels/" + path + ".json");		
		final Level level = new Level();		
		level.setId(json.get("id").asText());
		level.setWidth(json.get("width").asInt(0));
		level.setHeight(json.get("height").asInt(0));
		
		final List<TilePoint> tiles = new ArrayList<>();
		level.setTiles(tiles);
		
		final Iterator<JsonNode> iterator = json.get("tiles").elements();
		while (iterator.hasNext()) {
			final JsonNode node = iterator.next();
			final Point2D point = new Point2D(node.get("point").get("x").asInt(0), node.get("point").get("y").asInt(0));
			final TilePoint tile = new TilePoint(node.get("tile").asText(), point);
			tiles.add(tile);
		}
		
		return level;
	}
	
	/**
	 * Load level
	 * 
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public static final GuiLevel loadLevel(final String path) 
			throws IOException {
		return new GuiLevel(loadLevelInfo(path));
	}
}
