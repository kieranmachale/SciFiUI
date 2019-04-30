package ie.tudublin;
import processing.core.PApplet;

public class Main extends PApplet
{	

	public static void main(String[] args)
	{
		PApplet.main("ie.tudublin.Main");	
	}

	//Making star objects
	Star[] stars = new Star[300];

	public void settings(){
		size(800,800);
	}

	public void setup(){
			for(int i = 0; i < stars.length; i++){
			stars[i] = new Star();
		}
	}

	public void draw(){
		background(0);
		for(int i = 0; i < stars.length; i++){
			stars[i] = new Star();
			stars[i].update();
			stars[i].show();
		}
	}
}
