package module6;

import java.awt.*;

import processing.core.PApplet;
import processing.core.PImage;

import java.applet.*;  
  
  
public class imageLoading extends PApplet {  
  
//  Image picture;  
//  
//  public void init() {  
//    picture = getImage(getDocumentBase(),"img.jpg");  
//  }  
//    
//  public void paint(Graphics g) {  
//    g.drawImage(picture, 10,10, this);  
//  } 
	
	PImage img;

	public void setup() {
	  // Images must be in the "data" directory to load correctly
	  img = loadImage("img.jpg");
	}

	public void draw() {
	  image(img, 0,0);
	}
      
  }  