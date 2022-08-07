        import java.util.*;
	class MyPoint{
		private int x = 0;
		private int y = 0;
		
		public MyPoint() {
			
		}
		public MyPoint(int x, int y) {
			this.x = x;
			this.y = y;
			
			
		}
		public int getX() {
			return x;
			
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
			
		}
		public void setY(int y) {
			this.y = y;
		}
		public void setXY(int x, int y) {
			this.x = x;
			this.y = y;
			
		}
		public String toString() {
			return "Value of x: "+x+" Value of y: "+y;
		}
		public double distance(int x, int y) {
	
			int xd = this.x - x;
			int yd = this.y - y;
			double d = Math.sqrt(xd*xd + yd*yd);
			return d;
		}
		public double distance(MyPoint another) {
	
			int xd = this.x - another.x;
			int yd = this.y - another.y;
			double d = Math.sqrt(xd*xd + yd*yd);
			return d;
		}
	
	}
	public class TEST01 {
	
		public static void main(String[] args) {
	
			MyPoint obj1 = new MyPoint(3,0);
			MyPoint obj2 = new MyPoint(0,1);
			System.out.println();
			System.out.println("Distance of MyPoint other: "+obj1.distance(obj2));
			System.out.println();
			System.out.println("Distance: "+obj1.distance(5, 2));
	
		}
	
	}
