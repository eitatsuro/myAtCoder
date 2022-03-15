package abc;

import java.util.Scanner;

public class ABC_242_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int x = sc.nextInt();

			if ( x <= a ) {
				System.out.println(1);
			} else if ( a < x && x <= b) {
				System.out.println( (double)c/(b-a) );
			} else {
				System.out.println(0);
			}
		}
	}

}
