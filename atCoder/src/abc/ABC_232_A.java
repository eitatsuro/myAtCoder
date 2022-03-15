package abc;

import java.util.Scanner;


public class ABC_232_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			String s = sc.next();
			int a = Character.getNumericValue(s.charAt(0));
			int b = Character.getNumericValue(s.charAt(2));
			
			System.out.println(a*b);
			

		}
	}

}