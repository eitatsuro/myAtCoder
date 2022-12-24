package abc;

import java.util.Scanner;

public class ABC_282_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			long ans = 1;
			for(int i=1; i<=B; i++) {
				ans *= A;
			}
			
			System.out.println(ans);

		}
	}
}
