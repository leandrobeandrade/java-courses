package entities;

public class Product {
	private String name;
	private double price;
	private int qty = 0;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return this.qty;
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