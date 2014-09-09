package com.fainosag.tictactoewallpaper.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.fainosag.tictactoewallpaper.assets.Gfx;
import com.fainosag.tictactoewallpaper.game.Box;
import com.fainosag.tictactoewallpaper.rendering.CameraWrapper;

/**
 * Created by Paul on 9/9/2014.
 */
public class GameScreen implements Screen {

    private CameraWrapper cameraWrapper;
    private Box[] boxes=new Box[9];
    // box are positioned like this
    // 0 1 2
    // 3 4 5
    // 6 7 8
    private void loadBoxes(){
        boxes[1]=new Box(240-60,620);
        boxes[4]=new Box(240-60,480);
        boxes[7]=new Box(240-60,340);

        boxes[0]=new Box(240-60-140,620);
        boxes[3]=new Box(240-60-140,480);
        boxes[6]=new Box(240-60-140,340);

        boxes[2]=new Box(240-60+140,620);
        boxes[5]=new Box(240-60+140,480);
        boxes[8]=new Box(240-60+140,340);

    }
    @Override
    public void show() {
        Gfx.load();
        cameraWrapper=new CameraWrapper();
        loadBoxes();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(46/255f, 52/255f, 54/255f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        cameraWrapper.begin();
        for(Box box : boxes){
            if(box!=null){
                box.draw(cameraWrapper.spriteBatch);
            }
        }
        cameraWrapper.end();
    }

    @Override
    public void resize(int width, int height) {
        cameraWrapper.resize(width, height);
    }



    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
