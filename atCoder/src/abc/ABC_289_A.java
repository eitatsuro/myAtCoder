package abc;

import java.util.Scanner;

public class ABC_289_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			
			for( int i=0; i<s.length(); i++) {
				if ( s.charAt(i) == '0') {
					System.out.print(1);
				} else {
					System.out.print(0);
				}
			}

		}
	}
}
