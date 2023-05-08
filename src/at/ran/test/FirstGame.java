package at.ran.test;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AlphaMapTest;

public class FirstGame extends BasicGame {

    public FirstGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawString("Hello",100,100);
    }
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new FirstGame("Rectangle"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
