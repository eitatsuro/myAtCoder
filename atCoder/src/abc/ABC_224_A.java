package abc;

import java.util.Scanner;


public class ABC_224_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			String s = sc.next();
			if (s.toLowerCase().endsWith("er")) {
				System.out.println("er");
			} else {
				System.out.println("ist");
			}
			
			
		}
	}
}