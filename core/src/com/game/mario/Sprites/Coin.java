package com.game.mario.Sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTileSet;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.game.mario.Mario;
import com.game.mario.Scenes.Hub;
import com.game.mario.screens.PlayScreen;

/**
 * Created by a.lam.tuan on 23. 6. 2016.
 */
public class Coin extends InteractionTileObject {
    private static TiledMapTileSet tiledSet;
    private final int BLANK_COIN = 28;
    public Coin(PlayScreen screen, Rectangle bounds) {
        super(screen, bounds);
        tiledSet = map.getTileSets().getTileSet("tileset_gutter");
        fixture.setUserData(this);
        setCatagoryBit(Mario.COIN_BIT);
    }

    @Override
    public void onHeadHit() {
        Gdx.app.log("Coin","Coin: Collision");
        if(getCell().getTile().getId() == BLANK_COIN)
            Mario.manager.get("audio/sounds/bump.wav", Sound.class).play();
        else
            Mario.manager.get("audio/sounds/coin.wav", Sound.class).play();

        getCell().setTile(tiledSet.getTile(BLANK_COIN));
        Hub.addScore(100);
    }

}
