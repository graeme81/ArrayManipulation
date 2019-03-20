package uber19319h;

public class Main {

	public static void main(String[] args) {
		
		OtherProducts runner = new OtherProducts();
		int[] numArray= {1, 2, 3, 4, 5};
		
		int[] answer = runner.manipulate(numArray);
		
		for(int a: answer) {
			System.out.println(a);
		}

	}

}
