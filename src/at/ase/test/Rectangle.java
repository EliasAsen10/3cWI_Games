package at.ase.test;

import org.newdawn.slick.Graphics;

import java.util.Random;


public class Rectangle implements Actor{
    private float x;
    private float y;
    private float speed;

    private Direction direction;

    public Rectangle(Direction direction) {
        Random random= new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(800);
        this.speed = random.nextInt(40)+10;
        this.direction = direction;
    }

    public void render(Graphics graphics)  {
        graphics.drawRect(this.x,this.y,50,50);
    }
    public void update(int delta){


        if(this.direction == Direction.LEFT)
        {
            this.x -=(float)delta/this.speed;
        }

        if(this.direction == Direction.RIGHT)
        {

        }

        if(this.x>800 || this.x<0){
            Random random= new Random();
            this.x = random.nextInt(800);

        }


    }
}
