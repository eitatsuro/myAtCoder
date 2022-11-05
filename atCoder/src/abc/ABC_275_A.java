package abc;

import java.util.Arrays;
import java.util.Scanner;

public class ABC_275_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			
			int[] h_original = new int[n];
			int[] h = new int[n];
			for (int i=0; i<n; i++) {
				h[i] = h_original[i] = sc.nextInt();
			}
			
			Arrays.sort(h);
			for (int i=0; i<n; i++) {
				if ( h_original[i] == h[n-1] ) {
					System.out.println(i+1);
				}
			}

			
		}
	}

}