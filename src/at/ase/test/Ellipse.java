package at.ase.test;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Ellipse implements Actor{

    private float x;
    private float y;
    private float speed;
    private enum Direction {RIGHT, DOWN , LEFT, UP}

    public Ellipse() {
        Random random= new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(800);
        this.speed = random.nextInt(40)+10;
    }
    @Override
    public void render(Graphics graphics) {
        graphics.drawRect(this.x,this.y,50,10);
    }



    @Override
    public void update(int delta) {
        this.x +=(float)delta/this.speed;
        this.y +=(float)delta/this.speed;
        if(this.y>600){
            this.y=0;
        }

    }
}
