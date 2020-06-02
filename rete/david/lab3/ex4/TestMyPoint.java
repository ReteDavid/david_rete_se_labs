package rete.david.lab3.ex4;

public class TestMyPoint {

	public static void main(String[] args) {
		MyPoint a = new MyPoint();
		MyPoint b = new MyPoint(0, 1);

		System.out.println("distance from a to b: " + a.distance(b));

	}

}
