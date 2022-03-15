package abc;

import java.util.Scanner;


public class ABC_227_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int k = sc.nextInt();
			int a = sc.nextInt();

			// a+k-1枚のカードをN人に配り最後カードをもらう人が分かればよい
			
			if ( n == 1 ) {
				System.out.println(1);
				System.exit(0);
			}

			if ( (a+k-1)%n == 0) {
				System.out.println(n);
			} else {
				System.out.println( (a+k-1)%n );
			}

		}
	}
}