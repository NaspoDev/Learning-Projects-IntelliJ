package me.naspo.flappydemo;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import me.naspo.flappydemo.FlappyDemo;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setWindowedMode(FlappyDemo.WIDTH, FlappyDemo.HEIGHT);
		config.setTitle(FlappyDemo.TITLE);
		new Lwjgl3Application(new FlappyDemo(), config);
	}
}
