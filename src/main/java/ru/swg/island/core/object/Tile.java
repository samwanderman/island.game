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
	 * Empty constructor
	 */
	public Tile () { }
	
	/**
	 * Constructor
	 * 
	 * @param id
	 * @param name
	 * @param image
	 */
	public Tile(final String id, final String name, final String image) {
		this.id = id;
		this.name = name;
		this.image = image;
	}

	/**
	 * Get id
	 * 
	 * @return
	 */
	public final String getId() {
		return id;
	}
	
	/**
	 * Set id
	 * 
	 * @param id
	 * @return
	 */
	public final void setId(final String id) {
		this.id = id;
	}
	
	/**
	 * Get name
	 * 
	 * @return
	 */
	public final String getName() {
		return name;
	}
	
	/**
	 * Set name
	 * 
	 * @param name
	 */
	public final void setName(final String name) {
		this.name = name;
	}

	/**
	 * Get image path
	 * 
	 * @return
	 */
	public final String getImage() {
		return image;
	}
	
	/**
	 * Set image
	 * 
	 * @param image
	 */
	public final void setImage(final String image) {
		this.image = image;
	}
}
