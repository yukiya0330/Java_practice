import java.util.Scanner;

public class Q_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("整数をいれてください");
		int n = sc.nextInt();
		Anser(n);
	}

	public static void Anser(int n) {
		int x = n;
		for(int i = 0; i < 2; i++) {
			x *= n;
		}
		System.out.println(n + "を３乗すると" + x + "です。");
	}


}
