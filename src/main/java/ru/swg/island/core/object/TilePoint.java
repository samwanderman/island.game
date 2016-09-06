/**
 * @author Potapov Sergei (sam-wanderman@yandex.ru)
 */
package ru.swg.island.core.object;

/**
 * Tile with point
 */
public class TilePoint {
	// tile id
	private String tile;
	// point
	private Point2D point;
	
	/**
	 * Constructor
	 * 
	 * @param tile
	 * @param point
	 */
	public TilePoint(final String tile, final Point2D point) {
		this.tile = tile;
		this.point = point;
	}
	
	/**
	 * Get tile id
	 * 
	 * @return
	 */
	public final String getTile() {
		return tile;
	}
	
	/**
	 * Get point
	 * 
	 * @return
	 */
	public final Point2D getPoint() {
		return point;
	}
}
