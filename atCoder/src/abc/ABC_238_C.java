package abc;

import java.util.Scanner;

public class ABC_238_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			
			long n = sc.nextLong();

			long ans=0;
			for (int i=1; i<=n; i++) {
				ans += f(i);
			}
			System.out.println(ans);
			

		}
	}
	
	private static long f(long n) {
		int n_digits = (int) Math.floor( Math.log10(n) ) +1;
		int smallest_number_of_n_digits = (int) Math.pow(10, n_digits-1);
		return n - smallest_number_of_n_digits+1;
	}

}