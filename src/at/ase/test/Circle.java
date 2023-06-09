package at.ase.test;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Circle implements Actor{

    private float x,y;
    private float  speed;
    private float diameter;

    public Circle(){
        Random random= new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(800);
        this.speed = random.nextInt(40)+10;
        this.diameter = random.nextInt(20)+10;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x,this.y,this.speed,this.diameter);

    }

    @Override
    public void update(int delta) {
        this.y +=(float)delta/this.speed;
           this.diameter+=0.1;


    }
}
