package abc;

import java.util.Scanner;


public class ABC_228_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int s = sc.nextInt();
			int t = sc.nextInt();
			int x = sc.nextInt();
			
			if ( s > t) t += 24;
			if ( s > x) x += 24;
			
			if ( x >= s && x < t ) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}