package rete.david.lab4.ex6;

public class Square extends Rectangle{
	public	Square() { super(); }
	public	Square(double side) { super(side, side); }
	public	Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}

	public double	getSide() { return (this.getWidth()); }
	public void		setSide(double side) {
		this.setWidth(side);
		this.setLength(side);
	}
	public void		setWidth(double side) {
		this.setWidth(side);
		this.setLength(side);
	}
	public void		setLength(double side) {
		this.setWidth(side);
		this.setLength(side);
	}

	public String	toString() {
		return ("a square with side=" + this.getWidth() + ", which is a subclass of " + super.toString());
	}
	}
