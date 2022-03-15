package abc;

import java.util.Scanner;


public class ABC_209_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int a = sc.nextInt(); // A
			int b = sc.nextInt(); // B
			
			// 
			if ( a < b ) {
				System.out.println(b-a+1);				
			} else {
				System.out.println(0);
			}
			
		}
	}
}