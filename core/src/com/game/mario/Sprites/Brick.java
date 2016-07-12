package com.game.mario.Sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.World;
import com.game.mario.Mario;
import com.game.mario.Scenes.Hub;
import com.game.mario.screens.PlayScreen;

/**
 * Created by a.lam.tuan on 23. 6. 2016.
 */
public class Brick extends InteractionTileObject{
    public Brick(PlayScreen screen, Rectangle bounds)
    {
        super(screen,bounds);
        fixture.setUserData(this);
        setCatagoryBit(Mario.BRICK_BIT);
    }

    @Override
    public void onHeadHit() {
        Gdx.app.log("Brick","Brick: Collision");
        setCatagoryBit(Mario.DESTROYED_BIT);
        getCell().setTile(null);
        Hub.addScore(200);
        Mario.manager.get("audio/sounds/breakblock.wav", Sound.class).play();
    }
}
