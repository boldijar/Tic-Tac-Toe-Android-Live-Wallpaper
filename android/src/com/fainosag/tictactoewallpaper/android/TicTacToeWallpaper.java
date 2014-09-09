package com.fainosag.tictactoewallpaper.android;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.badlogic.gdx.backends.android.AndroidLiveWallpaperService;
import com.fainosag.tictactoewallpaper.DefaultClass;

/**
 * Created by Paul on 9/9/2014.
 */
public class TicTacToeWallpaper extends AndroidLiveWallpaperService {

    @Override
    public void onCreateApplication () {
        super.onCreateApplication();

        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        config.useCompass = false;
        config.useWakelock = false;
        config.useAccelerometer = false;
        config.getTouchEventsForLiveWallpaper = true;

        ApplicationListener listener = new DefaultClass();
        initialize(listener, config);
    }

}
