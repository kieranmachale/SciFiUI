package ie.tudublin;

//Creating Star class
public class Star{
    
    //Star class fields
    private UI ui;
    private float posx;
    private float posy;
    private float posz;
    private int speed = 1;

    //Star constructor
    public Star(UI ui, float posx, float posy, float posz){
        this.ui = ui;
        this.posx = ui.random(0, ui.width);
        this.posy = ui.random(0, ui.height);
        this.posz = ui.width;
    }

    //Making the stars move
    public void update(){
        posz = posz - speed;
    }

    //Creating star shape
    public void display(){
        ui.fill(255);
        ui.noStroke();

        float divx = ui.map(posx / posz,0,1,0,ui.width);
        float divy = ui.map(posy / posz,0,1,0,ui.height);

        ui.ellipse(divx, divy, 8,8);
    }

}