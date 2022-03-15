package abc;

import java.util.Scanner;


public class ABC_218_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {


			int n = sc.nextInt();
			String S = sc.next();
			
			char ans = S.charAt(n-1);
			
			if ( ans == "o".charAt(0) || ans == "ÅZ".charAt(0) ) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			
		}
	}
}