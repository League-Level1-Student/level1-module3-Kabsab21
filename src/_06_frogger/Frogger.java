package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int FrogX = 400;
    int FrogY = 500;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	

    }

    @Override
    public void draw() {
	
background(200,200,200);
fill(10,150,100);
ellipse(FrogX,FrogY,30,30);

    }
    public void keyPressed(){
        if(key == CODED){
            if(keyCode == UP && FrogY > 0 + 15)
            {
                //Frog Y position goes up
            	FrogY = FrogY - 10;
            }
            else if(keyCode == DOWN && FrogY < 600 - 15)
            {
                //Frog Y position goes down 
            	FrogY = FrogY + 10;
            }
            else if(keyCode == RIGHT && FrogX < 800 -15)
            {
            	FrogX = FrogX + 10;
                //Frog X position goes right
            }
            else if(keyCode == LEFT && FrogX > 0 + 15){
            	FrogX = FrogX - 10;
                //Frog X position goes left
            }
        }
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
   
   
}
