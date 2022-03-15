package abc;

import java.util.Scanner;


public class ABC_217_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {


			String S = sc.next();
			String T = sc.next();
			
			if (S.compareTo(T) < 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			
		}
	}
}