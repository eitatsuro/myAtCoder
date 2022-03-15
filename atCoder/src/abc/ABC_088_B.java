package abc;

import java.util.Scanner;

public class ABC_088_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// カードの枚数
			int n = sc.nextInt();  // 1<=n<=100
			// カードに書かれた数
			int[] a = new int[n];  // 1<=a[i]<=100
			for (int i=0 ; i<n; i++) {
				a[i] = sc.nextInt();
			}

			// 得点
			int points_alice = 0;
			int points_bob = 0;

			while ( maxArray(a) > 0) {	

				// Alice
				int max = maxArray(a);
				for (int i=0; i<n; i++) {
					if ( a[i] == max) {
						a[i] = 0;
						points_alice+= max;
						break;
					}
				}

				// カードがすべて取得されたか評価
				if (maxArray(a) == 0) break;

				// Bob
				int max2 = maxArray(a);
				for (int i=0; i<n; i++) {
					if ( a[i] == max2) {
						a[i] = 0;
						points_bob+= max2;
						break;
					}
				}
			}
			System.out.println(points_alice - points_bob);
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
