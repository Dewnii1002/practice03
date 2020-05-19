package prob02;

public class Goods {
	
	private String product;
	private int price;
	private int stock;
	
	
	/*
	
	public Goods() {
		
	}
	
	public Goods(String product, int price, int stock) {
		this.product = product;
		this.price = price;
		this.stock = stock;		
	}
	
	*/
	
	public void setGoods(String product, int price, int stock) {
		this.product = product;
		this.price = price;
		this.stock = stock;
	}
	
	public void print(Goods[] a) {
		for(int i = 0; i<a.length; i++) {
		System.out.println(a[i]);
		}
		
	}
}
