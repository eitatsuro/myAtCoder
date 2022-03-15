package abc;

import java.util.Scanner;

public class ABC_241_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt(); // n本の麺
			int m = sc.nextInt(); // 食事m回

			int [] a = new int[n]; // 持っている麺の長さ
			int [] b = new int[m]; // 食事m回目に食べる麺の長さ

			for (int i=0; i<n; i++) {
				a[i] = sc.nextInt();
			}

			for (int i=0; i<m; i++) {
				b[i] = sc.nextInt();
			}

			for (int i=0; i<m; i++) {
				for ( int j=0; j<n; j++) {
					if ( b[i] == a[j]) {
						a[j] = -1;
						break;
					}
				}
			}
			
			int count=0;
			for (int i=0; i<n; i++) {
				if (a[i] == -1) {
					count++;
				}
			}
			
			if (count == m) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}
	}

}