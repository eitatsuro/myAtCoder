package abc;

import java.util.Scanner;

public class ABC_236_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int[] a = new int[4*n];
			int[] ans = new int[n+1];
			
			// a[0]‚ÍŽg‚í‚È‚¢
			for (int i=1; i<=4*n-1; i++) {
				a[i] = sc.nextInt();
				ans[a[i]]++;
			}
			
			for (int i=1; i<=n; i++) {
				if ( ans[i] == 3) System.out.println(i);
			}
			

		}
	}

}