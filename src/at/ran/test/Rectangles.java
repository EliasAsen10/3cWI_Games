package at.ran.test;

import net.java.games.input.DirectAndRawInputEnvironmentPlugin;
import org.newdawn.slick.*;

public class Rectangles extends BasicGame {
    private float x;
    private float y;

    private float xcircle;

    private float ycircle;

    private float xoval;
    private float yoval;

    private float speed;

    private enum Direction {RIGHT, DOWN, LEFT, UP}

    private Direction direction = Direction.RIGHT;
    private enum DirectionCircle {UP, DOWN}
    private DirectionCircle directionCircle = DirectionCircle.DOWN;

    private enum DirectionOval {RIGHT,LEFT};
    private DirectionOval directionOval = DirectionOval.RIGHT;

    private float stop;

    public Rectangles(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.x = 100;
        this.y = 100;
        this.speed = 1f;
        this.stop = 0f;
        this.xcircle= 0;
        this.ycircle= 100;
        this.yoval=0;
        this.xoval=100;



    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        if (direction == Direction.RIGHT) {
            this.x += (float) delta / this.speed;
            if (this.x > 500) {
                this.direction = Direction.DOWN;
            }
        }

        if (direction == Direction.DOWN) {
            this.y += (float) delta / this.speed;
            if (this.y > 400) {
                this.direction = Direction.LEFT;
            }
        }

        if (direction == Direction.LEFT) {
            this.x -= (float) delta / this.speed;
            if (this.x < 100) {
                this.direction = Direction.UP;
            }
        }

        if (direction == Direction.UP) {
            this.y -= (float) delta / this.speed;
            if (this.y < 100) {
                this.direction = Direction.RIGHT;
            }


        }
        if (directionCircle == directionCircle.DOWN) {
            this.ycircle += (float) delta / this.speed;
            if (this.ycircle > 400) {
                this.directionCircle = DirectionCircle.UP;
            }
        }
        if (directionCircle == directionCircle.UP) {
            this.ycircle -= (float) delta / this.speed;
            if (this.ycircle < 100) {
                this.directionCircle = DirectionCircle.DOWN;
            }
        }

        if (directionOval == DirectionOval.RIGHT) {
            this.xoval += (float) delta / this.speed;
            if (this.xoval > 500) {
                this.directionOval = DirectionOval.LEFT;
            }
        }

        if (directionOval == DirectionOval.LEFT) {
            this.xoval -= (float) delta / this.speed;
            if (this.xoval < 100) {
                this.directionOval = DirectionOval.RIGHT;
            }
        }



    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x, this.y, 100, 100);
        graphics.drawString("Hello World", 100, 19);
        graphics.drawOval(this.xcircle, this.ycircle,75,75,100);
        graphics.drawOval(this.xoval, this.yoval,100,50,100);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangles("Rectangle"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
