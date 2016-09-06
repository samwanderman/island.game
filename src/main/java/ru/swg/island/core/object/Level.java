/**
 * @author Potapov Sergei (sam-wanderman@yandex.ru)
 */
package ru.swg.island.core.object;

import java.util.List;

/**
 * Level
 */
public final class Level {
	// id
	private String id;
	// width in cells
	private int width;
	// height in cells
	private int height;
	// tiles list
	private List<TilePoint> tiles;
	
	/**
	 * Set id
	 * 
	 * @param id
	 */
	public final void setId(final String id) {
		this.id = id;
	}
	
	/**
	 * Set width
	 * 
	 * @param width
	 */
	public final void setWidth(final int width) {
		this.width = width;
	}
	
	/**
	 * Set height
	 * 
	 * @param height
	 */
	public final void setHeight(final int height) {
		this.height = height;
	}
	
	/**
	 * Get tiles
	 * 
	 * @return
	 */
	public final List<TilePoint> getTiles() {
		return tiles;
	}

	/**
	 * Set tiles
	 * 
	 * @param tiles
	 */
	public final void setTiles(final List<TilePoint> tiles) {
		this.tiles = tiles;
	}
}
