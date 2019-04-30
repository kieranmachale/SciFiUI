package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Button b;
    MovingCircle mc;

    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = false;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    
    Star [] stars = new Star[300];
    int i;

    public void settings()
    {
        size(800, 800);
        
    }

    public void setup()
    {
        b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this, width / 2, height * .75f, 50);
        radar = new Radar(this, 1, width / 2, height / 2, 100);

        for(i = 0; i < stars.length; i++){
            stars[i] = new Star();
        }
    }

    Radar radar;

    public void draw()
    {
        background(0);
        
        for(i = 0; i < stars.length; i++){
            stars[i].update();
            stars[i].display();
        }

        b.render();

        mc.update();
        mc.render();

        radar.update();
        radar.render();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

