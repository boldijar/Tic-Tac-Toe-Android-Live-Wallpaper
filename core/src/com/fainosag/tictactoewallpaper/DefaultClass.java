package com.fainosag.tictactoewallpaper;

import com.badlogic.gdx.Game;
import com.fainosag.tictactoewallpaper.screens.GameScreen;

public class DefaultClass extends Game {
	@Override
	public void create () {
        // se up our game screen
        setScreen(new GameScreen());
    }


}
