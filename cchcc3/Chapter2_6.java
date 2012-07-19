package Chapter2_6;

import java.util.Arrays;

public class Chapter2_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] seeds = {1,5,9};
		String[]colors = {"red", "block", "white"};
		String seedsStr=Arrays.toString(seeds);
		System.out.println(seedsStr);
		System.out.println(Arrays.toString(colors));
	
		int[] scr = {1,2,3};
		int[] dest = Arrays.copyOf(scr, 3);
		System.out.println(Arrays.toString(scr));
		System.out.println(Arrays.toString(dest));
		
		int[] shorter =Arrays.copyOf(scr,2);
		int[] longer = Arrays.copyOf(scr,4);
		System.out.println(Arrays.toString (shorter));
		System.out.println(Arrays.toString(longer));
        
		double[] seeds2 = {1,2};
		double[] doubler = Arrays.copyOf(seeds2, 5);
		System.out.println(Arrays.toString(doubler));
        
		int[] scr2 = {1,2,3,4,5,6,7,8,9,0};
		int[] copied = Arrays.copyOfRange(scr2, 3, 6);
		System.out.println(Arrays.toString(copied));
		
		int[] values = {3,6,1,9,10,5};
		//Arrays.sort(values);
		Arrays.sort(values,1,5);
		System.out.println(Arrays.toString(values));
		
		
	}

}
