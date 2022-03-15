package abc;

import java.util.Scanner;


public class ABC_218_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();

			String[] s_raw = new String[n];
			String[] t_raw = new String[n];

			for (int i=0; i<n; i++) {
				s_raw[i] = sc.next();
			}

			for (int i=0; i<n; i++) {
				t_raw[i] = sc.next();
			}

			char[][] s = new char[n][n];
			char[][] t = new char[n][n];

			for (int i=0; i<n; i++) { 
				for (int j=0; j<n; j++) {
					s[i][j] = s_raw[i].charAt(j);
					t[i][j] = t_raw[i].charAt(j);
				}
			}

			// #‚Ì”‚ªˆÙ‚È‚éê‡‚Íí‚Éˆê’v‚µ‚È‚¢.
			if ( numOfIgeta(s_raw) != numOfIgeta(t_raw)) {
				System.out.println("No");
				System.exit(0);
			}


		}
	}

	private static int numOfIgeta( String[] str ) {
		int ans = 0;
		for (int i=0; i<str.length; i++) {
			ans += str[i].length() - str[i].replace("#", "").length();
		}
		return ans;
	}
}