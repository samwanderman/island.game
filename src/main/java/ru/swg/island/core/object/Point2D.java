/**
 * @author Potapov Sergei (sam-wanderman@yandex.ru)
 */
package ru.swg.island.core.object;

/**
 * Simple point class
 */
public class Point2D {
	// x
	private int x;
	// y
	private int y;
	
	/**
	 * Constructor
	 * 
	 * @param x
	 * @param y
	 */
	public Point2D(final int x, final int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Get x
	 * 
	 * @return
	 */
	public final int getX() {
		return x;
	}

	/**
	 * Get y
	 * 
	 * @return
	 */
	public final int getY() {
		return y;
	}
}
