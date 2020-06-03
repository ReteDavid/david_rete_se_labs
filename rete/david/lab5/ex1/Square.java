package rete.david.lab5.ex1;

public class Square extends Rectangle{
	public Square() {}
	public Square(double side) { super(side, side); }
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}

	public double	getSide() { return (this.width); }
	public void		setSide(double side) {
		this.width = side;
		this.length = side;
	}
	public void		setWidth(double side) {
		this.width = side;
		this.length = side;
	}
	public void		setLength(double side) {
		this.width = side;
		this.length = side;
	}
	
	public String	toString() {
		return ("you've got a " + this.color + " square that is " + (this.filled ? "filled" : "not filled"));
	}

}
