package abc;

import java.util.Scanner;


public class ABC_225_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			String s = sc.next();
			char[] c = s.toCharArray();

			if ( c[0] == c[1] && c[1] == c[2] ) {
				System.out.println(1);
			} else if (c[0]==c[1] || c[1]==c[2] || c[2]==c[0]) {
				System.out.print(3);
			} else {
				System.out.print(6);
			}
			
		}
	}
}