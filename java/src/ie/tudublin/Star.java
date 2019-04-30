package ie.tudublin;

//Creating Star class
public class Star{
    
    //Star class fields
    private UI ui;
    private float posx;
    private float posy;
    private float posz;

    //Star constructor
    public Star(UI ui, float posx, float posy, float posz){
        this.ui = ui;
        this.posx = posx;
        this.posy = posy;
        this.posz = posz;
    }

    //Making the stars move
    public void update(){
        posz = posz - ui.speed;
        if(posz < 1){
            posz = ui.width;
            posx = ui.random(-ui.width, ui.width);
            posy = ui.random(-ui.width, ui.width);


        }
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