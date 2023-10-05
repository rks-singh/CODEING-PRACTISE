package com.ravi.arrays;

public class BuyAndSellStock {

	public static int buyAndSellStock(int[] price) {
		int profit =0;
		for(int i=1; i<price.length; i++) {
			if(price[i]>price[i-1]) {
				profit += price[i]-price[i-1];
			}
		}
		return profit;
	}
	// Time Complexity ==> O(N)
	
	public static void main(String[] args) {
		
		int[] price = {1,5,3,8,12};
		int profit = buyAndSellStock(price);
		System.out.println("Maximum profit ==> "+profit);
	}
}
