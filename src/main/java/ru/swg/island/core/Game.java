/**
 * @author Potapov Sergei (sam-wanderman@yandex.ru)
 */
package ru.swg.island.core;

import java.awt.Dimension;
import java.io.IOException;

import javax.swing.JFrame;

import ru.swg.island.io.IO;
import ru.swg.wheelframework.io.Resources;
import ru.swg.wheelframework.view.FrameworkAdapter;

/**
 * Launcher
 */
public class Game {
	public static void main(String[] args) 
			throws IOException {
		Resources.init();
		
    	final JFrame frame = new JFrame();
		frame.setSize(new Dimension(300, 300));		
		frame.setTitle(Resources.getString("app.name"));
		frame.getContentPane().add(new FrameworkAdapter(IO.loadLevel("level1")));
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setFocusable(true);
		frame.setVisible(true);
	}
}
