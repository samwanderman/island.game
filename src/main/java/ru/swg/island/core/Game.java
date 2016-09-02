/**
 * @author Potapov Sergei (sam-wanderman@yandex.ru)
 */
package ru.swg.island.core;

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
		Sprite a = new Sprite();
		DisplayContainer b = new DisplayContainer();
		b.addChild(a);
		
    	JFrame frame = new JFrame();
		frame.setSize(new Dimension(100, 100));		
		frame.setTitle("Test");
		frame.getContentPane().add(new FrameworkAdapter(b));
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setFocusable(true);
		frame.setVisible(true);
	}
}
