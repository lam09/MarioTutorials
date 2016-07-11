package com.game.mario.Sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.World;
import com.game.mario.Mario;
import com.game.mario.Scenes.Hub;

/**
 * Created by a.lam.tuan on 23. 6. 2016.
 */
public class Brick extends InteractionTileObject{
    public Brick(World world, TiledMap map, Rectangle bounds)
    {
        super(world,map,bounds);
        fixture.setUserData(this);
        setCatagoryBit(Mario.BRICK_BIT);
    }

    @Override
    public void onHeadHit() {
        Gdx.app.log("Brick","Brick: Collision");
        setCatagoryBit(Mario.DESTROYED_BIT);
        getCell().setTile(null);
        Hub.addScore(200);
    }
}
