
public class NestedForLoop {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j <= 10; j++) {
				System.out.println("Value of i:" + i + " and value of j:" + j);
			}
			System.out.println("-------------------------------");
		}
		
		for(int i = 0; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}

	}

}
