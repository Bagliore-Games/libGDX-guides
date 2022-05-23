package ar.com.baglioregames.firstgame;

import ar.com.baglioregames.firstgame.config.Config;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();

		config.setForegroundFPS(60);
		config.setTitle("First Game");
		config.setWindowedMode(Config.WIDTH, Config.HEIGHT);

		new Lwjgl3Application(new MyGame(), config);
	}
}
