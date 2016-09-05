/**
 * @author Potapov Sergei (sam-wanderman@yandex.ru)
 */
package ru.swg.island.core;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

import ru.swg.wheelframework.view.FrameworkAdapter;
import ru.swg.wheelframework.view.ui.Sprite;

/**
 * Launcher
 */
public class Game {
	public static void main(String[] args) {
		Sprite sprite = new Sprite();
		sprite.setColor(Color.RED);
		sprite.setX(10);
		sprite.setY(10);
		sprite.setHeight(100);
		sprite.setWidth(100);
		
    	JFrame frame = new JFrame();
		frame.setSize(new Dimension(100, 100));		
		frame.setTitle("Test");
		frame.getContentPane().add(new FrameworkAdapter(sprite));
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setFocusable(true);
		frame.setVisible(true);
	}
}
