package ie.tudublin;

import processing.core.PApplet;

public class Panel{
    private UI ui;
    private float x;
    private float y;

    public Panel(UI ui, float x, float y){
        this.ui = ui;
        this.x = x;
        this.y = y;

    }

    public void display(){
        ui.fill(255,100);
        ui.noStroke();
        ui.rect(x,0,y,ui.width);
    }
}