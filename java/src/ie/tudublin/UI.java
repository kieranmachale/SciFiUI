package ie.tudublin;
import processing.core.PApplet;

public class UI extends PApplet
{
    //Setting screen size
    public void settings()
    {
        size(800, 800);
    }
    Star[] stars = new Star[800];

    RadarM radar;
    Circle mc;

    Buttons WARP;
    Buttons STOP;
    Buttons SLOW;

    Panel p;

    int speed = 1;
    boolean mouse;

    //Creating objects
    public void setup(){

        //Stars
        for(int i = 0; i < stars.length; i++){
                stars[i] = new Star(this, random(-width,width), random(-height,height), random(width));
        }

        //Panel
        p = new Panel(this,-400,height/5,width,height/2);

        //Buttons
        WARP = new Buttons(this,height/4,width/4,85,50,"WARP(W)",false);
        STOP = new Buttons(this,10,height/4,85,50,"STOP(S)",false);
        SLOW = new Buttons(this,-200, height/4,85,50,"SLOW(Z)",false);

        //Radar
        mc = new Circle(this, width / 2, height * .75f, 50);
        radar = new RadarM(this, 1, width / 2, height / 2, 100);

    }

    //Drawing UI
    public void draw(){
        background(0);
        translate(width/2, height/2);
        for(int i = 0; i < stars.length; i++){
            stars[i].update();
            stars[i].display();
        }

        p.render();

        WARP.render();
        STOP.render();
        SLOW.render();

        mc.update();
        mc.render();

        radar.update();
        radar.render();
    }

    //Using keyPressed to change ship speed
    public void keyPressed(){
        switch(key){
            case 'w':
                speed = speed + 19;
                break;
            case 'z':
                speed = 2;
                break;
            case 's':
                speed = 0;
                break;
            
        }
    }
}
    

    




