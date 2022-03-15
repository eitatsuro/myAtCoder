package abc;

import java.util.Scanner;


public class ABC_217_D {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int[] p = new int[n];
			
			for (int i=0; i<n; i++) {
				p[i] = sc.nextInt();
			}

			CharSequence[] q = new CharSequence[n];
			
			for (int i=0; i<n; i++) {
				q[ p[i] - 1 ] = String.valueOf(i+1);
			}
			
			// answer
			String ans = String.join(" ", q);
			System.out.println(ans);


		}
	}
}