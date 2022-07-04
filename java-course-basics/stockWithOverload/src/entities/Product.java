package entities;

public class Product {
	public String name;
	public double price;
	public int qty;
	
	public Product() {}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		qty = 0;
	}
	
	public Product(String name, double price, int qty) {
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	
	public double totalValueInStock() {
		return price * qty;
	}
	
	public void addProducts(int quantity) {
		this.qty += quantity; 
	}
	
	public void removeProducts(int quantity) {
		this.qty -= quantity; 
	}
	
	public String toString() {
		return name +", R$"+ String.format("%.2f", price) +", Qtd: "+ qty +", TOTAL: R$"+ String.format("%.2f", totalValueInStock());
	}
}