import java.util.*;
import java.lang.Math;

public class PI {
	coord c = null;
	private int count = 100000000;
	private int maxCount = 100000000;
	private int area = 0;
	
	public class coord {
		private float x = 0;
		private float y = 0;
		
		coord() {
			Random ran = new Random();
			x = ran.nextFloat();
			y = ran.nextFloat();
		}
		
		public float getX() {
			return x;
		}
		
		public float getY() {
			return y;
		}
	}
	
	public coord createCoord() {
		return new coord();
	}
	
    public static void main(String[] args) {
		new PI().establish();
		  
    }
	
	public void establish() {
		do {
			c = new coord();
			float dist = (float) Math.sqrt((c.getX()*c.getX()) + (c.getY() * c.getY()));
			//System.out.println(dist);
			if (dist <= 1) {
				area++;
			}
			count--;
			//System.out.println(c.getX() + ":" + c.getY());
		} while (count > 0);
		System.out.println("Counted = "+area*4);
		float f = (area*4);
		System.out.println("Pi = "+f/maxCount);
	}
	
}