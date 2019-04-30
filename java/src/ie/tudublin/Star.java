package ie.tudublin;
import processing.core.PApplet;

//Creating Star class
public class Star extends PApplet{
    
    float posx;
    float posy;
    float posz;

    //Star constructor
    public Star(){
        posx = random(0, width);
        posy = random(0, height);
        posz = width;
    }

    public void update(){
        posz = posz - 1;
    }

    public void show(){
        fill(255);
        noStroke();

        float divx = map(posx/posz,0,1,0,width);
        float divy = map(posy/posz,0,1,0,height);

        ellipse(divx, divy, 8,8);
    }

}