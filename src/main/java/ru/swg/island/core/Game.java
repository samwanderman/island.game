/**
 * @author Potapov Sergei (sam-wanderman@yandex.ru)
 */
package ru.swg.island.core;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

import ru.swg.wheelframework.view.DisplayContainer;
import ru.swg.wheelframework.view.FrameworkAdapter;
import ru.swg.wheelframework.view.ui.Sprite;

/**
 * Launcher
 */
public class Game {
	public static void main(String[] args) {
		final DisplayContainer container = new DisplayContainer();
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
		
    	final JFrame frame = new JFrame();
		frame.setSize(new Dimension(100, 100));		
		frame.setTitle("Test");
		frame.getContentPane().add(new FrameworkAdapter(container));
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setFocusable(true);
		frame.setVisible(true);
	}
}
