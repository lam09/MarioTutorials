package com.game.mario.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.game.mario.Mario;

/**
 * Created by a.lam.tuan on 17. 6. 2016.
 */
public class PlayScreen implements Screen {
    private Mario game;
    Texture texture;
    public PlayScreen(Mario game)
    {
        this.game = game;
        texture = new Texture("")
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(1,0,0,1);
        Gdx.gl.glClear();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
