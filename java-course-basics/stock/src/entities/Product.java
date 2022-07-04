package entities;

public class Product {
	public String name;
	public double price;
	public int qty;
	
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