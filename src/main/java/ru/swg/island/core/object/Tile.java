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
	
	/**
	 * Get image path
	 * 
	 * @return
	 */
	public final String getImage() {
		return image;
	}
}
