package uber19319h;

public class Main {

	public static void main(String[] args) {
		
		OtherProducts runner = new OtherProducts();
		int[] numArray= {1, 2, 3, 4, 5};
		
		int[] answer = runner.manipulate(numArray);
		
		System.out.println("the input:");
		for(int a: numArray) {
			System.out.print(a+ ", ");
		}
		
		
		System.out.println("");
		System.out.println("produces:");
		
		
		for(int a: answer) {
			System.out.print(a+ ", ");
		}

	}

}
