package com.ravi.arrays;

public class EfficientTrappingRainWater {
	
	public static int getTrappedWater(int[] bars) {
		
		int result =0;
		int[] lMax = new int[bars.length];
		int[] rMax = new int[bars.length];
		
		// PreComputing lMax.
		lMax[0] = bars[0];
		for(int i=1; i<bars.length; i++) {
			lMax[i] = Math.max(lMax[i], lMax[i-1]);
		}
		// PreComputing rMax.
		rMax[bars.length-1] = bars[bars.length-1];
		for(int i=bars.length-2; i>=0; i--) {
			rMax[i] = Math.max(rMax[i], rMax[i+1]);
		}
		
		for(int i=1; i<bars.length-1; i++) {
			result = result + (Math.min(lMax[i], rMax[i])-bars[i]);
		}
		return result;
	}
	
	//Time Complexity ==> O(N)
	
	public static void main(String[] args) {
		int[] bars = {3,0,1,2,5};
		int trapedWater = getTrappedWater(bars);
		System.out.println("Total Trapped Water ::"+trapedWater);
	}

}
