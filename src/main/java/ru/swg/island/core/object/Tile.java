/**
 * @author Potapov Sergei (sam-wanderman@yandex.ru)
 */
package ru.swg.island.core.object;

/**
 * Class for tiles
 */
public final class Tile {
	// Tile id
	private String id;
	// Short tile description
	private String name;
	// Path to image
	private String image;
	// Tile weight
	private int weight;
	
	/**
	 * Get image path
	 * 
	 * @return
	 */
	public final String getImage() {
		return image;
	}
	
	/**
	 * Get tile name
	 * 
	 * @return
	 */
	public final String getName() {
		return name;
	}
	
	/**
	 * Get tile weight
	 * 
	 * @return
	 */
	public final int getWeight() {
		return weight;
	}
}
