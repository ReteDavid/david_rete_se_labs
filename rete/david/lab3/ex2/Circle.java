package rete.david.lab3.ex2;

public class Circle {
	private double radius = 1.0;
	private String color = "red";
	
	public Circle()
	{
		this.radius = radius;
		this.color = color;
	}
	public Circle(int r, String c)
	{
		this.radius = r;
		this.color = c;
	}
	public double getRadius()
	{
		return (this.radius);
	}
	public double getArea()
	{
		return (Math.PI * this.radius * this.radius);
	}
}
