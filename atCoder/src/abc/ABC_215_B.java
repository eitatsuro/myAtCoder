package abc;

import java.util.Scanner;


public class ABC_215_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			long n = sc.nextLong();

// åÎç∑Ç†ÇË
//			int ans = (int) Math.floor(Math.log(n)/Math.log(2));
//			System.out.println(ans);

			int ans = 0;
			long k2 = 1;
			while ( k2 <= n) {
				ans++;
				k2 = k2*2;
			}
			ans--;
			System.out.println(ans);
		}
	}
}