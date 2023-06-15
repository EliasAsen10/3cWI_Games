package at.ase.test;

import net.java.games.input.DirectAndRawInputEnvironmentPlugin;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


import static at.ase.test.Direction.LEFT;
import static at.ase.test.Direction.RIGHT;

public class ObjectsGame extends BasicGame {

    private List<Actor>actors;


    public ObjectsGame(String title) {
        super(title);
    }


    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();

        Random random = new Random();
        //Rectangle rectangle;
        for (int i = 0; i <10   ; i++) {
            Rectangle rectangle = new Rectangle(LEFT);
            this.actors.add(rectangle);
            
        }


        for (int i = 0; i < 10; i++) {
            Circle circle = new Circle();
            this.actors.add(circle);
            
        }

        for (int i = 0; i < 10; i++) {
            Ellipse ellipse = new Ellipse();
            this.actors.add(ellipse);

        }



    }

  


    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
    for (Actor actor: this.actors) {
        actor.update(delta);
    }
    }


    @Override
    public void render (GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor: this.actors) {
            actor.render(graphics);
        }
    }

    public static void main (String[]argv){
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsGame("ff"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}