package abc;

import java.util.Scanner;

public class ABC_279_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();

			S.toLowerCase();
			int ans = 0;
			for (int i=0; i < S.length(); i++) {
				if ( S.charAt(i) == 'v') {
					ans++;
				} else if ( S.charAt(i) == 'w') {
					ans+=2;
				} else {
					// do nothing
				}
			}
			System.out.println(ans);

		}
	}
}