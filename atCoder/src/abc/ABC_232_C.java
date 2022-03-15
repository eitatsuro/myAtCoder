package abc;

import java.util.Scanner;


public class ABC_232_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt(); // 1-8
			int m = sc.nextInt();
			int [] a = new int[m];
			int [] b = new int[m];
			int [] c = new int[m];
			int [] d = new int[m];

			for (int i=0; i<m; i++) {
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}

			for (int i=0; i<m; i++) {
				c[i] = sc.nextInt();
				d[i] = sc.nextInt();
			}
			
			
		}
	}
}