package rete.david.lab4.ex5;
import rete.david.lab4.ex1.Circle;
public class Cylinder extends Circle {
	private double height = 1.0;
	
	public Cylinder()
	{
		super();
	}
	public Cylinder(double radius)
	{
		super(radius);
	}
	public Cylinder(double radius, double height)
	{
		super(radius);
		this.height = height;
	}
	public double getHeight() { return (this.height);}
	public double getVolume() { return (Math.PI * this.getRadius() * this.getRadius() * this.height);}
	
	public double getArea() { return (2 * Math.PI * this.getRadius() * (this.height + this.getRadius()));
	}
}
