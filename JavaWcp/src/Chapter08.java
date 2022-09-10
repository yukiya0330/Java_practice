public class Chapter08 {
	public static void main(String[] args) {
		int num = 1;
		while (num < 5) {
			System.out.println(num * num);
			num++;
		}
		int array[] = {1, 2, 4, 8};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		for (int i: array) {
			if (i % 2 == 0) {
				continue;
			} else {
				System.out.println(i);
			}
		}
	}
}
