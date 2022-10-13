
public class P_6_4 {

	public static void main(String[] args) {
		Triangle(6);
		System.out.println();
	}


	static void Triangle(int i) {
		for(int a = 0; a < i; a++) {
			for(int b = 1; b <= a; b++) {
				System.out.print("$");
			}
			System.out.println();
		}
	}


}
