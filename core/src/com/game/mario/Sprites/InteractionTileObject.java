package com.game.mario.Sprites;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTile;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;

/**
 * Created by a.lam.tuan on 23. 6. 2016.
 */
public abstract class InteractionTileObject {
    private World world;
    private TiledMap map;
    private TiledMapTile tile;
    private Rectangle bounds;
    private Body body;

    public InteractionTileObject(World world, TiledMap map, Rectangle bounds)
    {
        this.world=world;
        this.map=map;
        this.bounds=bounds;
    }
}
