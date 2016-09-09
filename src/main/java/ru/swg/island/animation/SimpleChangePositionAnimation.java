/**
 * @author Potapov Sergei (sam-wanderman@yandex.ru)
 */
package ru.swg.island.animation;

import java.util.List;

import ru.swg.island.view.GuiTile;
import ru.swg.wheelframework.animation.Animation;
import ru.swg.wheelframework.view.Point2D;

/**
 * Animation for simple change position - just coordinates
 */
public final class SimpleChangePositionAnimation implements Animation {
	// Animation target
	private final GuiTile target;
	// Animation speed
	private final int speed;
	// Animation path
	private final List<Point2D> path;
	// animation running
	private boolean running = false;
	
	
	/**
	 * Constructor
	 * 
	 * @param target
	 * @param path
	 * @param speed
	 */
	public SimpleChangePositionAnimation(final GuiTile target, final List<Point2D> path, final int speed) {
		this.target = target;
		this.speed = speed;
		this.path = path;
	}
	
	@Override
	public final boolean isRunning() {
		return running;
	}
	
	@Override
	public final void start() {
		running = true;
	}

	@Override
	public final void stop() {
		running = false;
	}

	@Override
	public final void restart() {
		start();
		stop();
	}

	@Override
	public final void run() {
		if (!running || (path.size() == 0)) {
			return;
		}
		
		final Point2D point = path.get(0);
		target.setPoint(point);
		path.remove(0);
	}
}
