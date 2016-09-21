/**
 * @author Potapov Sergei (sam-wanderman@yandex.ru)
 */
package ru.swg.island.core;

import java.io.IOException;

import ru.swg.island.common.core.Const;
import ru.swg.island.common.io.IO;
import ru.swg.wheelframework.io.Resources;
import ru.swg.wheelframework.view.Scene;

/**
 * Launcher
 */
public final class Game {
	public static final void main(final String[] args) 
			throws IOException {
		Resources.init();		
		new Scene(Resources.getString("app.name"), IO.loadLevel("level1"), Const.WINDOW_WIDTH, Const.WINDOW_HEIGHT);
	}
}
