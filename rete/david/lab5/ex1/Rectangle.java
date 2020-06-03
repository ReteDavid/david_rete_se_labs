package rete.david.lab5.ex1;

public class Rectangle extends Shape {
	protected double width;
	protected double length;
	
	public Rectangle()
	{
		
	}
	public Rectangle(double width, double length, String color, boolean filled)
	{
		this.width = width;
		this.length = length;
		this.color = color;
		this.filled = filled;
	}
	public double getWidth() { return(this.width);}
	public void setWidth(double width) { this.width = width;}
	public double getLength() { return (this.length);}
	public void setLength(double length) { this.length = length;}
	public double getArea() { return (this.width * this.length);}
	public double getPerimeter() { return ((this.width + this.length) * 2);}
	public String toString() { return ("you've got a " + this.color + " recctangle that is " + (this.filled ? "filled" : "not filled"));}
	
}
