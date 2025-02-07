package rete.david.lab5.ex1;

public class Circle extends Shape{
	protected double radius;
	
	public Circle()
	{
	}
	public Circle(double radius)
	{
		this.radius = radius;
	}
	public Circle(double radius, String color, boolean filled)
	{
		super(color, filled);
		this.radius = radius;
	}
	public double getRadius() { return(this.radius);}
	public void setRadius() { this.radius = radius;}
	
	public double getArea() { return (Math.PI * this.radius * this.radius);}
	public double getPerimeter() { return (2 * Math.PI * this.radius);}
	public String toString() { return ("you've got a " + this.color + " cricle that is " + (filled ? "filled" : "not filled"));}
}
