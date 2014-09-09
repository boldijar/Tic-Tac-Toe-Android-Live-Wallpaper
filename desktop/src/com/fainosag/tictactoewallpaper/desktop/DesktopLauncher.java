package com.fainosag.tictactoewallpaper.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.fainosag.tictactoewallpaper.DefaultClass;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width=(int)(480*0.7f);
        config.height=(int)(800*0.7f);
		new LwjglApplication(new DefaultClass(), config);
	}
}
