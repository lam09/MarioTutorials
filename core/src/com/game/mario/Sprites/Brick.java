package com.game.mario.Sprites;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.World;

/**
 * Created by a.lam.tuan on 23. 6. 2016.
 */
public class Brick extends InteractionTileObject{
    public Brick(World world, TiledMap map, Rectangle bounds)
    {
        super(world,map,bounds);
    }
}
