package abc;

import java.util.Scanner;


public class ABC_211_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if ( 0 < a && b == 0) {
				System.out.println("Gold");
			} else if ( 0 < b && a == 0 ) {
				System.out.println("Silver");
			} else {
				System.out.println("Alloy");
			}
		}
	}
}