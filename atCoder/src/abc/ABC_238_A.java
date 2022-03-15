package abc;

import java.util.Scanner;

public class ABC_238_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			
			if ( n > 2*Math.log(n)/Math.log(2) ) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			

		}
	}

}