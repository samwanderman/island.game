/**
 * @author Potapov Sergei (sam-wanderman@yandex.ru)
 */
package ru.swg.island.game.core;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import ru.swg.island.common.core.GameBoard;
import ru.swg.island.common.core.object.Level;
import ru.swg.island.common.io.IO;
import ru.swg.wheelframework.io.KeyAdapter;
import ru.swg.wheelframework.io.MouseAdapter;
import ru.swg.wheelframework.io.Resources;
import ru.swg.wheelframework.log.Log;
import ru.swg.wheelframework.view.FrameworkAdapter;
import ru.swg.wheelframework.view.Padding;
import ru.swg.wheelframework.view.ui.ScrollPanel;

/**
 * Launcher
 */
public final class Game extends JFrame {
	private static final long serialVersionUID = 8833839873520014006L;

	private static final int SCREEN_WIDTH = 800;
	private static final int SCREEN_HEIGHT = 600;
	
	private final GameBoard gameBoard;
	
	/**
	 * Starter
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static final void main(final String[] args) 
			throws FileNotFoundException, IOException {
		Resources.init();
		new Game(SCREEN_WIDTH, SCREEN_HEIGHT);
	}
	
	/**
	 * Constructor
	 * 
	 * @param width
	 * @param height
	 * @throws IOException
	 */
	private Game(final int width, final int height) 
			throws IOException {
		gameBoard = new GameBoard();
		setTitle(Resources.getString("title.game.editor"));
		setLayout(null);
		setSize(new Dimension(width, height));
		getContentPane().setBackground(Color.BLACK);
		
		final ScrollPanel scrollPanel = new ScrollPanel(gameBoard, width, height);
		scrollPanel.setPadding(new Padding(20, 20, 20, 60));
		final FrameworkAdapter frameworkAdapter = new FrameworkAdapter(scrollPanel,  width, height);
		getContentPane().add(frameworkAdapter);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setFocusable(true);
		setJMenuBar(getMenu());
		setLocationRelativeTo(null);
		setVisible(true);
		
		// mouse events listener
		final MouseAdapter mouseAdapter = new MouseAdapter(scrollPanel);
		frameworkAdapter.addMouseListener(mouseAdapter);
		frameworkAdapter.addMouseMotionListener(mouseAdapter);
		frameworkAdapter.addMouseWheelListener(mouseAdapter);

		// keyboard events listener
		addKeyListener(new KeyAdapter());
	}
	
	/**
	 * Initialize menu
	 * 
	 * @return
	 */
	private final JMenuBar getMenu() {
		final JMenuBar menuBar = new JMenuBar();
		
		// File Menu
		final JMenu fileMenu = new JMenu(Resources.getString("str.file"));
		final JMenuItem openFile = new JMenuItem(Resources.getString("str.open"));
		openFile.addActionListener(new ActionListener() {
			@Override
			public final void actionPerformed(final ActionEvent e) {
				final JFileChooser fc = new JFileChooser();
				fc.setCurrentDirectory(new File("./"));
				if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
					try {
						final Level level = IO.loadLevel(fc.getSelectedFile().getAbsolutePath());
						gameBoard.loadLevel(level, false);
					} catch (final IOException err) { 
						Log.error(err.getLocalizedMessage());
					}
				}
			}
		});
		fileMenu.add(openFile);
		menuBar.add(fileMenu);
		
		return menuBar;
	}	
}
