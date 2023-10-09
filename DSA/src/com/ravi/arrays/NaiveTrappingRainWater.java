package com.ravi.arrays;

public class NaiveTrappingRainWater {

	public static int getTrappedWater(int[] bars) {
		
		int result =0;
		for(int i=1; i<bars.length-1; i++) {
			
			int lMax = bars[i];
			for(int j=0; j<i; j++) {
				lMax = Math.max(lMax, bars[j]);
			}
			
			int rMax = bars[i];
			for(int j=i+1; j<bars.length; j++) {
				rMax = Math.max(rMax, bars[j]);
			}
			
			result = result + (Math.min(lMax, rMax)-bars[i]);
		}
		return result;
	}
	// Time Complexity ==> O(N^2)
	
	public static void main(String[] args) {
		
		int[] bars = {3,0,1,2,5};
		int trapedWater = getTrappedWater(bars);
		System.out.println("Total Trapped Water ::"+trapedWater);
	}
}
