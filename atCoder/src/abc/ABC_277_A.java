package abc;

import java.util.Scanner;

public class ABC_277_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int X = sc.nextInt();

			int[] P = new int[N];
			for (int i=0; i<N; i++) {
				P[i]=sc.nextInt();
			}

			for (int i=0; i<N; i++ ) {
				if (P[i]== X) {
					System.out.println(i+1);
					System.exit(0);
				}
			}
		}
	}
}