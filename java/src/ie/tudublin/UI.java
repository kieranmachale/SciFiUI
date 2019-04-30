package ie.tudublin;
import processing.core.PApplet;

public class UI extends PApplet
{
    //Setting screen size
    public void settings()
    {
        size(800, 800);
    }

    //Declaring objects
    Star[] stars = new Star[400];

    //Creating objects
    public void setup(){
        
        for(int i = 0; i < stars.length; i++){
                stars[i] = new Star(this, random(-width,width), random(-height,height), random(width));
        }
    }

    //Drawing UI
    public void draw(){
        background(0);
        translate(width/2, height/2);
        for(int i = 0; i < stars.length; i++){
            stars[i].update();
            stars[i].display();
        }

    }


}

