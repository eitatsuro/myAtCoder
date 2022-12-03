package abc;

import java.util.Scanner;

public class ABC_280_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int H = sc.nextInt();
			int W = sc.nextInt();

			int ans = 0;
			for(int i=0; i<H; i++) {
				String s = sc.next();
				for ( int j=0; j<W; j++) {
					if ( s.charAt(j) == '#' ) {
						ans++;
					}
				}
			}

			System.out.println(ans);
		}
	}
}