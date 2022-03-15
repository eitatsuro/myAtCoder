package abc;

import java.util.Scanner;

public class ABC_243_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			int [] x = new int[n];
			int [] y = new int[n];
			for (int i = 0; i<n; i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}

			String s = sc.next();
			
			for ( int i = 0; i<n; i++) {
				for ( int j = 0; j<n; j++) {
					if ( i!=j && y[i] == y[j] && s.charAt(i) != s.charAt(j) ) {
						System.out.println("Yes");
						System.exit(0);
					}
				}
			}
			
			System.out.println("No");

		}
	}

}
