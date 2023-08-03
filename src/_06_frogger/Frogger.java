package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 500;
    int FrogX = 400;
    int FrogY = 400;
    Car carL;
	Car carR;
	int carx = 700;
	int cary = 100;
	int carY;
	int Cary;

    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	 
    }

    @Override
    public void draw() {
intersects();
background(200,200,200);

display( 300, 5, 200, 0, 50);
display2( 100, 10, 50, 10, 200);
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
            else if(keyCode == DOWN && FrogY < 500 - 15)
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
        if( intersects() == true) {
        	FrogX = 400;
        	FrogY = 400;
        }
        if( intersects1() == true) {
        	FrogX = 400;
        	FrogY = 400;
        }
        
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
    void display(int y, int speed, int red, int green, int blue){
 
   	 fill(red,green,blue);
   	 rect(carx , y,  70, 50);
   	 
     if( carx > -70) {
		 carx = carx - speed;
		   
	  } else if( carx == -70) {
		  carx = 800;
		  }
	  carY = y;
		  
	  }
    void display2(int y, int speed, int red, int green, int blue ){
    	
      	 fill(red,green,blue);
      	 rect(cary , y,  70, 50);
      	 
        if( cary < 870) {
   		  cary = cary + speed;
   		   
   	  } else if( cary == 870) {
   		  cary = 0;
   		  }
   	  Cary = y;
   		  
   	  }
    boolean intersects() {
    	 if ((FrogY > carY && FrogY < carY+60) &&
    	                (FrogX > carx && FrogX < carx+80)) {
    	   return true;
    	  }
    	 else  {
    	  return false;
    	 }
    	 
    }
    boolean intersects1() {
   	 if ((FrogY > Cary && FrogY < Cary+60) &&
   	                (FrogX > cary && FrogX < cary+80)) {
   	   return true;
   	  }
   	 else  {
   	  return false;
   	 }
   	 
   }
}
 
	
		
	   
   


