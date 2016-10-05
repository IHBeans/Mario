package com.ian.mario.Screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.ian.mario.Constants;
import com.ian.mario.MarioGame;

public class PlayScreen implements Screen {

    private MarioGame game;
    private OrthographicCamera camera;
    private Viewport gameViewport;

    public PlayScreen(MarioGame game) {
        this.game = game;
        camera = new OrthographicCamera();
        gameViewport = new FitViewport(Constants.V_WIDTH, Constants.V_HEIGHT, camera);

    }

    @Override
    public void show() {
        //TEST 1
        //Local test
    }

    @Override
    public void render(float delta) {

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
