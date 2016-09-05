/**
 * @author Potapov Sergei (sam-wanderman@yandex.ru)
 */
package ru.swg.island.core;

import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;

import javax.swing.JFrame;

import ru.swg.wheelframework.io.Resources;
import ru.swg.wheelframework.log.Log;
import ru.swg.wheelframework.view.DisplayContainer;
import ru.swg.wheelframework.view.FrameworkAdapter;
import ru.swg.wheelframework.view.ui.GuiImage;
import ru.swg.wheelframework.view.ui.Sprite;

/**
 * Launcher
 */
public class Game {
	public static void main(String[] args) {
		try {
			Resources.init();
		} catch (IOException e) {
			Log.error(e.getLocalizedMessage());
			return;
		}
		
		final DisplayContainer container = new DisplayContainer(), container2 = new DisplayContainer();
		final Sprite sprite1 = new Sprite();
		sprite1.setColor(Color.RED);
		sprite1.setX(10);
		sprite1.setY(10);
		sprite1.setHeight(100);
		sprite1.setWidth(100);
		
		final Sprite sprite2 = new Sprite();
		sprite2.setColor(Color.BLUE);
		sprite2.setX(0);
		sprite2.setY(0);
		sprite2.setHeight(25);
		sprite2.setWidth(25);
		
		container.addChild(sprite1);
		container.addChild(sprite2);
		container2.addChild(container);
		container.setX(50);
		container.setY(100);
		
		container2.addChild(new GuiImage("./test.png"));
		
    	final JFrame frame = new JFrame();
		frame.setSize(new Dimension(300, 300));		
		frame.setTitle(Resources.getString("app.name"));
		frame.getContentPane().add(new FrameworkAdapter(container2));
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setFocusable(true);
		frame.setVisible(true);
	}
}
