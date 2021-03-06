package com.game.mario.Sprites;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.EdgeShape;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.utils.Array;
import com.game.mario.Mario;
import com.game.mario.screens.PlayScreen;

/**
 * Created by a.lam.tuan on 12. 7. 2016.
 */
public class Goomba extends Enemy{
    private float stateTime;
    private Animation walkAnimation;
    private Array<TextureRegion> frames;

    public Goomba(PlayScreen screen, float x, float y) {
        super(screen, x, y);
        frames = new Array<TextureRegion>();
        for (int i = 0;i<2 ;i++){
            frames.add(new TextureRegion(screen.getAtlas().findRegion("goomba"),i*16,0,16,16));
        }
        walkAnimation = new Animation(0.4f,frames);
        stateTime = 0;
        setBounds(getX(),getY(),16/Mario.PPM,16/Mario.PPM);
    }

    public void update(float dt){
        stateTime += dt;
        setPosition(b2body.getPosition().x - getWidth()/2, b2body.getPosition().y - getHeight()/2);
        setRegion(walkAnimation.getKeyFrame(stateTime,true));
    }

    @Override
    protected void defineEnemy() {
        BodyDef bdef = new BodyDef();
        bdef.position.set(32/ Mario.PPM,32/Mario.PPM);
        bdef.type = BodyDef.BodyType.DynamicBody;
        b2body= world.createBody(bdef);

        FixtureDef fdef =  new FixtureDef();
        CircleShape shape =  new CircleShape();
        shape.setRadius(6/Mario.PPM);
        fdef.filter.categoryBits = Mario.ENEMY_BIT;
        fdef.filter.maskBits = Mario.GROUND_BIT |Mario.COIN_BIT| Mario.BRICK_BIT|
        Mario.ENEMY_BIT|Mario.OBJECT_BIT|Mario.MARIO_BIT;

        fdef.shape = shape;
        b2body.createFixture(fdef);



    }

}
