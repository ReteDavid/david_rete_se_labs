package rete.david.lab4.ex6;

public class Shape {
	private String color = "red";
	private boolean filled = true;

	public Shape() {}
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	public String	getColor() { return (this.color); }
	public void		setColor(String color) { this.color = color; }
	public boolean	isFilled() { return (this.filled); }
	public void		setFilled(boolean filled) { this.filled = filled; }
	public String	toString() {
		return ("A shape with color of " + this.color + "and " +
		(filled ? "filled" : "Not filled"));
	}
}
