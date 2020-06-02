package rete.david.lab3.ex1;

public class Robot {
	int x;
	
	public Robot()
	{
		this.x = 1;
	}
	public void change(int k)
	{
		this.x += (k > 0 ? k : 0);
	}

	public String toString() { return ("position of robot is: " + this.x); }
}
