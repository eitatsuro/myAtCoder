package abc;

import java.util.Scanner;

public class ABC_089_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			for ( int i=0; i<N; i++) {
				String S = sc.next();
				switch ( S.charAt(0) ) {
				case 'P':
					continue;
				case 'G':
					continue;
				case 'W':
					continue;
				case 'Y':
					System.out.println("Four");
					System.exit(0);
					break;
				default:
					break;
				}
			}
			System.out.println("Three");
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
