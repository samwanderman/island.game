/**
 * @author Potapov Sergei (sam-wanderman@yandex.ru)
 */
package ru.swg.island.core.object;

/**
 * Class for tiles
 */
public final class Tile {
	private final String image;
	
	/**
	 * Constructor
	 * 
	 * @param id
	 * @param image
	 */
	public Tile(final String image) {
		this.image = image;
	}
	
	/**
	 * Get image path
	 * 
	 * @return
	 */
	public final String getImage() {
		return image;
	}
}
