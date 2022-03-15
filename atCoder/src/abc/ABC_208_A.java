package abc;

import java.util.Scanner;

public class ABC_208_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if ( a <= b &&  b <= 6*a) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
