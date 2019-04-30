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
    Buttons WARP;
    Buttons STOP;
    Panel p;
    int speed = 1;
    boolean mouse;

    //Creating objects
    public void setup(){

        //Stars
        for(int i = 0; i < stars.length; i++){
                stars[i] = new Star(this, random(-width,width), random(-height,height), random(width));
        }

        //Buttons
        WARP = new Buttons(this,height/4,width/4,100,50,"WARP(W)",false);
        STOP = new Buttons(this,10,height/4,100,50,"STOP(S)",false);

        //Panel
        p = new Panel(this,20,20);
    }

    //Drawing UI
    public void draw(){
        background(0);
        translate(width/2, height/2);
        for(int i = 0; i < stars.length; i++){
            stars[i].update();
            stars[i].display();
        }

        WARP.render();
        STOP.render();
    }

    public void keyPressed(){
        switch(key){
            case 'w':
                speed = speed + 19;
                break;
            case 'a':
                speed = 2;
                break;
            case 'z':
                speed = 0;
                break;
            
        }
    }
}
    

    




