package ie.tudublin;
import processing.core.PApplet;

public class Panel{
    private UI ui;
    private float x;
    private float y;
    private float width;
    private float height;

    public Panel(UI ui, float x, float y, float width, float height){
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

    }

    public void render(){
        ui.fill(102,120,120);
        ui.stroke(120,120,120);
        ui.rect(x, y, width, height);
    }
}