package abc;

import java.util.Arrays;
import java.util.Scanner;

public class ABC_254_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] a = new int[N];
			for (int i=0; i<N; i++) {
				a[i] = sc.nextInt();
			}
			
			int[] a_parts = new int[N-K];
			int[] a_parts_sorted = new int[N-K];

			for (int i=0; i<N-K; i++) {
				a_parts[i] = a[i];
				a_parts_sorted[i] = a[i];
			}
			
			Arrays.sort(a_parts_sorted);
			
			boolean isSorted = true;
			for (int i=0; i<N-K; i++) {
				if (a_parts[i] != a_parts_sorted[i] ) isSorted = false;
			}
			
			if (isSorted) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			
			
			
			
			
		}
	}

}