package abc;

import java.util.Scanner;


public class ARC_127_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double n = sc.nextDouble();
			
			double ans = 0;
			for ( int i = 1; i <= n; ) {
				String str = String.valueOf(i);
				if (str.charAt(0) != '1') {
					i = (int)Math.pow(10, str.length());
				} else {
				ans += f(i);
				i++;
				}
			}

			System.out.println(String.format("%.0f", ans));

		}
	}
	
	private static int f( double n ) {
		int ans = 0;
		String str = String.valueOf(n);
		for (int i = 0; i < str.length(); i++ ) {
			if (str.charAt(i) != '1') {
				break;
			} else {
				ans++;
			}
		}
		return ans;
	}
}