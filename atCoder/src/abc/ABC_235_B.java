package abc;

import java.util.Scanner;

public class ABC_235_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			int[] h = new int[n];
			for ( int i=0; i<n; i++) {
				h[i] = sc.nextInt();
			}
			
			int ans = h[0];
			for (int i=0; i<n-1; i++) {
				if(h[i] < h[i+1]) {
					ans = h[i+1];
					continue;
				} else {
					break;
				}
			}
			
			System.out.println(ans);
		}
	}

}