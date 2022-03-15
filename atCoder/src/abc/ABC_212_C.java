package abc;

import java.util.Arrays;
import java.util.Scanner;



public class ABC_212_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int m = sc.nextInt();

			int[] a = new int[n];
			int[] b = new int[m];

			for (int i = 0; i<n; i++) {
				a[i] = sc.nextInt();
			}

			for (int i = 0; i<m; i++) {
				b[i] = sc.nextInt();
			}

			// ソート（昇順）
			Arrays.sort(a);
			Arrays.sort(b);

			int i = 0;
			int j = 0;
			int min = 1000000000 -1;
			while ( i<n && j<m) {
				min = Math.min(Math.abs(a[i] - b[j]), min);
				if (a[i] < b[j]) {
					i++;
				} else {
					j++;
				}
			}
			
			System.out.println(min);


		}
	}
}