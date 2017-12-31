package module6;

import processing.core.PConstants;
import processing.core.PGraphics;
import processing.core.PImage;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.AbstractMarker;

/**
 * This marker displays an image at its location.
 */
public class MyImage extends CommonMarker {

	PImage img;
	
	public MyImage(Location location, PImage img) {
		super(location);
		this.img = img;
	}

	@Override
	public void drawMarker(PGraphics pg, float x, float y) {
		pg.pushStyle();
		pg.imageMode(PConstants.CORNER);
		// The image is drawn in object coordinates, i.e. the marker's origin (0,0) is at its geo-location.
		//pg.setSize(1, 1);
		pg.image(img, x - 11, y - 37);
		pg.popStyle();
	}

	@Override
	public boolean isInside(float checkX, float checkY, float x, float y) {
		return checkX > x && checkX < x + img.width && checkY > y && checkY < y + img.height;
	}

	
	@Override
	public void showTitle(PGraphics pg, float x, float y) {
		// TODO Auto-generated method stub
		
	}

}