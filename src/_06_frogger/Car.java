package _06_frogger;

import processing.core.PApplet;

public class Car extends PApplet  {
 int CarX;
 int CarY;
 int CarSize;
 int CarSpeed;
 
 public Car(int CarX, int CarY, int CarSize, int CarSpeed){
	 this.CarX =  CarX;
	 this.CarY =  CarY;
	 this.CarSize =  CarSize;
	 this.CarSpeed =  CarSpeed;
 }
 void display(){
   fill(0,255,0);
   rect(CarX , CarY,  CarSize, 50);
 }
 
}
