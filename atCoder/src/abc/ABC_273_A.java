package abc;

import java.util.Scanner;

public class ABC_273_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			System.out.println(f_kaijyo(n));
		}
	}
	
	private static int f_kaijyo(int n) {
		if( n == 0) return 1;
		return n*f_kaijyo(n-1);
	}
}