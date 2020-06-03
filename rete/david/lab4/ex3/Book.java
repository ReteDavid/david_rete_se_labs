package rete.david.lab4.ex3;
import rete.david.lab4.ex2.Author;

public class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	public Book(String name, Author author, double price)
	{
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public Book(String name, Author author, double price, int qtyInStock)
	{
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	public String getName() { return this.name;}
	public Author getAuthor() { return this.author;}
	public double getPrice() { return this.price;}
	public int getQtyInStock() { return this.getQtyInStock();}
	public void setPrice(double price) { this.price = price;}
	public void setQtyInStock(int qtyInStock) { this.qtyInStock = qtyInStock;}
	public String toString() { return (this.name + " by " + author.toString());}
}
