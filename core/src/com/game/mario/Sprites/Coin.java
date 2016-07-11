package com.game.mario.Sprites;

import com.badlogic.gdx.Gdx;
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

/**
 * Created by a.lam.tuan on 23. 6. 2016.
 */
public class Coin extends InteractionTileObject {
    private static TiledMapTileSet tiledSet;
    private final int BLANK_COIN = 28;
    public Coin(World world, TiledMap map, Rectangle bounds) {
        super(world, map, bounds);
        tiledSet = map.getTileSets().getTileSet("tileset_gutter");
        fixture.setUserData(this);
        setCatagoryBit(Mario.COIN_BIT);
    }

    @Override
    public void onHeadHit() {
        Gdx.app.log("Coin","Coin: Collision");
        getCell().setTile(tiledSet.getTile(BLANK_COIN));
        Hub.addScore(100);
    }

}
