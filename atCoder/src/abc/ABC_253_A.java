package abc;

import java.util.Scanner;

public class ABC_253_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if ( (a >= b && b >= c) || (c >= b && b >= a ) ) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}