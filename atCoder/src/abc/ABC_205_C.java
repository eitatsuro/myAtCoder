package abc;

import java.util.Scanner;

public class ABC_205_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// �����̓���
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			

			if ( c==0 ) {
				System.out.println("=");
			} else if ( c%2 == 0) {
				a = Math.abs(a);
				b = Math.abs(b);
				if ( a < b ) {
					System.out.println("<");
				} else if (a == b) {
					System.out.println("=");
				} else {
					System.out.println(">");
				}
			} else if (c%2 == 1) {
				if ( a < 0 && b < 0) {
					// a < 0 && b < 0 �̏ꍇ
					if ( a < b ) {
						System.out.println("<");
					} else if (a == b) {
						System.out.println("=");
					} else {
						System.out.println(">");
					}				
				} else if ( a >= 0 && b >= 0 ) {
					// a > 0 && b > 0 �̏ꍇ
					if ( a < b ) {
						System.out.println("<");
					} else if (a == b) {
						System.out.println("=");
					} else {
						System.out.println(">");
					}
				} else if ( a >= 0 && b < 0) {
					// a > 0 && b < 0 �̏ꍇ
					System.out.println(">");
				} else if ( a < 0 && b >= 0) {
					// a < 0 && b > 0 �̏ꍇ
					System.out.println("<");
				}
			}
		}
	}
}
