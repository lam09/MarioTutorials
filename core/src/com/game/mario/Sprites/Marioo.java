package com.game.mario.Sprites;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.World;
import com.game.mario.Mario;

/**
 * Created by a.lam.tuan on 23. 6. 2016.
 */
public class Marioo extends Sprite {
    public World world;
    public Body b2body;

    public Marioo(World world){
        this.world = world;
        defineMario();
    }

    private void defineMario() {
        BodyDef bdef = new BodyDef();
        bdef.position.set(32/ Mario.PPM,32/Mario.PPM);
        bdef.type = BodyDef.BodyType.DynamicBody;
        b2body= world.createBody(bdef);

        FixtureDef fdef =  new FixtureDef();
        CircleShape shape =  new CircleShape();
        shape.setRadius(5/Mario.PPM);

        fdef.shape = shape;
        b2body.createFixture(fdef);


    }

}
