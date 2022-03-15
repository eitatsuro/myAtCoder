package abc;

import java.util.Scanner;


public class ABC_214_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt(); // ŠJÃ‰ñŸ

			if (1 <= n && n <= 125) {
				System.out.println(4);
			} else if (126 <= n && n <=211) {
				System.out.println(6);
			} else if (212 <= n  && n <=214) {
				System.out.println(8);
			}


		}
	}
}