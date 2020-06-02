package rete.david.lab3.ex4;

public class MyPoint {
	private int x;
	private int y;

	MyPoint() {
		this.x = 0;
		this.y = 0;
	}
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.y = y; }
	public int getX() { return (this.x); }
	public int getY() { return (this.y); }
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return ("(" + this.x + ", " + this.y + ")");
	}

	public double distance(int x, int y) {
		double dx, dy;
		
		dx = (x - (double)this.x) * (x - (double)this.x); 
		dy = (y - (double)this.y) * (y - (double)this.y); 

		return (Math.sqrt(dx + dy));
	}

	public double distance(MyPoint a) {
		double dx, dy;
		
		dx = ((double)a.getX() - (double)this.x) * ((double)a.getX() - (double)this.x); 
		dy = ((double)a.getY() - (double)this.y) * ((double)a.getY() - (double)this.y); 

		return (Math.sqrt(dx + dy));
	}
}
