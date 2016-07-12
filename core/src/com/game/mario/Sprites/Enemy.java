package com.game.mario.Sprites;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.game.mario.screens.PlayScreen;

/**
 * Created by a.lam.tuan on 12. 7. 2016.
 */
public  abstract  class Enemy extends Sprite {
    protected World world;
    protected TiledMap map;
    public Body b2body;

    public Enemy(PlayScreen screen, float x, float y){
        this.world = screen.getWorld();
        this.map = screen.getMap();
        setPosition(x,y);
        defineEnemy();
    }
    protected abstract void defineEnemy();
}
