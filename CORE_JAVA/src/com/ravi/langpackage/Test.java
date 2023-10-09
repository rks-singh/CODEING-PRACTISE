package com.ravi.langpackage;

enum Beer{
	KF(200), RB(300), BO(250), RF(500);
	int price;
	Beer(int price) {
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}
}
public class Test {

	public static void main(String[] args) {
		
		Beer[] beers = Beer.values();
		
		for(Beer product : beers) {
			System.out.println(product.ordinal()+" "+product+" "+product.getPrice());
		}
	}

}
