package abc;

import java.util.Scanner;

public class ABC_285_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			String S = sc.next();
			
			System.out.print(S.replace("na", "nya"));

		}
	}
}
