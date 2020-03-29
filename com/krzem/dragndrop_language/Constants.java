package com.krzem.dragndrop_language;



import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.io.File;
import java.lang.Exception;



public class Constants{
	public static final int DISPLAY_ID=0;
	public static final GraphicsDevice SCREEN=GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[DISPLAY_ID];
	public static final Rectangle WINDOW_SIZE=SCREEN.getDefaultConfiguration().getBounds();
	public static final int MAX_FPS=60;

	public static final Color APP_BG_COLOR=new Color(20,145,230);

	public static final int BLOCK_MIN_WIDTH=65;
	public static final int DEFAULT_BLOCK_HEIGHT=30;
	public static final Color BLOCK_COLOR=new Color(210,210,210);
	public static final Color BLOCK_BORDER_COLOR=new Color(130,130,130);
}