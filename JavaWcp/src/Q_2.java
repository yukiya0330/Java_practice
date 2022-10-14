import java.util.Scanner;

public class Q_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("お名前を入力してください");
		String name = sc.nextLine();
		System.out.println("年齢をいれてください");
		int age = sc.nextInt();
		GreetingMessage(name, age);
	}

	public static void GreetingMessage(String name, int age) {
		System.out.println(name + "(" + age + ")さん、こんにちは!");
	}



}
