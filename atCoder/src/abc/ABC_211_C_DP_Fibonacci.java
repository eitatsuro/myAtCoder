package abc;

import java.util.Scanner;


public class ABC_211_C_DP_Fibonacci {
	static final int prime_number = 1000000007;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt(); 
			System.out.println(fib(n));

		}
	}

	private static int fib( int n ) {
		switch (n) {
		case 0: return 0;
		case 1: return 1;
		default:
			return fib(n-1) + fib(n-2);
		}
	}
}