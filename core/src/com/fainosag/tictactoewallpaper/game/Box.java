package com.fainosag.tictactoewallpaper.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.fainosag.tictactoewallpaper.assets.Gfx;

/**
 * Created by Paul on 9/9/2014.
 */
public class Box {
    private float x,y;
    public char value=' ';
    // the value can be x,o, or ' '

    public Box(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public void reset(){
        value=' ';
    }

    public void draw(SpriteBatch spriteBatch){
        spriteBatch.draw(Gfx.greycolor,x,y,120,120);
    }
}
