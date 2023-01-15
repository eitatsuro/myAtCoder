package abc;

import java.util.Scanner;

public class ABC_089_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			System.out.println(N/3);
		}

	}

	public static int maxArray(int[] array) {
		int max = array[0];
		for (int temp : array) {
			if (temp > max) {
				max = temp;
			}
		}
		return max;
	}
}
