package uber19319h;

public class OtherProducts {
	
	public OtherProducts() {}
	
	public int[] manipulate(int[] numbers) {
		
		int[] out = new int[numbers.length]; // array with products to be returned
		
		for(int i = 0; i < numbers.length; i++) {
			int product = 1;
			int[] x = numbers.clone();	// copy of original input array
			x[i] = 1;
			
			for(int y : x) {
				product = product * y;
			}
			
			out[i] = product;
		}
		
		return out;
	}

}
